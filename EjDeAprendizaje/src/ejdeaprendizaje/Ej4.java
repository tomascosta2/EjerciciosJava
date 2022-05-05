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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar la temperatura en Celcius");
        int celcius = leer.nextInt();
        
        System.out.println(celcius + " grados celcius equivale a " + (32 + (9 * celcius / 5)) + " grados fahrenheit");
        
    }
    
}
