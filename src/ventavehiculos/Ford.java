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
public class Ford extends Carro {
    
    public Ford(String color, String modelo) {
        super(color, modelo);
    }
    
    @Override
    public void imprimir(){
        System.out.println("Ford");
    }
}
