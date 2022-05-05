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
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine();
        
        if ((cadena.substring(0,1)).equals("A")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
        
    }
    
}
