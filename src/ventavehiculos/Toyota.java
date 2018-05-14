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
public class Toyota extends Carro {

    public Toyota(String color, String modelo) {
       super(color, modelo);
    }
    
    @Override
    public void imprimir(){
        System.out.println("Toyota");
    }
    
    public void volar(){
        System.out.println("Estoy volando");
    }
}
