/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Excepciones;

import java.util.*;

class IngresoLados {
    private Scanner entrada;
    private int lado1;
    private int lado2;
    private int lado3;

    public IngresoLados() {
        entrada = new Scanner(System.in);
    }

    public boolean verificarTriangulo(String prompt) {
        System.out.println(prompt);

        // Solicitar y verificar que `lado1` sea positivo
        lado1 = solicitarLado("Ingrese el lado 1: ");
        
        // Solicitar y verificar que `lado2` sea positivo
        lado2 = solicitarLado("Ingrese el lado 2: ");
        
        // Solicitar y verificar que `lado3` sea positivo
        lado3 = solicitarLado("Ingrese el lado 3: ");

        // Verificar la desigualdad triangular
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            return true; // Es un triángulo válido
        }

        System.out.println("Las longitudes proporcionadas no pueden formar un triangulo.");
        return false; // No es un triángulo válido
    }

    private int solicitarLado(String mensaje) {
        int lado;
        while (true) {
            try {
                System.out.print(mensaje);
                lado = entrada.nextInt();
                if (lado <= 0) {
                    throw new Exception("La longitud del lado debe ser un numero positivo.");
                }
                return lado; // Valor válido, salir del bucle
            } catch (InputMismatchException e) {
                entrada.next(); // Limpiar el buffer
                System.out.println("Entrada invalida. Por favor ingrese salo digitos.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public float area(boolean esTriangulo) {
        if (esTriangulo) {
            float s = (float) (lado1 + lado2 + lado3) / 2;
            return (float) Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        } else {
            System.out.println("No es posible calcular el area. Las longitudes no forman un triangulo.");
            return 0;
        }
    }
}




