/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejdeaprendizaje;

import java.util.Scanner;

/**
 *
 * @author TOMAS
 */
public class Ej1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero a sumar:");
        int num1 = leer.nextInt();
        
        System.out.println("Ingresa el segundo numero a sumar:");
        int num2 = leer.nextInt();
        
        System.out.println("El resultado de la suma de los dos numeros es:" + (num1 + num2));
        
    }
    
}
