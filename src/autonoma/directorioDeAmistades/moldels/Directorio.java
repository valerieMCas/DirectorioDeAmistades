/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioDeAmistades.moldels;

import autonoma.manejoexcepciones.exceptions.MismoAmigoException;
import autonoma.manejoexcepciones.exceptions.SeEncuentraAmigoException;
import autonoma.manejoexcepciones.exceptions.ValidarCamposLlenosException;
import autonoma.manejoexcepciones.exceptions.VerificacionTelefonoException;
import autonoma.manejoexcepciones.exceptions.VerificaionCorreoException;
import java.util.ArrayList;

/**
 *
 * @author Valerie Moreno
 * @since 3/22/2025
 */
public class Directorio {
    ///////////////////////////////////////////////////////////////////////
    //////Atributos
    private ArrayList <Persona> listaAmigos;
    ///////////////////////////////////////////////////////////////////////
    //////Construtor
    public Directorio() {
        this.listaAmigos = new ArrayList<>();
    }
    public Directorio(ArrayList<Persona> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }   
    ///////////////////////////////////////////////////////////////////////
    //////Metodos de aceso
    public ArrayList<Persona> getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(ArrayList<Persona> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }
    
    ///////////////////////////////////////////////////////////////////////
    //////Metodos
    
    public void agregarAmigo(Persona persona) throws MismoAmigoException, ValidarCamposLlenosException, VerificaionCorreoException,VerificacionTelefonoException{
        //try{//intentar validar
            String telefonoLimpio = persona.getTelefono().trim().replaceAll("\\D", "");
            if (persona.getCorreo().trim().isEmpty() || persona.getNombre().trim().isEmpty() || persona.getTelefono().trim().isEmpty()){
                throw new ValidarCamposLlenosException();
            }
            if( persona.getCorreo().indexOf('@')==-1){
                throw new VerificaionCorreoException();
            }
            if (!(telefonoLimpio.startsWith("606") || telefonoLimpio.startsWith("30"))){
                throw new VerificacionTelefonoException();
            }

            if(listaAmigos.size()>1){
                for(int i=0; i<=this.listaAmigos.size(); i++){
                    if (this.listaAmigos.get(i).getCorreo().equals(persona.getCorreo())){
                        throw new MismoAmigoException();
                    }   
                }
            }
            

        /*}catch(ValidarCamposLlenosException e){
            System.out.println(e.getMessage());
        }catch(MismoAmigoException e){
            System.out.println(e.getMessage());
        } catch (VerificaionCorreoException e){
            System.out.println(e.getMessage());
        }catch(VerificacionTelefonoException e){
            System.out.println(e.getMessage());
        }*/
        listaAmigos.add(persona);
    }
    public Persona buscarAmigo(String amigoBuscar)throws SeEncuentraAmigoException, VerificaionCorreoException{
        if (amigoBuscar.indexOf('@') == -1) {  
            throw new VerificaionCorreoException();
        }

    for (int i = 0; i < listaAmigos.size(); i++) {
        if (this.listaAmigos.get(i).getCorreo().equals(amigoBuscar)) {
            return listaAmigos.get(i); 
        }
    }

    throw new SeEncuentraAmigoException();
    }
    public boolean salir(){
        return false;
    }
}
