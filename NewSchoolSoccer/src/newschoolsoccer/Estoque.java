/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;

import java.util.List;

/**
 *
 * @author Antônio Henrique Passamai Penizollo 
 * @author Braulio Silva Mendes Lucas 
 * @author João Victor Dutra Balboa 
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */
public class Estoque {

    ///
    
    private List<Item> itens;
    
    int idC;

    public Estoque() {
        idC=0;
        ///Nome,quantidade,preco,ID
        Item bola = new Item("Bola",0,50,idC);
        itens.add(bola);
        idC++;
        Item cone = new Item("Cone",0,5,idC);
        itens.add(cone);
        idC++;
        Item colete = new Item("Colete",0,15,idC);
        itens.add(colete);
        idC++;
        
    }
    
    
    public void addItemEstoque(String nome, int qnt,float preco){
        idC++;
        Item itemNovo = new Item(nome,qnt,preco,idC);
        
        itens.add(itemNovo);
    }
    
    public void imprimirEstoque(){
        
        for(Item item : itens){
            System.out.println("Nome : "+ item.getNome());
            System.out.println("Quantidade : "+ item.getQuantidade());
        }
        
    }
    
    public void retirarItem(int qnt, int id){
        
        itens.get(id).alterarQuantidade(-qnt);
    }
    
    
    
}
