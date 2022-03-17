/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3_entornos;

/**
 *Refactorizacion Gato del codigo
 * @author Abril y Edgar
 */
public class Gato extends Mascota{
    private String raza;
    
    //Constructor vacio
    public Gato(){
        this(null,1);
    }
    
    //Constructor superClase
    public Gato(String nombre, int edad ){
        super(nombre, edad);
    }
    
    //Constructor con parametros
    public Gato(String raza){
        this.raza = raza;
    }
    
    //Getters and setters

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //toString
    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + '}';
    }

    //Metodo abstracto Sonido Gato
    @Override
    public void Sonido() {
        System.out.println("El Gato maulla");
    }
    
}
