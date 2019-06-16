/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Braulio
 */
public class Escalacao {
    
    private int categoria;
    private List<Aluno> alunos;
    
    
    
    public void mostrarEscalacao(){
        System.out.println("Categoria : sub"+categoria);
        
        this.alunos.forEach((aluno) -> {
            System.out.println("\n Nome : " + aluno.nome + "\n idade : " + aluno.categoria);
        });

    }
    
    
    public void editarEscalacao(Aluno a1){
    
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Aluno : " + a1.getNome());
            
        //Inserir
        alunos.add(a1);   
        
        //Excluir        
        alunos.remove(a1);

}
    
    
    
}
