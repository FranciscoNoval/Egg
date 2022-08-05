/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavaejercicios;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class EjercicioN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*
        5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
              
        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El triple de " + num + " es:  " + triple);
        System.out.println("La raiz cuadrada de " + num + " es : " + Math.sqrt(num));
    }
    
}
