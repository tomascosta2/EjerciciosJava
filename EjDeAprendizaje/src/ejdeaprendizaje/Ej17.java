/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejdeaprendizaje;
/**
 *
 * @author TOMAS
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        digitos();
        
    }
    
    //------
    
    public static void digitos(){
        
        int[] vector = new int[50];
        int unDigito = 0, dosDigito = 0, tresDigito = 0, cuatroDigito = 0, cincoDigito = 0;
        
        for (int i = 0; i < 10; i++){
            vector[i] = 1;
        }
        for (int i = 10; i < 20; i++){
            vector[i] = 11;
        }
        for (int i = 20; i < 35; i++){
            vector[i] = 111;
        }
        for (int i = 35; i < 40; i++){
            vector[i] = 1111;
        }
        for (int i = 40; i < 50; i++){
            vector[i] = 11111;
        }
        
        for (int i = 0; i < 50; i++){
            
            if (vector[i] / 10 < 1){
                
                unDigito = unDigito + 1;
                
            } else if (vector[i] / 100 < 1){
                
                dosDigito = dosDigito + 1;
                
            } else if (vector[i] / 1000 < 1){
                
                tresDigito = tresDigito + 1;
            
            } else if (vector[i] / 10000 < 1){
                
                cuatroDigito = cuatroDigito + 1;
            
            } else if (vector[i] / 100000 < 1){
                
                cincoDigito = cincoDigito + 1;
            
            } 
        }
        
        System.out.println("Hay " + unDigito + " posiciones con numeros de un digito");
        System.out.println("Hay " + dosDigito + " posiciones con numeros de dos digitos");
        System.out.println("Hay " + tresDigito + " posiciones con numeros de tres digitos");
        System.out.println("Hay " + cuatroDigito + " posiciones con numeros de cuatro digitos");
        System.out.println("Hay " + cincoDigito + " posiciones con numeros de cinco digitos");
    }
    
}
