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

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {  // 
      
        
        int notas [] = new int[4]  ; // 20 bytes [1,2,3,5] + notas
        
        try {
            int sumatoria = 0;  //4 bytes
            for (int i = 0; i < notas.length; i++) { // 4 bytes
                sumatoria += notas[i];
            }
            int promedio = 0;  //4 bytes 
            
            promedio = sumatoria / notas.length;
            System.out.println("promedio: " + promedio); // 20 bytes
            
            Arrays.sort(notas);//
            
            System.out.println("");//
            
            System.out.println("------");// 12 bytes
            for (int j = 0; j < notas.length; j++) { // 4 bytes
                System.out.println("notas:[" + j + "] = " + notas[j]);  // 22 bytes * (N)  
                
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
