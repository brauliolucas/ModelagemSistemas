/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date;
/**
 *
 * @author Antônio Henrique Passamai Penizollo 
 * @author Braulio Silva Mendes Lucas 
 * @author João Victor Dutra Balboa 
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */
public class Transacao implements Serializable{
    
    int tipo;  ///0 = credito , 1 = debito
    float valor;
    Date data;

    public Transacao(int tipo, float valor, Date data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        
        
        
        
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
    
    
}
