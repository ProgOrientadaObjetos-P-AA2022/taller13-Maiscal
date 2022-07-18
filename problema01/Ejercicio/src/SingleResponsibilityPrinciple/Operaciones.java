/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleResponsibilityPrinciple;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Operaciones {
    private ArrayList<Televisor> tele;
    private double totalPrecio;
    private double teleMasCaro;
    private String listaMarcas;

    public void establecerTele(ArrayList<Televisor> t) {
        tele = t;
    }
    public ArrayList<Televisor> obtenerTele(){
     return tele;   
    }
    
    public void establecertotalPrecioTvs(ArrayList<Televisor> t){
        totalPrecio = 0;
        for (int i = 0; i < t.size(); i++) {
            totalPrecio = totalPrecio + t.get(i).obtenerPrecio();
        }
    }
    public double obtenerTotalPrecioTvs(){
        return totalPrecio;
    }
    
    public void establecerTeleMasCaro(ArrayList<Televisor> t){
        teleMasCaro = t.get(0).obtenerPrecio();
        for (int i = 1; i < t.size(); i++) {
            if(teleMasCaro <= t.get(i).obtenerPrecio()){
                teleMasCaro =  t.get(i).obtenerPrecio();    
            }
        }
    }
    public double obtenerTeleMasCaro(){
        return teleMasCaro;
    }
    
    public void establecerListaMarcas(ArrayList<Televisor> t){
        listaMarcas = "";
        for (int i = 0; i < t.size(); i++) {
            listaMarcas = String.format("%s%s\n"
                    ,listaMarcas
                    ,t.get(i).obtenerMarca());
        }
    }
    public String obtenerListaMarcas(){
        return listaMarcas;
    }    
    
    @Override
    public String toString() {
        String c = "";
        String cadena;
        for(int i = 0; i < obtenerTele().size();i++){
            c = String.format("%s\nNombre del TV: %s\n"
                    + "Edades: %.2f\n"
                    ,c
                    ,obtenerTele().get(i).obtenerMarca()
                    ,obtenerTele().get(i).obtenerPrecio()
            );
        }
        cadena = String.format("Lista de Tvs...\n"
                + "%s\n"
                + "Lista de marcas Vendidas.. \n"
                + "%s\n"
                + "Total del precio de Tvs: %.2f\n"
                + "Televisor mas caro: %.2f\n"
                ,c
                ,obtenerListaMarcas()
                ,obtenerTotalPrecioTvs()
                ,obtenerTeleMasCaro()
        );
        return cadena;
    }
    
}
