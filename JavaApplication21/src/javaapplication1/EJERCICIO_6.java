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
public class EJERCICIO_6 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el num1");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el num2");
        int num2 = leer.nextInt();
        
        if(num1 > 25 || num2 > 25){
            System.out.println("Uno de los numeros es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
        
    }
    
}
