/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3_entornos;

/**
 * Refactorizacion del codigo 
 * @author Abril y Edgar
 */
public class Adulto extends Persona{
    private String NSS;
    private String direccion;

    //Constructor Vacio
    public Adulto(){
        this(null, null, 1);
    }

    //Constructor superClase
    public Adulto(String nombre, String DNI, int edad) {
        super(nombre, DNI, edad);
    }
    
    //Constructor con parametros
    public Adulto(String NSS, String direccion){
        this.NSS = NSS;
        this.direccion = direccion;
    }
    
    //Getter and setter

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //toString
    @Override
    public String toString() {
        return "Adulto{" + "NSS=" + NSS + ", direccion=" + direccion + '}';
    }
    
    
}
