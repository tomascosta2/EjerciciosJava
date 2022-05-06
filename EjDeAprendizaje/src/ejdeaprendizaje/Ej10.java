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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el limite de la suma:");
        int limite = leer.nextInt();
        int suma = 0;
        
        do {
            
            System.out.println("Ingrese el numero a sumar:");
            suma = suma + leer.nextInt();
            
        } while (suma < limite);
        
        System.out.println("El resultado de la suma es:" + suma);
        
    }
    
}
