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
 * @author Antônio Henrique Passamai Penizollo 
 * @author Braulio Silva Mendes Lucas 
 * @author João Victor Dutra Balboa 
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */
public class Escalacao {
    
    private int categoria;
    public List<Aluno> alunos;
    
    
    
    public void mostrarEscalacao(){
        System.out.println("Categoria : sub"+categoria);
        
        this.alunos.forEach((aluno) -> {
            System.out.println("\n Nome : " + aluno.nome + "\n idade : " + aluno.categoria);
        });

    }
    
    
    public void editarEscalacao(Aluno a1){
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Pressione 1 pra add aluno e 0 para remover da escalação");
        System.out.println("Aluno : " + a1.getNome());
            
        //Inserir
        switch (keyboard.nextInt()) {
            case 1:   
                alunos.add(a1);
                break;
            case 0:
                alunos.remove(a1);
                break;
            default:
                System.out.println("input invalido");
                break;
        }

}
    
    
    
}
