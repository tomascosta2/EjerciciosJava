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
public class EJERCICIO_7 {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de motor");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1: 
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para ese tipo de bomba");
        }
        
        
    }
    
}
