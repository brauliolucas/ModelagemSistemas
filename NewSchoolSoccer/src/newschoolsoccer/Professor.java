/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Professor extends Pessoa {

    private int login; // controle por ID 0 Admin 1 Professor
    private float salario; 

    public Professor(float salario, String nome, String endereco, String telefone, int login) {
        super(nome, endereco, telefone);
        this.login = login + 3000;
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

    public int getLogin() {
        return login;
    }

    public float getSalario() {
        return salario;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    

}
