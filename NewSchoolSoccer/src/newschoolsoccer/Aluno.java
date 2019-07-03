/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Antônio Henrique Passamai Penizollo 
 * @author Braulio Silva Mendes Lucas 
 * @author João Victor Dutra Balboa 
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */
public class Aluno extends Pessoa implements Serializable{

    public ArrayList<Boolean> frequencia;
    protected int mensalidade; //quantidade de meses sem pagar
    protected float altura;
    protected int categoria;
    protected boolean status; //0 = inativo 1 = ativo
    protected String posicao;

    public Aluno(String nome, Date nascimento, String endereco, String telefone) {
        super(nome, nascimento, endereco, telefone);
    }

    public Aluno(float altura, String nome, Date nascimento, String endereco, String telefone, String posicao) {
        super(nome, nascimento, endereco, telefone);
        this.mensalidade = 1;
        this.altura = altura;
        this.status = true;
        this.posicao = posicao;
        this.status = true;
        geraCategoria();
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    
    
    
    public void geraCategoria() {
        //define datas

        int x = Calendar.getInstance().YEAR - nascimento.getYear();
        if(x <= 14){
            x = 14;
        }else{
            if(x <= 17){
                 x = 17;
            }else{
                x = 20;
            }
        }
        
        
        
        this.setCategoria(x);
    }

    public float calculaMensalidade() {

        float valor = 50;

        return mensalidade * valor;
    }

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
