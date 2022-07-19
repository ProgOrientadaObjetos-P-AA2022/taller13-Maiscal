/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependencyInversionPrinciple;


/**
 *
 * @author maisc
 */
public class Outlook implements DominioG{
    private String dominio;
    
    @Override
    public void establecerDominio(){
        dominio = "outlook.com";
    }
    
    @Override
    public String obtenerDominio(){
        return dominio;
    }
}
