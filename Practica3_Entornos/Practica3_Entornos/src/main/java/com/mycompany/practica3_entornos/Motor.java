/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3_entornos;

/**
 *
 * @author Abril y Edgar
 */
public class Motor {
    private String fabricante;
    private String potencia;
    private int codigo;
    
    //Getters and setter
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Constructor vacio
    public Motor(){
        this(null, null, 1);
    }
    
    //Constructor con parametros
    public Motor(String fabricante, String potencia, int codigo) {
     this.fabricante = fabricante;
     this.potencia = potencia;
     this.codigo = codigo;
    }

    //toString
    @Override
    public String toString() {
        return "Motor{" + "fabricante=" + fabricante + ", potencia=" + potencia + ", codigo=" + codigo + '}';
    }
    
}
