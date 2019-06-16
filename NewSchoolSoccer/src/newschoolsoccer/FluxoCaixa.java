/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

/**
 *
 * @author Braulio
 */
public class FluxoCaixa {
    
    protected float creditoMensalidades;
    protected float contasAPagar;
    protected float dinheiroemcaixa;

    protected void retirarCaixa(float valor) {
        dinheiroemcaixa = dinheiroemcaixa - valor;
    }

    protected void addDinheiroCaixa(float valor) {
        dinheiroemcaixa = dinheiroemcaixa + valor;
    }

    protected void gerarCreditoMensalidades(Aluno alunos[]) {
        for (Aluno aluno : alunos) {
            if (aluno.status) {
                creditoMensalidades += aluno.calculaMensalidade();

            }

        }

    }

    protected void addContaAPagar(int valor) {
        contasAPagar += valor;
    }

    protected void pagarContas() {

        System.out.println("Valor em caixa : " + dinheiroemcaixa);
        System.out.println("Valor contas a pagar : " + contasAPagar);

        if (contasAPagar > dinheiroemcaixa) {
            System.out.println("Dinheiro insuficiente pra pagar todas as contas");
            contasAPagar -= dinheiroemcaixa;
            dinheiroemcaixa = 0;
            System.out.println("Valor de contas restantes : " + contasAPagar);
        } else {
            System.out.println("Dinheiro suficiente para pagar todas as contas");
            contasAPagar = 0;
            dinheiroemcaixa -= contasAPagar;
            System.out.println("Dinheiro atual em caixa : " + dinheiroemcaixa);
        }

    }

}
