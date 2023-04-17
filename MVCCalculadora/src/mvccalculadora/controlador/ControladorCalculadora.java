/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvccalculadora.controlador;

/**
 *
 * @author Daniel Vargas
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvccalculadora.modelo.Operaciones;
import mvccalculadora.vista.Calculadora;

public class ControladorCalculadora implements ActionListener{
    private int num1;
    private int num2;
    private int resultado;
    private Calculadora vista;
    private Operaciones modelo;
 
     //En el constructor inicializamos nuestros objetos y tambien
     //añadimos el ActionListener  a los botones de accion que se encuentran en la VISTA
     public ControladorCalculadora( Calculadora vista , Operaciones modelo){
         this.vista = vista;
         this.modelo = modelo;
         this.vista.jButton1.addActionListener(this);//los botones deben ser publicos en la vista.
         this.vista.jButton2.addActionListener(this);
         this.vista.jButton3.addActionListener(this);
         this.vista.jButton4.addActionListener(this);
         this.vista.jButton5.addActionListener(this);
         this.vista.jButton6.addActionListener(this);
         this.vista.jButton7.addActionListener(this);
         this.vista.jButton8.addActionListener(this);
     }
    //La accion del boton de la VISTA es capturado
     public void actionPerformed(ActionEvent e) {
                
         leer();
         
         if(e.getActionCommand().equals("+")){
            resultado = modelo.sumar(num1, num2);
         }
         else if(e.getActionCommand().equals("-")){
            resultado = modelo.restar(num1, num2);
         }
         else if(e.getActionCommand().equals("*")){
            resultado = modelo.multiplicar(num1, num2);
         }
         else if(e.getActionCommand().equals("/")){
            resultado = modelo.dividir(num1, num2);
         }
         else if(e.getActionCommand().equals("Promedio")){
            resultado = modelo.promedio(num1, num2);
         }
         else if(e.getActionCommand().equals("Raiz numero 1")){
            resultado = modelo.raiz1(num1);
         }
         else if(e.getActionCommand().equals("Raiz numero 2")){
            resultado = modelo.raiz2(num2);
         }
         else if(e.getActionCommand().equals("Limpiar entradas de texto")){
             vista.jTextField1.setText(null);
             vista.jTextField2.setText(null);
         }
            
         vista.jTextField3.setText( String.valueOf(resultado));
         
     }
     
     public void leer(){
         try{
            num1 = Integer.valueOf( vista.jTextField1.getText());
            num2 = Integer.valueOf( vista.jTextField2.getText());
         }
         catch(NumberFormatException e){
             num1 = 0;
             num2 = 0;
         }
     }

}
