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
public class ValidarCamposLlenosException extends RuntimeException{

    public ValidarCamposLlenosException() {
        super("El numero de telefono debe comenzar en 606 o 30");
    }
}