/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Antônio Henrique Passamai Penizollo 
 * @author Braulio Silva Mendes Lucas 
 * @author João Victor Dutra Balboa 
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */
public class Professor extends Pessoa {


    private float salario; 

    public Professor(float salario, String nome, Date nascimento, String endereco, String telefone) {
        super(nome, nascimento, endereco, telefone);
        this.salario = salario;
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
    
    public void gerarEscalacao(Aluno alunos[]){
            
       Escalacao escalacao1 = new Escalacao();
       for(Aluno aluno : alunos){
        escalacao1.editarEscalacao(aluno);
        
       }
    
    }
    
    
    

}
