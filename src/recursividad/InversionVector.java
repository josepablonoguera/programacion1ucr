/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Arrays;

public class InversionVector {

    /**
     * Invierte un vector de enteros de manera recursiva.
     *
     * Este método utiliza la técnica de recursividad para invertir un vector.
     * Intercambia los elementos en las posiciones de inicio y fin, y luego
     * realiza una llamada recursiva con los índices actualizados hasta que se
     * invierte completamente el vector.
     *
     * @param vector El vector de enteros que se va a invertir.
     * @param inicio El índice del primer elemento del subvector actual.
     * @param fin El índice del último elemento del subvector actual.
     *
     * @throws ArrayIndexOutOfBoundsException Si se proporcionan índices fuera
     * del rango del vector.
     *
     * @since 1.0
     */
    public static void invertirVector(int[] vector, int inicio, int fin) {
        if (inicio < fin) {

            int temp = vector[inicio]; // burbuja
            vector[inicio] = vector[fin];
            vector[fin] = temp;

            invertirVector(vector, inicio + 1, fin - 1);
        }
    }

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        imprimirVector(vector, 0);

        //invertirVector(vector, 0, vector.length - 1);
        //duplicarVector(vector); 
        int[] duplicado = multiplicadorVectorRecursivo(vector, new int[vector.length], 0, 2);

        imprimirVector(duplicado, 0);

        //imprimirVector(vector, 0);
    }

    public static void multiplicadorVector(int vector[]) {

        int x = 2;

        int[] vectorDuplicado = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            vectorDuplicado[i] = vector[i] * x;
        }

        for (int i = 0; i < vectorDuplicado.length; i++) {
            System.out.println(vectorDuplicado[i]);
        }

    }

    /**
     * Multiplica cada elemento de un vector por un escalar de manera recursiva.
     *
     * Este método toma un vector de enteros y un escalar, y multiplica cada
     * elemento del vector por el escalar de forma recursiva. El resultado se
     * almacena en un nuevo vector, que se pasa como parámetro.
     *
     * @param vector El vector de enteros que se va a multiplicar.
     * @param duplicado El vector donde se almacenarán los resultados de las
     * multiplicaciones.
     * @param i Índice actual del vector en el que se está realizando la
     * multiplicación.
     * @param x Escalar por el cual se multiplicarán los elementos del vector.
     * @return Un nuevo vector que contiene el resultado de multiplicar cada
     * elemento del vector original por el escalar.
     *
     * @throws IndexOutOfBoundsException Si el índice 'i' es menor que 0 o mayor
     * que el tamaño del vector menos 1.
     *
     * Ejemplo de uso: int[] vector = {1, 2, 3, 4}; int[] duplicado = new
     * int[vector.length]; int escalar = 2; int[] resultado =
     * multiplicadorVectorRecursivo(vector, duplicado, 0, escalar);
     */
    public static int[] multiplicadorVectorRecursivo(int vector[], 
            int duplicado[], int i, int x) throws IndexOutOfBoundsException {
       
        if (i < 0 || i >= vector.length) {
            throw new IndexOutOfBoundsException("El índice está fuera de "
                    + "los límites del vector.");
        }

      
        if (i == vector.length - 1) {
            duplicado[i] = vector[i] * x;
            return duplicado;
        }

        // Realiza la multiplicación y llama recursivamente al siguiente índice del vector
        duplicado[i] = vector[i] * x;
        
        return multiplicadorVectorRecursivo(vector, duplicado, i + 1, x);
    }

    public static void imprimirVector(int[] vector, int indice) {

        if (indice == vector.length) {
            System.out.println(); // Salto de línea al final del recorrido
            return;
        }

        System.out.print(vector[indice] + " ");

        imprimirVector(vector, indice + 1);
    }
}
