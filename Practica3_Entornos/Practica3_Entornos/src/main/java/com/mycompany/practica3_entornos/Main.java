/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3_entornos;

/**
 *
 * @author Abril y Edgar
 */
public class Main {
    public static void main(String[]args){
        Barco barco = new Barco();
        barco.Sonido();

        Perro perro = new Perro();
        perro.Sonido();

        Gato gato = new Gato();
        gato.Sonido();
    }
}