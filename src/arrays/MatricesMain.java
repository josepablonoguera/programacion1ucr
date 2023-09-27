/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author ucr
 */
public class MatricesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tablero [][] = {
            {1,2,3,4,5,6,7,8},
            {1,2,3,4,5,6,7,8},
            {1,2,3,4,5,6,7,8},
            {1,2,3,4,5,6,7,8},
            {1,2,3,4,5,6,7,8},
            {1,2,3,4,5,6,7,8},
            {1,2,3,4,5,6,7,8},
            {1,2,3,4,5,6,7,8}
        };
        
        recorrerMatriz(tablero);
        
        
       
        
    }

    private static void recorrerMatriz(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(" "+tablero[i][j]);
            }
            System.out.println("");
        }
    }
    
}
