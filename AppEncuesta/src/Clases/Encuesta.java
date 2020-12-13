/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *2. Crear clase Encuesta que extienda de Cliente y contenga los siguientes atributos y métodos.
Atributos:
- NivelAtencion(int) entre 0 y 10.
- NivelResolucion(int) entre 0 y 10.
- NivelRecomendacion(int) entro 0 y 10.
* 
* Metodos:
Promedio(NivelAtencion,NivelRecomendacion,NivelResolucion)


 */
public class Encuesta extends Cliente {
    
    
    private int NivelAtencion;  //[0-10]
    private int NivelResolucion; //[0-10]
    private int NivelRecomendacion; //[0-10]

    public Encuesta() {
    }


    public Encuesta(int numdecliente, String nombre, String apellido) {
        super(numdecliente, nombre, apellido);
    }
    
    
    public Encuesta(int NivelAtencion, int NivelResolucion, int NivelRecomendacion) {
        this.NivelAtencion = NivelAtencion;
        this.NivelResolucion = NivelResolucion;
        this.NivelRecomendacion = NivelRecomendacion;
    }

    public int getNivelAtencion() {
        return NivelAtencion;
    }

    public void setNivelAtencion(int NivelAtencion) {
        this.NivelAtencion = NivelAtencion;
    }

    public int getNivelResolucion() {
        return NivelResolucion;
    }

    public void setNivelResolucion(int NivelResolucion) {
        this.NivelResolucion = NivelResolucion;
    }

    public int getNivelRecomendacion() {
        return NivelRecomendacion;
    }

    public void setNivelRecomendacion(int NivelRecomendacion) {
        this.NivelRecomendacion = NivelRecomendacion;
    }

    
    
    
    
    


public float Promedio(int NivelAtencion, int NivelResolucion, int NivelRecomendacion){

    return ((NivelAtencion+NivelResolucion+ NivelRecomendacion)/3);
}




}//clase