/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo8;

/**
 *
 * @author Miguel
 */
public class Profesor extends Persona{

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public String generarEmail() {
        
        String email = nombre.substring(0, 1) + apellido + "@profesor.unal.co";
        return email;
    }
    
}
