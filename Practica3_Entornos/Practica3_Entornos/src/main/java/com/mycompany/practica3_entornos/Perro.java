/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3_entornos;

/**
 *
 * @author Abril y Edgar
 */
public class Perro extends Mascota {
    private String raza;
    
    //Constructor vacio
    public Perro(){
        this(null, 1);
    }
    
    //Constructor superClase
    public Perro(String nombre, int edad){
        super( nombre, edad);
    }
    
    //Constructor con parametros
    public Perro(String raza){
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
        return "Perro{" + "raza=" + raza + '}';
    }

    //Metodo abstracto Sonido Perro
    @Override
    public void Sonido() {
        System.out.println("El Perro ladra");
    }

    
}
