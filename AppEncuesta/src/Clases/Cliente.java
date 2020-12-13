/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *1. Crear clase Cliente con los siguientes atributos.
- Nombre (no puede estar vacío)
- Apellido (no puede estar vacío)
- Numero de Cliente (tiene que ser mayor a 0)

 */
public class Cliente {
    
    private int numdecliente;
    private String nombre;
    private String apellido;

    public Cliente() {
    }

    public Cliente(int numdecliente, String nombre, String apellido) {
        this.numdecliente = numdecliente;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumdecliente() {
        return numdecliente;
    }

    public void setNumdecliente(int numdecliente) {
        this.numdecliente = numdecliente;
    }
    
    public boolean esNumerico(String palabra){
    
    //metodo charAt devuelve el caracter del indice especificado
    
    String numerico="0123456789";
    
    for(int indice=0; indice<palabra.length(); indice++){
        for (int jindice=0;jindice<numerico.length(); jindice++){
            if ((palabra.charAt(indice) == numerico.charAt(jindice))){  
                return true;
            }
        }
    }
            return false;
    }

    public boolean estaVacio(String palabra){
        
    if (palabra.isEmpty()){
        return true;
    }else{
        return false;
    }
    }

}
