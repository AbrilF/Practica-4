/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3_entornos;

/**
 *
 * @author Abril y Edgar
 */
public abstract class Mascota implements Sonido{
    private String nombre;
    private int edad;
    
    //Constructor vacio
    public Mascota(){
        this(null, 1);
    }
    
    //Constructor
    public Mascota(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   //toString
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
