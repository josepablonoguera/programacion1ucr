/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author ucr
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        if (numeral(5) == 15) {
//            System.out.println("el numeral de 5 si es 15");
//        } else {
//            System.out.println("no es numeral" + numeral(5));
//        }

        System.out.println("Numeral Recursivo: "+ numeralRecursivo(5));

//        int vector[] = {100, 50, 50};
//        int res = sumaVector(vector, vector.length - 1);
//        System.out.println("res = " + res);
//        double promedio = promedioVector(vector, vector.length - 1, 0);
//        System.out.println("promedio = " + promedio);
    }
    
    public static int sumaVector(int vector[], int i) {
        
        if (i == 0) {
            return vector[0];
        }
        
        return vector[i] + sumaVector(vector, i - 1);
        
    }
    
    public static int factorial(int n) {
        
        if (n == 1) {
            return 1;
        }
        
        return (n * factorial(n - 1));
    }

    /**
     * +
     * iterativo
     *
     * @param n
     * @return
     */
    public static int numeral(int n) {
        
        int resp = 0;
        
        for (int i = n; i >= 0; i--) {
            resp = resp + i;
        }
        
        return resp;
        
    }
    
    public static int numeralRecursivo(int n) {
        
        // [10,2,3,4,5,6,7,8,9,1 ]
         //  x = 10
         //
        
        
        if (n == 1) { 
            return n;
        }
        
        return n + numeralRecursivo(n - 1);
    }
    
    public static int potencia(int base, int exponente) {
        
        if (exponente == 0) {
            return 1;
        }
        
        if (exponente == 1) {
            return base;
        }
        
        return base * potencia(base, exponente - 1);
        
    }
    
    private static double promedioVector(int[] vector, int i, int suma) {
        
        if (i == 0) {
            suma = suma + vector[i];
            return suma / vector.length;
        }
        
        suma = suma + vector[i];
        
        return promedioVector(vector, i - 1, suma);
    }
    
}
