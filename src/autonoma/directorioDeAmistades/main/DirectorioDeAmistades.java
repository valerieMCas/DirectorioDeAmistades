/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioDeAmistades.main;

import autonoma.directorioDeAmistades.moldels.Persona;
import autonoma.directorioDeAmistades.views.VentanaPrincipal;
import autonoma.directorioDeAmistades.moldels.Directorio;

import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class DirectorioDeAmistades {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Directorio directorio= new Directorio();
        
        VentanaPrincipal ventana= new VentanaPrincipal(directorio);
        ventana.setVisible(true);
    }    
}
