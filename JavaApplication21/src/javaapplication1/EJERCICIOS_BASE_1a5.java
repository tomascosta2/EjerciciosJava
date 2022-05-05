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
public class EJERCICIOS_BASE_1a5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // EJERCICIO 1 - 2
        byte miPrimerByte = 1;
        short miPrimerShort = 2;
        int miPrimerInt = 3;
        long miPrimerLong = 4;
        boolean miPrimerBoolean = true;
        String miPrimerString = "perros";
        
        
        //DETECCION DE ERRORES 1
        int numero = 48;
        double decimales = 3.55;
        boolean bandera = false;
        
        
        // EJERCICIO 3
        int suma = miPrimerByte + miPrimerShort;
        miPrimerBoolean = suma > miPrimerShort;
        
        System.out.println(suma + "er puesto");
        
        //EJERCICIO 4
        String nombre = "Tomas";
        int edad = 19;
        
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");

        System.out.println("Con sout + tab hacemos un print");
        
        //EJERCICIO 5 
        
        Scanner leer = new Scanner(System.in);
        
        boolean boleano = leer.nextBoolean();
        double doble = leer.nextDouble();
        
        //DETECCION DE ERRORES 2
        
        Scanner leer1 = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad");
        String nombre1 = leer1.nextLine();

        System.out.println("Ingresa tu nombre");
        int edad1 = leer1.nextInt();
        
        //EJERCICIO 6
        
        Scanner leer2 = new Scanner(System.in);
        
        System.out.println("Ingrese el num1");
        int num1 = leer2.nextInt();
        
        System.out.println("Ingrese el num2");
        int num2 = leer2.nextInt();
        
        if(num1 > 25 || num2 > 25){
            System.out.println("Uno de los numeros es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
        
    }
    
}
