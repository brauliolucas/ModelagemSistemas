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
public class Pessoa {

    String nome;
    Date nascimento;
    String endereco;
    String telefone;

    public Pessoa(String nome, Date nascimento, String endereco, String telefone) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
