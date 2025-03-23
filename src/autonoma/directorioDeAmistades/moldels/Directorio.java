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
    
    public void agregarAmigo(Persona persona) throws MismoAmigoException{
        try{//intentar validar
            if (persona.getCorreo().trim().isEmpty() || persona.getNombre().trim().isEmpty() || persona.getTelefono().trim().isEmpty()){
                throw new ValidarCamposLlenosException();
            }
            if( persona.getCorreo().indexOf('@')==-1){
                throw new VerificaionCorreoException();
            }
            if (!persona.getTelefono().startsWith("606")||persona.getTelefono().startsWith("30")){
                throw new VerificacionTelefonoException();
            }

            if(listaAmigos.size()>1){
                for(int i=0; i<=this.listaAmigos.size(); i++){
                    if (this.listaAmigos.get(i).getCorreo().equals(persona.getCorreo())){
                        throw new MismoAmigoException();
                    }   
                }
            }
            try{//intentar guardar
                listaAmigos.add(persona);
                System.out.println("Se agrego Correctamente");
            }catch(Exception e){
                System.out.println("Hubo un probrema en agregar");
            }

        }catch(ValidarCamposLlenosException e){
            System.out.println(e.getMessage());
        }catch(MismoAmigoException e){
            System.out.println(e.getMessage());
        } catch (VerificaionCorreoException e){
            System.out.println(e.getMessage());
        }catch(VerificacionTelefonoException e){
            System.out.println(e.getMessage());
        }      
    }
    public void buscarAmigo(Persona persona, String amigoBuscar){
        try{
            for(int i=0; i<=listaAmigos.size(); i++){
                if(!this.listaAmigos.get(i).getCorreo().equals(amigoBuscar)){
                    throw new SeEncuentraAmigoException();
                }
            }
        }catch(SeEncuentraAmigoException e){
            System.out.println(e.getMessage());
        }
    }
    public boolean salir(){
        return false;
    }
}
