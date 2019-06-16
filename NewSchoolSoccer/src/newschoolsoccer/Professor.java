/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Professor extends Pessoa {
    
    private int cargo; // controle por ID
    private float salario;
    
    
    
    
    public void controlePresenca(Aluno alunos[]){
        
        
        for (Aluno aluno : alunos) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Aluno : " + aluno.getNome());
            int x = keyboard.nextInt();
            Boolean presenca;
            
            if(x == 0) presenca = false;
            
            else presenca = true;
            
            aluno.frequencia.add(presenca);
        }
        
        
    }
    
    
    
}
