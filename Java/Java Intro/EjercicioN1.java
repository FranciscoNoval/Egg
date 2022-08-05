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
public class EjercicioN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
           dos. El programa deberá después mostrar el resultado de la suma
        */
        /* Primero debemos importar el objeto Scanner para poder ingresar datos por teclado
        luego definimos la variable leer para ejecutar dicho objeto, despues con la isntruccion 
        System.out.printLn() definimos lo que queremos mostrar por pantalla, en la siguiente linea
        definimos la primer variable(segun su tipo) y tambien llamamos la variable leer y con la 
        instruccion .next<tipo de variable>(), recordemos cerrar cada linea de instruccion con ;
        luego repetimos los pasos para la segunda variable (num2) y finalmente definimos la variable
        resultado y en la misma definimos la operacion a realiza y en la ultima linea con la instruccion
        System.out.println() mostramos por pantalla el resultado.        
        */      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        
        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }
    
}
