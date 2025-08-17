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
public class TiposDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresá el primer número: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Ingresá el segundo número: ");
        int b =  Integer.parseInt(input.nextLine());

            int divisionEntera = a / b;
            double divisionReal = (double) a / b;

            System.out.println("División (int): " + divisionEntera);
            System.out.println("División (double): " + divisionReal);
    }
}
