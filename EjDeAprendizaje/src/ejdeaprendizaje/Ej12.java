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
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int valida = 0;
        int total = 0;
        
        while (i >= 0){
            
            System.out.println("Ingrese una cadena de 5 caracteres");
            String cadena = leer.nextLine();
            
            
            if (cadena.length() == 5 && cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O")){
            
                System.out.println("Cadena valida");
                valida = valida + 1;
            
            } else if(cadena.equals("&&&&&")){
            
                break;
            
            } else {
            
                System.out.println("Cadena invalida");
            
            }
            
            total = total + 1;
            
        }
        
        System.out.println("Se ingresaron " + valida + " cadenas validas y " + (total - valida) + " cadenas invalidas");
        
    }
    
}
