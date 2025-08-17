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
public class IngresoUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresá tu nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingresá tu edad: ");
        int edad = input.nextInt();

        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }
}
