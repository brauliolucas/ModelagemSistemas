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
public class Estoque {
    ///
    private int bola;
    private int colete;
    private int cone;
    
    public void retirarItem(int qnt, int id){
        
        switch(id){
            case 1: bola = bola - qnt;
                    break;
            case 2: colete = colete - qnt;
                    break;
            case 3: cone = cone - qnt;
                    break;
            default: break;
        }
 
}
    
    public void addItem(int qnt, int id){
                
        switch(id){
            case 1: bola = bola - qnt;
                    break;
            case 2: colete = colete - qnt;
                    break;
            case 3: cone = cone - qnt;
                    break;
            default: break;
        }  
    
    
}
    
    public void imprimirEstoque(){
        System.out.println("Quantidade de bolas : " + bola);
        System.out.println("Quantidade de coletes : " + colete);
        System.out.println("Quantidade de cones : " + cone);
    
    }
    
    
    
    
}
