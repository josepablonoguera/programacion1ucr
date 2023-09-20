/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author ucr
 */
public class Pikachu extends Personaje implements BandaFocus, InterfazParaRayo {

    public Pikachu() {
    }

    public Pikachu(int evs, int vida, int ataque, int defensa,
            String estadisticas, String genero, String id, 
            String nombre, String tipo) {
        super(evs, vida, ataque, defensa, estadisticas, genero, id, nombre, tipo);
    }

   

    @Override
    public void atacar() {
        System.out.println("Pikachu esta atacando");
    }

    @Override
    public void defender() {
        System.out.println("Pikachu esta defendiendo");
    }

    @Override
    public void subirNivel() {
        System.out.println("Pikachu ha subido de nivel");

    }

    @Override
    public String toString() {
        return "Pikachu: " + super.toString();
    }

    @Override
    public int proteccionVida1() {
        super.setVida(1);
        return super.getVida();
    }

    @Override
    public void subirAtaqueElectrico(int valorRayo) {
   
        super.setAtaque(super.getAtaque()+ valorRayo);
        
    
    }

}
