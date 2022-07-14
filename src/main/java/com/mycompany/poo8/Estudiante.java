/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo8;

/**
 *
 * @author Miguel
 */
public class Estudiante extends Persona{

    public Estudiante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public String generarEmail() {
        // la primera letra del nombre, el apellido @ estudiante.unal.co
        // abcd
        String email = nombre.substring(0, 1) + apellido + "@estudiante.unal.co";
        return email;
    }
    
}
