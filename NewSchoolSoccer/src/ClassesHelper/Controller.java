/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesHelper;

import java.sql.Date;
import java.util.ArrayList;
import newschoolsoccer.Aluno;
import newschoolsoccer.Escalacao;
import newschoolsoccer.Item;
import newschoolsoccer.Professor;

/**
 *
 * @author John
 */
public class Controller {
    
    public static ArrayList<Professor> professores;
    public static ArrayList<Aluno> alunos;
    public static ArrayList<Escalacao> escalacoes;
    public static ArrayList<Item> itens;
    
    
    public static void iniciarDB(){
     
    professores = Util.LoadDatabase("professores.bin");
    alunos = Util.LoadDatabase("alunos.bin");
    escalacoes = Util.LoadDatabase("escalacoes.bin");
    itens = Util.LoadDatabase("materiais.bin");    
        
    if(professores == null) {
            System.out.println("Lista professores vazia, inicializando padrao");
            professores = new ArrayList<>();
            Professor.setPwAdemir("123");
            Professor.setPwProf("123");
            Professor.setEmailAdemir("noreply.newschoolsoccer@gmail.com");
            Professor.setEmailProf("noreply.newschoolsoccer@gmail.com");

            professores.add(new Professor(1200f, "joao da silva", "rua abc", "12345678"));

    }
    
    if(escalacoes == null){
        escalacoes = new ArrayList();
        escalacoes.add(new Escalacao(14));
        escalacoes.add(new Escalacao(17));
        escalacoes.add(new Escalacao(20));
    }

    if(alunos == null) {
        System.out.println("Lista alunos vazia, inicializando padrao");
        alunos = new ArrayList<>();

        
        escalacoes.get(0).alunos.add((new Aluno(160,"Ronaldinho",new Date(2000,1,1), "rua das couves", "12345678", "Meio-Campo")));
//        for(Escalacao escalacao : escalacoes){
//            for(Aluno aluno : escalacao.alunos){
//                System.out.println(aluno.getNome());
//            }
//        }
//        for (Professor professor : professores) {
//                System.out.println(professor.getNome());
//        }
//
//        for (Aluno aluno : alunos) {
//                System.out.println(aluno.getNome());
//        }
//        Util.SaveDatabase("escalacoes.bin", escalacoes);
//        Util.SaveDatabase("professores.bin", professores);
//        Util.SaveDatabase("alunos.bin", alunos);
    }
    
    if(itens == null){
        itens = new ArrayList<>();
        itens.add(new Item("Bola",0, 50));
    }
    
    
    
    
    }
    
    
}
