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
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        
        
        for (int i = 0; i > -1; i++){
            
            System.out.println("--------MENU--------");
            System.out.println("__Elija una opcion:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
        
            int choice = leer.nextInt();
            
            if (choice < 5 && choice > 0){
                
                switch (choice){
                case 1:
                   System.out.println("El resultado de la suma es: " + (num1 + num2));
                   break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El resultado de la división es: " + (num1 / num2));
                    break;
                }
                
            } else if (choice == 5){
                
                System.out.println("Esta seguro que desea salir? (S/N)");
                
                if (salida().equals("S")){
                    break;
                }
                
            } else {
                
                System.out.println("La opcion no es valida");
                
            }
        }
        
        
        
    }
    
    public static String salida(){
        
        Scanner leer = new Scanner(System.in);
        
        return leer.nextLine();
        
    }
    
    
}
