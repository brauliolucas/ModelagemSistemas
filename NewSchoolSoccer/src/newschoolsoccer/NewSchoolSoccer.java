/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import InterfacesGraficas.Logar;
import InterfacesGraficas.TelaLogin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


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

    List<Professor> professores = Util.LoadDatabase("professores.bin");
    List<Aluno> alunos = Util.LoadDatabase("alunos.bin");
    List<Escalacao> escalacoes = Util.LoadDatabase("escalacoes.bin");

    if(professores == null) {
            System.out.println("Lista professores vazia, inicializando padrao");
            professores = new ArrayList<>();

            professores.add(new Professor(1200f, "joao da silva",new Date(1990,01,01), "rua abc", "12345678"));

    }
    
    if(escalacoes == null){
        escalacoes = new ArrayList<>();
    }

    if(alunos == null) {
            System.out.println("Lista alunos vazia, inicializando padrao");
            alunos = new ArrayList<>();

            alunos.add(new Aluno(1.6f,"Ronaldinho",new Date(1990,01,01), "rua das couves", "12345678", "Meio-Campo"));


        for(Escalacao escalacao : escalacoes){
            for(Aluno aluno : escalacao.alunos){
                System.out.println(aluno.nome);
            }
        }
        for (Professor professor : professores) {
                System.out.println(professor.nome);
        }

        for (Aluno aluno : alunos) {
                System.out.println(aluno.nome);
        }
        Util.SaveDatabase("escalacoes.bin", escalacoes);
        Util.SaveDatabase("professores.bin", professores);
        Util.SaveDatabase("alunos.bin", alunos);

    }   
        
    TelaLogin tela = new TelaLogin(new Logar());
    tela.setVisible(true);
    
    }
}