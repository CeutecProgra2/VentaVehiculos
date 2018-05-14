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
public class Moto extends Vehiculo {
    private int posicion;
    public String color;
    public String modelo;

    public Moto(String color, String modelo) {
        this.posicion =0;
        this.color = color;
        this.modelo = modelo;
    }
    
    @Override
    public void avanzar() {
        this.posicion += 2;
    }

    @Override
    public void retroceder() {
        this.posicion -=2;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Moto");
    }

    @Override
    public void imprimirPosicion() {
        System.out.println("Posicion: " + this.posicion);
    }
}
