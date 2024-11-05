/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Excepciones;

/**
 *
 * @author valer
 */
import java.util.*;
public class IngresoEdad {
    
    private static final String MENSAJE = "Edad: ";
    private Scanner entrada;

public IngresoEdad() {
    entrada = new Scanner(System.in);
}
public int obtenerEdad() {
    return obtenerEdad(MENSAJE);
}

public int obtenerEdad(String prompt) {
    int edad;
    while (true) {
        System.out.print(prompt);
        try {
            edad = entrada.nextInt();
            if (edad<0)
                throw new Exception("Edad negativa es inválida");
                return edad;
                }
        catch(InputMismatchException e) {
                entrada.next();//limpiar buffer
                System.out.println("Entrada inválida. \n Por favor ingrese sólo dígitos");
            }
        catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
}
}