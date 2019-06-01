/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

/**
 *
 * @author ice
 */
public class Professor extends Pessoa {
    
    private int cargo; // controle por ID
    private float salario;
    
    
    
    
    public void controlePresenca(Aluno alunos[]){
        
        
        for(int i=0;i<alunos.length;i++){
            
            alunos[i].frequencia.add(Boolean.TRUE);
                
        }
        
        
    }
    
    
    
}
