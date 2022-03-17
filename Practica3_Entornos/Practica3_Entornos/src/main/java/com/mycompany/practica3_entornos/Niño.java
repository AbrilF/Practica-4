/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3_entornos;

/**
 *
 * @author Abril y Edgar
 */
public class Niño extends Persona {
     private String colegio;

     //Constructor vacio
     public Niño(){
         this(null, null, 1);
     }
     
    //Constructor superClase
    public Niño(String nombre, String DNI, int edad) {
        super(nombre, DNI, edad);
    }
    
    //Constructor con parametros
    public Niño(String colegio){
        this.colegio = colegio;
    }

    //Getter and setter
    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    //toString
    @Override
    public String toString() {
        return "Ni\u00f1o{" + "colegio=" + colegio + '}';
    }
}
