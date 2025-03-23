/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioDeAmistades.main;

import autonoma.directorioDeAmistades.moldels.Persona;
import autonoma.directorioDeAmistades.views.VentanaPrincipal;

/**
 *
 * @author marti
 */
public class DirectorioDeAmistades {
    private String nombre;
    private String telefono;
    private String correo;
    Persona persona = new Persona(nombre,telefono,correo);
        
    VentanaPrincipal ventana = new VentanaPrincipal(persona);
    ventana.setVisible(true);
}
