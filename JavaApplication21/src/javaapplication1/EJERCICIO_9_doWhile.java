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
public class EJERCICIO_9_doWhile {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        int i = 0;
        int num,suma;
        
        suma = 0;
        
        do {
            
            System.out.println("Ingrese el numero " + i);
            num = leer.nextInt();
            
            if (num == 0){
                System.out.println("Se capturo el numero cero");
                break;
            }
            
            if (num >= 0){
                suma = suma + num;
            }
            
            i++;
            
        } while (i < 20);
        
        System.out.println("El resultado de la suma de los numeros ingresados es: " + suma);
        
    }
}
