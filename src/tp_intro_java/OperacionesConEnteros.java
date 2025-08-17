/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_intro_java;

import java.util.Scanner;

/**
 *
 * @author emlav
 */
public class OperacionesConEnteros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Primer entero: ");
        int a = Integer.parseInt(input.nextLine());

        System.out.print("Segundo entero: ");
        int b = Integer.parseInt(input.nextLine());

        int suma = a + b;
        int resta = a - b;
        int mult = a * b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + mult);

        if (b != 0) {
            int division = a / b; // división entera (trunca)
            System.out.println("División (entera): " + division);
        } else {
            System.out.println("División: no se puede dividir por cero");
        }

    }
}