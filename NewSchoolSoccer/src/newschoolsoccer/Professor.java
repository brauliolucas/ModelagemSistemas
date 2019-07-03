/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Antônio Henrique Passamai Penizollo 
 * @author Braulio Silva Mendes Lucas 
 * @author João Victor Dutra Balboa 
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */
public class Professor extends Pessoa implements Serializable{


    
    private static String pwProf;
    private static String pwAdemir;
    private static String emailProf;
    private static String emailAdemir;
    
    private float salario; 

    public Professor(float salario, String nome , String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.salario = salario;
    }
    

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public static String getPwProf() {
        return pwProf;
    }

    public static void setPwProf(String pwProf) {
        Professor.pwProf = pwProf;
    }

    public static String getPwAdemir() {
        return pwAdemir;
    }

    public static void setPwAdemir(String pwAdemir) {
        Professor.pwAdemir = pwAdemir;
    }

    public static String getEmailProf() {
        return emailProf;
    }

    public static void setEmailProf(String emailProf) {
        Professor.emailProf = emailProf;
    }

    public static String getEmailAdemir() {
        return emailAdemir;
    }

    public static void setEmailAdemir(String emailAdemir) {
        Professor.emailAdemir = emailAdemir;
    }

    

    public void controlePresenca(Aluno alunos[]) {

        for (Aluno aluno : alunos) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Aluno : " + aluno.getNome());
            
            int x = keyboard.nextInt();
            
            Boolean presenca;

            if (x == 0) {
                presenca = false;
            } else {
                presenca = true;
            }

            aluno.frequencia.add(presenca);
        }

    }
    

    
    
    
    
    

}
