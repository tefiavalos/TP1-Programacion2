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
public class ErrorEjemplo {
    public static void main(String[] args) {
        //Se usaba scanner.nextInt() para leer un String. Eso provoca incompatibilidad de tipos 
        //(intentaba asignar un entero a una variable String). Se arregla usando nextLine().
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre);

        scanner.close();
    }
}