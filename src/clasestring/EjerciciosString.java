/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasestring;

/**
 *
 * @author ucr
 */
public class EjerciciosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
       String string = "Hola Mundo estudiante";//['H','o'....]
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));
        }
        
        
        string = string.replace(' ','-');
        String sinEspacios="";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)!='-') {
                sinEspacios= sinEspacios + string.charAt(i);
            }
        }
        System.out.println("\nSin espacios: "+ sinEspacios.toLowerCase());
        System.out.println("\nstring = " + string);
        
        String palabra1= "Pablo";
        String palabra2 = new String("pablo");
        if (palabra1.compareToIgnoreCase(palabra2) == 0) {
            System.out.println("palabra1");
        }else{
            System.out.println("palabra2");
        }
     
       
    }
    
}
