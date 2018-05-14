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
public class Carro extends Vehiculo{
    public String color;
    public String modelo;
    private int posicion;
    
    public Carro(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
        this.posicion = 0;
    }
    
    @Override
    public void avanzar(){
        this.posicion++;
    }
    
    @Override
    public void retroceder(){
        this.posicion--;
    }
    
    @Override
    public void imprimirPosicion(){
        System.out.println("Posicion: " + this.posicion);
    }
    
    @Override
    public void imprimir(){
        System.out.println("Carro");
    }
    
}
