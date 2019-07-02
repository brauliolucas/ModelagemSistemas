/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antônio Henrique Passamai Penizollo 
 * @author Braulio Silva Mendes Lucas 
 * @author João Victor Dutra Balboa 
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */

public class Util {

	public static <T> void SaveDatabase(String fileName, List<T> lista) {
		File file = new File(fileName);
	    try (ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(file))) {
	    	ostream.writeObject(lista);
	    } catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> ArrayList<T> LoadDatabase(String fileName) {
		ArrayList<T> database = null;
		ObjectInputStream binario;
		try {
			binario = new ObjectInputStream(new FileInputStream(fileName));
			database = (ArrayList<T>) binario.readObject();
			binario.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return database;
	}

}
