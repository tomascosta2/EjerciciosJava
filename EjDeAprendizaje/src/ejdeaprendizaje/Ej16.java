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
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        buscar();
        
    }
    
    public static void buscar(){
        
        int[] vector = new int[5];
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el numero a buscar:");
        int numero = leer.nextInt();
        
        for (int i = 0; i < 5; i++){
            vector[i] = i + 1;
        }
        
        for (int i = 0; i < 5; i++){
            
            if (vector[i] == numero){
                
                System.out.println("El numero " + numero + " se encuentra en la posicion " + i);
                
            }
            
            if (i == 4){
                break;
            }
            
        }
        
    }
    
}
