/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10_for;
import java.util.Scanner;

/**
 *
 * @author TOMAS
 */
public class EJERCICIO_10_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        for (int i = 0; i < 4; i++){
            
            System.out.println("Ingresar un numero entre 1 y 20:");
            num = leer.nextInt();
            
            System.out.print(num + " ");
            
            for (int j = 0; j < num; j++){
                System.out.print("*");
            }
            
            System.out.println("");
            
        }
        
    }
    
}
