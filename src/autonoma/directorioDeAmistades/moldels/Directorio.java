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
    private ArrayList <Amigo> listaAmigos;
    ///////////////////////////////////////////////////////////////////////
    //////Construtor
    public Directorio() {
        this.listaAmigos = new ArrayList<>();
    }
    public Directorio(ArrayList<Amigo> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }   
    ///////////////////////////////////////////////////////////////////////
    //////Metodos de aceso
    public ArrayList<Amigo> getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(ArrayList<Amigo> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }
    
    ///////////////////////////////////////////////////////////////////////
    //////Metodos
    
    public void agregarAmigo(Amigo amigo) throws MismoAmigoException, ValidarCamposLlenosException, VerificaionCorreoException,VerificacionTelefonoException{
        //try{//intentar validar
            String telefonoLimpio = amigo.getTelefono().trim().replaceAll("\\D", "");
            if (amigo.getCorreo().trim().isEmpty() || amigo.getNombre().trim().isEmpty() || amigo.getTelefono().trim().isEmpty()){
                throw new ValidarCamposLlenosException();
            }
            if( amigo.getCorreo().indexOf('@')==-1){
                throw new VerificaionCorreoException();
            }
            if (!(telefonoLimpio.startsWith("606") || telefonoLimpio.startsWith("30"))){
                throw new VerificacionTelefonoException();
            }

            if(listaAmigos.size()>1){
                for(int i=0; i<=this.listaAmigos.size(); i++){
                    if (this.listaAmigos.get(i).getCorreo().equals(amigo.getCorreo())){
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
        listaAmigos.add(amigo);
    }
    public Amigo buscarAmigo(String amigoBuscar)throws SeEncuentraAmigoException, VerificaionCorreoException{
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
    public void eliminarAmigo(int po){
        listaAmigos.remove(po);
    }
    public boolean salir(){
        return false;
    }
}
