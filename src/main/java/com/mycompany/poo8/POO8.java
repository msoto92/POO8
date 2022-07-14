/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo8;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class POO8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Registre el nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Registre el apellido: ");
        String apellido = sc.nextLine();
        
        System.out.println("Registre la edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("¿Qué desea crear? \n 1.Profesor 2. Estudiante 3. Directivo  ");
        
        int tipo = Integer.parseInt(sc.nextLine());
        
        Persona p;
        
        switch (tipo) 
        {
            case 1:
                p = new Profesor(nombre, apellido, edad);
                break;
                 case 2:
                p = new Estudiante(nombre, apellido, edad);
                break;
                case 3:
                p = new Directivo(nombre, apellido, edad);
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println(p.generarEmail());
    }
}
