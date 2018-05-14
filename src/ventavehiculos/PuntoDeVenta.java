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
public class PuntoDeVenta {
    public Vehiculo vehiculos [];

    public PuntoDeVenta(int cantidad) {
        this.vehiculos = new Vehiculo[cantidad];
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
       for(int i = 0; i< this.vehiculos.length; i++){
           if(this.vehiculos[i] == null){
               this.vehiculos[i] = vehiculo;
                return;
           }
       }
    }
    
    public void venderVehiculo(int posicion){
         if(posicion < this.vehiculos.length){
            this.vehiculos[posicion] = null;
         }
    }
    
    public void imprimirVehiculos(){
        for(int i =0; i< this.vehiculos.length; i++){
            if (this.vehiculos[i] != null) {
                 this.vehiculos[i].imprimir();
            }  
        }
    }
    
}
