/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import SingleResponsibilityPrinciple.*;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) {
       
        Televisor t1 = new Televisor("LG-14 pulgadas",300.2);
//        t1.establecerMarca("LG-14 pulgadas");
//        t1.establecerPrecio(300.2);

        Televisor t2 = new Televisor("SAMSUMG-21 pulgadas",1300.2);
//        t2.establecerMarca("SAMSUMG-21 pulgadas");
//        t2.establecerPrecio(1300.2);

        Televisor t3 = new Televisor("RIVIERA-29 pulgadas",2300.5);
//        t3.establecerMarca("RIVIERA-29 pulgadas");
//        t3.establecerPrecio(2300.5);

        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);
        
        Operaciones o = new Operaciones();
        o.establecerTele(tvs);
        
        o.establecerTeleMasCaro(tvs);
        o.establecertotalPrecioTvs(tvs);
        o.establecerListaMarcas(tvs);
        
        System.out.println(o);
        
//        System.out.println("-----------------");
//        System.out.printf("%.2f\n", t1.totalPrecioTvs(tvs));
//        System.out.printf("%s\n", t1.listaMarcasVendidas(tvs));

    }
}
