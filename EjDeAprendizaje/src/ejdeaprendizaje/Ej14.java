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
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        conversor();
        
    }
    
    public static void conversor(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad en euros a convertir");
        int euro = leer.nextInt();
        
        System.out.println("__Convertir a:");
        System.out.println("1. libra");
        System.out.println("2. dolar");
        System.out.println("3. yen");
        
        int choice = leer.nextInt();
        
        switch(choice){
            case 1:
                System.out.println(euro + " euros son " + (euro * 0.86) + " libras");
            case 2:
                System.out.println(euro + " euros son " + (euro * 1.28611) + " dolares");
            case 3:
                System.out.println(euro + " euros son " + (euro * 129.852) + " yenes");
        }
    }
    
}
