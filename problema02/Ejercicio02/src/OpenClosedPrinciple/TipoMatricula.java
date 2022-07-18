/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OpenClosedPrinciple;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class TipoMatricula {
    private double promedioMatriculas;
    private ArrayList<Matricula> lista;

    public void establecerLista(ArrayList<Matricula> l) {
        lista = l;
    }
    public ArrayList<Matricula> obtenerLista(){
        return lista;
    }
    
    public void establecerPromedioTarifas(){
        double suma = 0;
        for (int i = 0; i < obtenerLista().size(); i++) {
            suma = suma + obtenerLista().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / obtenerLista().size();
    }
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String c = "";
        String cadena;
        
        for(int i = 0; i < obtenerLista().size(); i++) {
           c = String.format("%s\nTarifa: %.2f\n"
                   ,c
                   ,obtenerLista().get(i).toString()
           ); 
        }
        cadena = String.format("Lista de tarifas: %s\n"
                +"Promedio total de tarifas: %.2f\n"
                ,c
                ,obtenerPromedioTarifas()
        );
        return cadena;
    }
}
