/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Antônio Henrique Passamai Penizollo 
 * @author Braulio Silva Mendes Lucas 
 * @author João Victor Dutra Balboa 
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */
public class FluxoCaixa implements Serializable{
    
    protected float creditoMensalidades;
    protected float contasAPagar;
    protected float dinheiroemcaixa;
    private ArrayList<Transacao> transacoes;
    private Date calendario;
    
    public static Date gerarDataAtual(){
        int dia = Calendar.getInstance().DAY_OF_MONTH;
        int mes = Calendar.getInstance().MONTH;
        int ano = Calendar.getInstance().YEAR;
        return new Date(ano,mes,dia);
    }
    
    public void retirar(float valor){
         Transacao t = new Transacao(1,valor,gerarDataAtual());
         transacoes.add(t);
        
    }
    
    public void entrada(float valor){
        
        Transacao t = new Transacao(0,valor,gerarDataAtual());
         transacoes.add(t);
     
    }

    public void gerarCreditoMensalidades(Aluno alunos[]){
        
        
        for (Aluno aluno : alunos){creditoMensalidades+=aluno.calculaMensalidade();}

    }
    
    public void addContasAPagar(float valor){
        
        contasAPagar+=valor;
        
    }
    
    public void pagarContas(){
        
        if(contasAPagar > dinheiroemcaixa){
            System.out.println("Dinheiro insuficiente pra pagar todas as contas");
            
            Transacao t = new Transacao(1,contasAPagar,gerarDataAtual());
            transacoes.add(t);
            
            contasAPagar -= dinheiroemcaixa;
            dinheiroemcaixa = 0;
            
            System.out.println("Valor de contas restantes : " + contasAPagar);
            
        }
        else {
            
            System.out.println("Dinheiro suficiente para pagar todas as contas");
            
            Transacao t = new Transacao(1,contasAPagar,gerarDataAtual());
            transacoes.add(t);
            
            dinheiroemcaixa -= contasAPagar;
            contasAPagar = 0;   
            
            System.out.println("Dinheiro atual em caixa : " + dinheiroemcaixa);
        }
        
    }
    
    public String gerarRelatorio(Date data1, Date data2){
        String relatorio = "";
        for(Transacao transacao : transacoes){
            
            if(data1.compareTo(transacao.data)<0 && data2.compareTo(transacao.data)>=0){
                
                
                if(transacao.tipo==0){
                    relatorio+="\nValor : +" + transacao.valor;
                    relatorio+="\nTipo : Credito";
                }
                
                else{
                    relatorio+="\nValor : -" + transacao.valor;
                    relatorio+="\nTipo : Debito";
                }
            }
        }
        
        return relatorio;
    }
    
    public ArrayList getPeriodo(Date data1, Date data2){
        ArrayList<Transacao> periodo = new ArrayList();
        for(Transacao transacao : transacoes){
            
            if(data1.compareTo(transacao.data)<0 && data2.compareTo(transacao.data)>=0){
                periodo.add(transacao);
 
            }
        }
        
       return periodo; 
    }
    
    
}
