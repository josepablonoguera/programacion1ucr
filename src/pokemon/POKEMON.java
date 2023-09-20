/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokedex.Personaje;
import pokedex.Pikachu;
import pokedex.Rayquaza;

/**
 *
 * @author ucr
 */
public class POKEMON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje pokemones[] = new Personaje[4];
        for (int i = 0; i < pokemones.length; i++) {
            System.out.println("Personaje: " + (i + 1));
            Personaje personaje = crearPersonaje();
            if (personaje != null) {
                pokemones[i] = personaje;
            } else {
                i--;
            }
        }

        pelear(pokemones);
    }

    private static void imprimirPersonajes(Personaje[] pokemones) {
        int i = 1;
        for (Personaje pokemone : pokemones) {

            System.out.println("[ " + i + " ] -> " + pokemone.toString());
            i++;

        }
    }

    private static Personaje crearPersonaje() {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("¿Qué Pokemon quieres?");
        System.out.println("1. Pikachu");
        System.out.println("2. Rayquaza");
        int opc = 0;
        try {
            opc = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            System.out.println("Problemas en el ingreso de opción");
        } catch (NumberFormatException ex) {
            System.out.println("No ingresó una opción numérica válida");
        }

        switch (opc) {
            case 1:
                Pikachu pika = new Pikachu(1, 100,100,100, "Alguna de pikachu",
                        "macho", "1", "Pikachu de Ash", "Eléctrico");
                return pika;
            case 2:
                Rayquaza ray = new Rayquaza(1, 200,200,200, "Alguna de Rayquaza",
                        "No tiene", "2", "Rayquaza", "Volador Dragon");
                return ray;

            default:
                return null;

        }

    }

    private static void pelear(Personaje[] pokemones) {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
         Personaje luchadores[] = new Personaje[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Selecciona el pokemon");
            imprimirPersonajes(pokemones);
           
            int opc = 0;
            try {
                opc = Integer.parseInt(br.readLine());
            } catch (IOException ex) {
                System.out.println("Problemas en el ingreso de opción");
            } catch (NumberFormatException ex) {
                System.out.println("No ingresó una opción numérica válida");
            }
            
            luchadores[i] = pokemones[opc - 1];
        }
        System.out.println("Luchadores: ");
     
        for (int i = 0; i < luchadores.length; i++) {
            System.out.println(luchadores[i].toString());
            
            luchadores[i].atacar();
            System.out.println("");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println("Error en espera de ataque");
            }
            
        }
       
       
        
        
    }

}
