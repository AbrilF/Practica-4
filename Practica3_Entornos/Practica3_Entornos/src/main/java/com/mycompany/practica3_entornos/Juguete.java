/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3_entornos;

/**
 * Refactorizamos Juguete en la rama desarrollo
 * @author Abril y Edgar
 */
public class Juguete extends Niño{
    private String nombre;
    private int precio;
    private int edadRecomendada;

    //Constrructor vacio
    public Juguete(){
        this(null, null, 1);
    }

    //Constructor superClase
    public Juguete(String nombre, String DNI, int edad) {
        super(nombre, DNI, edad);
    }
    
    //Constructor con parametros
    public Juguete(String nombre, int precio, int edadRecomendada){
        this.nombre = nombre;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;
    }
    
    //Geters and setters

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
 
    //toString

    @Override
    public String toString() {
        return "Juguete{" + "nombre=" + nombre + ", precio=" + precio + ", edadRecomendada=" + edadRecomendada + '}';
    }
    
}
