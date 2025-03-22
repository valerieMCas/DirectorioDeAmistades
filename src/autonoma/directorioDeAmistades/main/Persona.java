/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioDeAmistades.main;

/**
 *
 * @author marti
 */
public class Persona {
    //Atributos
    private String nombre;
    private String telefono;
    private String correo;

    //Contructor
    public Persona(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    // Getters
    
    // Devuelve el nombre del amigo
    public String getNombre() {
        return nombre;
    }
    // Devuelve el teléfono del amigo
    public String getTelefono() {
        return telefono;
    }
    // Devuelve el correo electrónico del amigo
    public String getCorreo() {
        return correo;
    }
    
    
}
