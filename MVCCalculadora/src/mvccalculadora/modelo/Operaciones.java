/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvccalculadora.modelo;
import java.util.*;
/**
 *
 * @author Daniel Vargas
 */
public class Operaciones {
    public int sumar (int num1, int num2){
        
        return num1 + num2;
        
    }
    
    ///////////////////////////////////////////////////////////////
    
    public int restar (int num1, int num2){
        
        return num1 - num2;
        
    }
    
      ///////////////////////////////////////////////////////////////
    
    public int multiplicar (int num1, int num2){
        
        return num1 * num2;
        
    }
    
      ///////////////////////////////////////////////////////////////
    
    public int dividir (int num1, int num2){
        try{
       
            return num1 / num2;
        }
        catch(ArithmeticException e){
            System.out.print(e.getMessage());
        }
        return -1;
    }
    public int promedio (int num1, int num2){
        
        return (sumar(num1, num2) / 2);
        
    }
    
    public int raiz1 (int num1){
        double num3 = (double) num1;
        double resultado1 = Math.sqrt(num3);
        int resultado3 = (int) resultado1;
        return resultado3;  
    }
    
    public int raiz2 (int num2){
        double num4 = (double) num2;
        double resultado2 = Math.sqrt(num4);
        int resultado4 = (int) resultado2;
        return resultado4;  
    }
}
