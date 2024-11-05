/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Excepciones;

import java.util.Scanner;

/**
 *
 * @author valer
 */
public class CalcularArea {
    public static void main(String[] args) {
        System.out.println("\t\tCalculo del area de un triangulo");
        IngresoLados ingreso = new IngresoLados();
        
        // Verificar si los lados forman un triángulo
        boolean esTriangulo = ingreso.verificarTriangulo("Verificando si los lados forman un triangulo\n");
        
        // Calcular el área si es un triángulo válido
        float area = ingreso.area(esTriangulo);
        
        // Mostrar el área calculada si el triángulo es válido
        if (esTriangulo) {
          System.out.printf("El area del triangulo es: %.4f\n", area);
        }
    }
}
