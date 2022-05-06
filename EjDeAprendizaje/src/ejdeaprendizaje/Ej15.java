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
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[100];
        int j = -1;
        
        for (int i = 100; i > 0; i--){
            
            j = j + 1;
            
            vector[j] = i;
            
            System.out.println(vector[j]);
                    
        }
        
    }
    
}
