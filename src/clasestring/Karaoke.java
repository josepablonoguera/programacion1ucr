/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasestring;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ucr
 */
public class Karaoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String datos = "Letra: José María Zeledón    ,     Música: Manuel María Gutiérrez";
        String cancion = ""
                + "-Noble patria, tu hermosa bandera "
                + "-expresión de tu vida nos da;"
                + "-bajo el límpido azul de tu cielo"
                + "-blanca y pura descansa la paz."
                + "-En la lucha tenaz, de fecunda labor"
                + "-que enrojece del hombre la faz,"
                + "-conquistaron tus hijos labriegos sencillos "
                + "-eterno prestigio, estima y honor."
                + "-¡Salve, oh tierra gentil! "
                + "-¡Salve, oh madre de amor!"
                + "-Cuando alguno pretenda"
                + "-tu gloria manchar, "
                + "-verás a tu pueblo valiente y viril, "
                + "- la tosca herramienta en arma trocar."
                + "-Salve oh Patria tú pródigo suelo,"
                + "-dulce abrigo y sustento nos da;"
                + "-bajo el límpido azul de tu cielo "
                + "-¡vivan siempre el trabajo y la paz!";

//        System.out.println("Datos= " + datos);
//        System.out.println("cancion = " + cancion);
//        getDataSong(datos);// Splits
//        getDataSongWithSubString(datos);
          play(cancion);
//        findWord(cancion);

//        StringBuilder strB = new StringBuilder(cancion);
//        strB=strB.reverse();
//        System.out.println(strB);
    }

    private static void findWord(String cancion) {
        System.out.println("");
        if (cancion.toUpperCase().contains("madre".toUpperCase())) {
            System.out.println("Si existe la palabra");
        } else {
            System.out.println("NO existe la palabra");
        }
    }

    private static void play(String cancion) {
        System.out.println("");
        String[] versos = cancion.split("-");
        for (int i = 0; i < versos.length; i++) {
            String palabras[] = versos[i].trim().split(" ");

            for (int j = 0; j < palabras.length; j++) {
                System.out.print(" "+palabras[j]);
                int time = 500;
                if (palabras[j].contains("Salve")) {
                    time=1500;
                }
                try {
                    Thread.sleep(time);
                } catch (InterruptedException ex) {
                    System.out.println("Excepción de interrupcion ");
                }
            }
            System.out.println("");
            if (versos[i].trim().endsWith(".")) {
                System.out.println("");
            }

        }
    }

    private static void getDataSongWithSubString(String datos) {

        int alaComa = datos.indexOf(",");
        System.out.println(datos.substring(0, alaComa).trim().split(":")[0].
                trim() + ":");
        System.out.println(datos.substring(0, alaComa).trim().split(":")[1].
                trim());
        System.out.println(datos.substring(alaComa + 1, datos.length()).trim().
                split(":")[0].trim() + ":");
        System.out.println(datos.substring(alaComa + 1, datos.length()).trim().
                split(":")[1].trim());
    }

    private static void getDataSong(String datos) {
        String[] datosCancion = datos.split(",");
        for (int i = 0; i < datosCancion.length; i++) {
            System.out.println(datosCancion[i].trim().split(":")[0].trim());
            System.out.println(datosCancion[i].trim().split(":")[1].trim());
        }
    }

}
