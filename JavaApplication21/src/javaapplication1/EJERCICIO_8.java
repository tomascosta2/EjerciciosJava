/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author TOMAS
 */
public class EJERCICIO_8 {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
    
        int nota = 11;
    
        while (nota > 10 || nota < 0){
        
          System.out.println("Ingrese la nota: ");
          nota = leer.nextInt();
          
        }
        
    }
    
}
