/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;
import java.util.Scanner;

/**
 *
 * @author TOMAS
 */
public class EJERCICIO_12 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el primer numero");
        int num2 = leer.nextInt();
        
        EsMultiplo(num1,num2);
        
    }
    
    public static void EsMultiplo(int num1, int num2){
        
        if (num1 % num2 == 0){
            System.out.println("El primer numero es multiplo del segundo numero");
        } else {
            System.out.println("Los numeros ingresados no son multiplos");
        }
        
    }
    
}
