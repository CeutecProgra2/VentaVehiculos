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
public class VentaVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntoDeVenta p = new PuntoDeVenta(8);
        Toyota t = new Toyota("Rojo", "Corolla");
        p.agregarVehiculo(t);
        Ford f = new Ford("Azul", "Escape");
        p.agregarVehiculo(f);
        Italica i = new Italica("Rosado", "125");
        p.agregarVehiculo(i);
        p.imprimirVehiculos();
        p.venderVehiculo(1);
        p.imprimirVehiculos();
    }
    
}
