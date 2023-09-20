/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author ucr
 */
public class Rayquaza  extends Personaje implements BandaFocus{

    public Rayquaza() {
    }

    public Rayquaza(int evs, int vida, int ataque, int defensa, 
            String estadisticas, String genero, String id, String nombre,
            String tipo) {
        super(evs, vida, ataque, defensa, estadisticas, genero, id, nombre, tipo);
    }

  
    
    

    @Override
    public void atacar() {
      System.out.println("Rayquaza esta eliminando ... "); 
    }

    @Override
    public void defender() {
         System.out.println("Rayquaza esta defendiendo"); 
   }

    @Override
    public void subirNivel() {
          System.out.println("Rayquaza ha subido de nivel"); 
    }
    
    @Override
    public String toString() {
        return "Rayquaza: "+ super.toString();
    }

    @Override
    public int proteccionVida1() {      
        super.setVida(1);
        return super.getVida();
    }
}
