/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_10;
import java.util.Scanner;

/**
 *
 * @author TOMAS
 */

public class EJERCICIO_10 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        int num, i;
        
        for (i = 0; i == 3; i++){
            
            System.out.println("Ingresar un numero entre 1 y 20:");
            num = leer.nextInt();
            
            System.out.print(num + " ");
            
            for (int j = 0; j == num; j++){
                System.out.println("*");
            }
            
        }
        
    }
}