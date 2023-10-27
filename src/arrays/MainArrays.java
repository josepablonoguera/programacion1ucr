/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author ucr
 */
public class MainArrays {

    static  int notas []  ;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        
        try {
            int sumatoria = 0;
            for (int i = 0; i < notas.length; i++) {
                sumatoria += notas[i];
            }
            int promedio = 0;
            
            promedio = sumatoria / notas.length;
            System.out.println("promedio: " + promedio);
            
            Arrays.sort(notas);
            
            System.out.println("");
            
            System.out.println("------");
            for (int j = 0; j < notas.length; j++) {
                System.out.println("notas:[" + j + "] = " + notas[j]);
            }
        } 
     
        catch (ArithmeticException ae) {
            System.out.println("ArithmeticException"+ ae.getLocalizedMessage());
        }
        finally{
            System.out.println("Terminó programa");
        }
    }
    
 
}
