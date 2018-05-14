/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculos;

/**
 *
 * @author cvare
 */
public class Italica extends Moto {
    
    public Italica(String color, String modelo) {
        super(color, modelo);
    }
    
    @Override
    public void imprimir(){
        System.out.println("Italika");
    }
    
}
