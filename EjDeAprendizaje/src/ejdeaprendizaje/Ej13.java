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
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension que quiere para los lados de su cuadrado:");
        int dimension = leer.nextInt();
        
        for (int i = 0; i < dimension; i++){
            
            System.out.print("*");
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < dimension - 2; i++){
            
            System.out.print("*");
            
            for (int j = 0; j < dimension - 2; j++) {
                
                System.out.print(" ");
                
            }
            
            System.out.print("*");
            
            System.out.println("");
        }
        
        for (int i = 0; i < dimension; i++){
            
            System.out.print("*");
            
        }
        
        System.out.println("");
        
    }
    
}
