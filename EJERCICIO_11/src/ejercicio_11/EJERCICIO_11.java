/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;
import java.util.Scanner;

/**
 *
 * @author TOMAS
 */
public class EJERCICIO_11 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de caracteres");
        String cadena = leer.nextLine();
        
        int num = 1;
        
        
        
        System.out.println(codificar(cadena));
        
    }
    
    public static String codificar(String cadena){
     
        String cadenaModificada = "";
        
        for (int i = 0; i < cadena.length(); i++){
            
            switch(cadena.substring(i,i + 1)){
            case "a":
                 System.out.print(cadenaModificada.concat("@"));
                 break;
            case "A":
                 System.out.print(cadenaModificada.concat("@"));
                 break;
            case "e":
                 System.out.print(cadenaModificada.concat("#"));
                 break;
            case "E":
                 System.out.print(cadenaModificada.concat("#"));
                 break;
            case "i":
                 System.out.print(cadenaModificada.concat("$"));
                 break;
            case "I":
                 System.out.print(cadenaModificada.concat("$"));
                 break;
            case "o":
                 System.out.print(cadenaModificada.concat("%"));  
                 break;
            case "O":
                 System.out.print(cadenaModificada.concat("%"));  
                 break;
            case "u":
                 System.out.print(cadenaModificada.concat("*"));
                 break;
            case "U":
                 System.out.print(cadenaModificada.concat("*"));
                 break;
            default:
                 System.out.print(cadenaModificada.concat(cadena.substring(i,i + 1)));
            }
            
        }
        
        return cadenaModificada;
        
    }
    
}

