/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3_entornos;
import java.util.Date;

/**
 *
 * @author Abril y Edgar
 */
public class Barco implements Sonido{
    
    //Atributos
    private String nombre;
    private Date fechaConstruccion;
    private int numCamarote;
    private Motor motor;

    //Constructor vacio
    public Barco(){
        this(null,null,0);
    }
    
    
    //Constructor Con parámetros
    public Barco(String nombre, Date fechaConstruccion, int numCamarote) {
        this.nombre = nombre;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarote = numCamarote;
        motor = new Motor();
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public int getNumCamarote() {
        return numCamarote;
    }

    public void setNumCamarote(int numCamarote) {
        this.numCamarote = numCamarote;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    //Metodo para la interfaz sonido
    @Override
    public void Sonido() {
        System.out.println("El barco usa dos tipos de frima acustica");
    }

    //toString
    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + ", fechaConstruccion=" + fechaConstruccion + ", numCamarote=" + numCamarote + ", motor=" + motor + '}';
    }
    
    
}
