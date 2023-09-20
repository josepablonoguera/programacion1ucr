/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author ucr
 */
public abstract class Personaje {

    private int evs;
    private int vida;
    private int ataque;
    private int defensa;

    private String estadisticas;
    private String genero;
    private String id;
    private String nombre;
    private String tipo;

    public abstract void atacar();
    
    public abstract void defender();
    
    public abstract void subirNivel();
    
    
    public Personaje() {
        this.evs = 0;
        this.vida = 0;
        this.ataque=0;
        this.defensa=0;
        this.estadisticas = "No tiene";
        this.genero = "No tiene";
        this.id ="No tiene";
        this.nombre = "No tiene";
        this.tipo = "No tiene";
    }    

    public Personaje(int evs, int vida, int ataque, int defensa, String estadisticas, String genero, String id, String nombre, String tipo) {
        this.evs = evs;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.estadisticas = estadisticas;
        this.genero = genero;
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * @return the evs
     */
    public int getEvs() {
        return evs;
    }

    /**
     * @param evs the evs to set
     */
    public void setEvs(int evs) {
        this.evs = evs;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa the defensa to set
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * @return the estadisticas
     */
    public String getEstadisticas() {
        return estadisticas;
    }

    /**
     * @param estadisticas the estadisticas to set
     */
    public void setEstadisticas(String estadisticas) {
        this.estadisticas = estadisticas;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return " {" + "evs=" + evs + ", vida=" + vida + ", ataque=" +
                ataque + ", defensa=" + defensa + ", estadisticas=" +
                estadisticas + ", genero=" + genero + ", id=" + id +
                ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    
    
    
    

}
