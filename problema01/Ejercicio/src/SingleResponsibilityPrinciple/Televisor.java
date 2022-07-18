/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleResponsibilityPrinciple;


/**
 *
 * @author reroes
 */
public class Televisor {

    private String marca;
    private double precio;
    
    public Televisor(String m, double p){
        marca = m;
        precio = p;
    }
    
    public void establecerMarca(String m){
        marca = m;
    }
    public void establecerPrecio(double m){
        precio = m;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    public double obtenerPrecio(){
        return precio;
    }
}
