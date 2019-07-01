/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import InterfacesGraficas.Logar;
import InterfacesGraficas.TelaLogin;
import java.sql.*;
import java.util.List;


/**
 *
 * @author ice
 */
public class NewSchoolSoccer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //start();
        
        TelaLogin tela = new TelaLogin(new Logar());
        tela.setVisible(true);
    }
    
    public static void start(){
        
        Estoque estoque = new Estoque();
        
        List<Aluno> alunos;
        
        
    }

}