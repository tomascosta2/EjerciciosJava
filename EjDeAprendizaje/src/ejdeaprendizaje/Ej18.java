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
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
                
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 1;
                System.out.print( "[" + matriz[i][j] + "]");
            }
            System.out.println("");
            
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 2;
                System.out.print( "[" + matriz[i][j] + "]");
            }
            System.out.println("");
            
        }
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 3;
                System.out.print( "[" + matriz[i][j] + "]");
            }
            System.out.println("");
            
        }
        
        System.out.println("-----------------");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print( "[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
                
    }
    
}
