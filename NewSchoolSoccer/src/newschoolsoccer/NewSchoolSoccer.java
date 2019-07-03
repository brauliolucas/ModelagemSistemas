/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import ClassesHelper.Controller;
import InterfacesGraficas.Logar;
import InterfacesGraficas.TelaLogin;


/**
 *
 * @author Antônio Henrique Passamai Penizollo 
 * @author Braulio Silva Mendes Lucas 
 * @author João Victor Dutra Balboa 
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */
public class NewSchoolSoccer {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        
        Controller.iniciarDB();
        TelaLogin tela = new TelaLogin(new Logar());
        tela.setVisible(true);
    
    }
}