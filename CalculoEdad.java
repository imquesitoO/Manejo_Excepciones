/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Excepciones;

/**
 *
 * @author valer
 */
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;

public class CalculoEdad {
    
    public static void main(String[] args) {
    GregorianCalendar hoy;
    Scanner entrada = new Scanner(System.in);
    int edad, esteAnio, anioNac;
    String respuesta;
    
    IngresoEdad ingreso = new IngresoEdad();
    
    edad=ingreso.obtenerEdad("¿Que edad tiene? ");
    
    hoy=new GregorianCalendar();
    
    esteAnio = hoy.get(Calendar.YEAR);
    anioNac=esteAnio-edad;
    
    System.out.print("¿ya cumplio anios este anio? (S/N): ");
    respuesta = entrada.next();
    
    if(respuesta.equals("N")|| respuesta.equals("n"))
        anioNac--;
    
    System.out.println("\nUsted nacio en " + anioNac);
    }   
}