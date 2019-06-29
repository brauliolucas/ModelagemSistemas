/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Braulio
 */
public class FluxoCaixa {
    
    protected float creditoMensalidades;
    protected float contasAPagar;
    protected float dinheiroemcaixa;
    private List<Transacao> transacoes;
    private Calendar calendario;
    
    
    
    protected void retirar(float valor){
         Transacao t = new Transacao(1,valor);
         transacoes.add(t);
        
    }
    
    protected void entrada(float valor){
        
        Transacao t = new Transacao(0,valor);
         transacoes.add(t);
     
    }

    protected void gerarCreditoMensalidades(Aluno alunos[]){
        
        
        for (Aluno aluno : alunos){creditoMensalidades+=aluno.calculaMensalidade();}

    }
    
    protected void addContasAPagar(float valor){
        
        contasAPagar+=valor;
        
    }
    
    protected void pagarContas(){
        
        if(contasAPagar > dinheiroemcaixa){
            System.out.println("Dinheiro insuficiente pra pagar todas as contas");
            
            Transacao t = new Transacao(1,contasAPagar);
            transacoes.add(t);
            
            contasAPagar -= dinheiroemcaixa;
            dinheiroemcaixa = 0;
            
            System.out.println("Valor de contas restantes : " + contasAPagar);
            
        }
        else {
            
            System.out.println("Dinheiro suficiente para pagar todas as contas");
            
            Transacao t = new Transacao(1,contasAPagar);
            transacoes.add(t);
            
            dinheiroemcaixa -= contasAPagar;
            contasAPagar = 0;   
            
            System.out.println("Dinheiro atual em caixa : " + dinheiroemcaixa);
        }
        
    }
    
    protected void gerarRelatorio(Calendar data){
        
        for(Transacao transacao : transacoes){
            
            if(data.compareTo(transacao.data)<0){
                System.out.println("Transacoes antes de : " + data);
                System.out.println("Data : " + transacao.data);
                
                if(transacao.tipo==0){
                    System.out.println("Valor : +" + transacao.valor);
                    System.out.println("Tipo : Credito");
                }
                
                else{
                    System.out.println("Valor : -" + transacao.valor);
                    System.out.println("Tipo : Debito");
                }
            }
        }
        
        
    }
    
    
}
