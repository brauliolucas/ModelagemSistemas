/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.util.*;

/**
 *
 * @author ice
 */
public class Aluno extends Pessoa {

    public List<Boolean> frequencia;
    protected int mensalidade; //quantidade de meses sem pagar
    protected float altura;
    protected int categoria;
    protected boolean status; //0 = inativo 1 = ativo
    protected String posicao;

    public Aluno(String nome, String endereco, String telefone, Date nascimento, int mensalidade, float altura, String posicao) {
        super(nome, nascimento, endereco, telefone);
        status = true;
        this.frequencia = new ArrayList<>();
        this.altura = altura;
        this.mensalidade = mensalidade;
        this.posicao = posicao;
        geraCategoria();
    }

    public void geraCategoria() {

        int x=0;
        
        
        
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

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPosicao() {
        return posicao;
    }

}
