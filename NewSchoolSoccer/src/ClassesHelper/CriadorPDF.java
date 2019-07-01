/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesHelper;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author John
 */
public abstract class CriadorPDF {
    public static void criarPDF(String texto, String nomeArquivo){
        Document arquivoPDF = new Document();
        try {
            PdfWriter.getInstance(arquivoPDF, new FileOutputStream(nomeArquivo));
            arquivoPDF.open();
            
            arquivoPDF.add(Image.getInstance(String.format("src/InterfacesGraficas/EscudoMenor.png")));
            arquivoPDF.add(new Paragraph(texto));
            

        } catch (DocumentException | FileNotFoundException ex) {
            System.out.println("Erro! "+ex);
        } catch (IOException ex) {
            System.out.println("Erro! "+ex);
        } finally {
            arquivoPDF.close();
        }
        
        try {
            Desktop.getDesktop().open(new File(nomeArquivo));
        } catch (IOException ex) {
            System.out.println("Erro! "+ex);
        }
    }
}
