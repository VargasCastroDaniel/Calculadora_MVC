/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvccalculadora;

/**
 *
 * @author Daniel Vargas
 */

import mvccalculadora.controlador.ControladorCalculadora;
import mvccalculadora.modelo.Operaciones;
import mvccalculadora.vista.Calculadora;

public class MVCCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones modelo = new Operaciones();
        Calculadora vista = new Calculadora();   
         
        ControladorCalculadora controlador = new ControladorCalculadora( vista , modelo );
        
        vista.setVisible(true);

    }
    
}
