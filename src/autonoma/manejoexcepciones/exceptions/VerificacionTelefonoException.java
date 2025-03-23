/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.manejoexcepciones.exceptions;

/**
 *
 * @author Valerie Moreno
 * @since 3/22/2025
 */
public class VerificacionTelefonoException extends RuntimeException{

    public VerificacionTelefonoException() {
        super("Todos los campos deben estar llenos");
    }
}
