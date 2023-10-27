/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import java.util.Comparator;

/**
 *
 * @author ucr
 */
public class Votante  {

    private String cedula;   //   c�dula del ciudadano               |
    private String codeLec;    // C�digo Electoral donde est� inscrito |
    private String relleno;     //            
    private String fechaCaducidad; // Fecha vencimiento de la c�dula       |
    private String junta;      // # Junta Receptora de Votos           |
    private String nombre;     // Nombre completo del ciudadano        |
    private String primerApellido;  //Primer apellido                      |
    private String segundoApellido;  //Segundo apellido  

    public Votante() {
    }

    public Votante(String cedula, String codeLec, String relleno,
            String fechaCaducidad, String junta, String nombre,
            String primerApellido, String segundoApellido) {
        this.cedula = cedula;
        this.codeLec = codeLec;
        this.relleno = relleno;
        this.fechaCaducidad = fechaCaducidad;
        this.junta = junta;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodeLec() {
        return codeLec;
    }

    public void setCodeLec(String codeLec) {
        this.codeLec = codeLec;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getJunta() {
        return junta;
    }

    public void setJunta(String junta) {
        this.junta = junta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    
    public String getNombreCompleto() {
        return this.nombre+" "+this.primerApellido+ " "+this.segundoApellido ;
    }

    @Override
    public String toString() {
        return "Votante{" + "cedula=" + cedula + ", codeLec=" + codeLec + ", relleno=" + relleno + ", fechaCaducidad=" + fechaCaducidad + ", junta=" + junta + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + '}';
    }

   

}


