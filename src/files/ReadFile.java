/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package files;
// Import the Scanner class to read text files

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ReadFile {

    public static void main(String[] args) {
        ArrayList<Votante> votantes = new ArrayList();
        votantes= getDataVotantes(votantes);
        int buscado = encuentraVotante(votantes, "Marcelle");
        System.out.println("iguales = " + buscado);
        
      
    }

    private static ArrayList<Votante> getDataVotantes(ArrayList<Votante> votantes) {
       
        try {
            BufferedReader br
                    = new BufferedReader(
                            new FileReader(
                                    "C:\\Users\\ucr\\Downloads\\padron_completo\\PADRON_COMPLETO.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String dataVotante[] = line.split(",");
                Votante nuevo = new Votante(
                        dataVotante[0].trim(),
                        dataVotante[1].trim(),
                        dataVotante[2].trim(),
                        dataVotante[3].trim(),
                        dataVotante[4].trim(),
                        dataVotante[5].trim(),
                        dataVotante[6].trim(),
                        dataVotante[7].trim()
                );
                votantes.add(nuevo);
            }

        } catch (Exception e) {

        }
        System.out.println("Votantes: " + votantes.size());
        
        return votantes;
    }

    private static int encuentraVotante(ArrayList<Votante> votantes,
            String nCompleto) {
        int c=0;
        for (int i = 0; i < votantes.size(); i++) {
           if (votantes.get(i).getNombre().equalsIgnoreCase(nCompleto)) {
               c++;
            }
        }
        
        return c;
        
    }
}
