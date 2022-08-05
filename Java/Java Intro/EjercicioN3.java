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
public class EjercicioN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String nombre = leer.nextLine();
        String nombreMayus = nombre.toUpperCase();
        String nombreMin = nombre.toLowerCase();
        System.out.println("La frase ingresada en mayusculas es: " + nombreMayus);  
        System.out.println("La frase ingresada en minusculas es: " + nombreMin);
    }
    
}
