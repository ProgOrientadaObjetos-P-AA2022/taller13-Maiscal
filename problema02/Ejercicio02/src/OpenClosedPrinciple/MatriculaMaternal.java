/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenClosedPrinciple;

/**
 *
 * @author reroes
 */
public class MatriculaMaternal extends Matricula{
        
    @Override
    public void establecerTarifa(){
        // tarifa = costo desayunos + costo almuerzo + costo medico
        tarifa = 50.2 + 40.2 + 80.2;
    }
        
    @Override
    public double obtenerTarifa(){
        return tarifa;
    }
    
    @Override
    public String toString() {
        String c = String.format("Tarifa: %.2f\n"
                ,obtenerTarifa()
        );
        return c;
    }
}