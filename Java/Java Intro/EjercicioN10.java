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
public class EjercicioN10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limite = leer.nextInt();
       
        int suma = 0;
        while(suma < limite){
             System.out.println("Ingrese un numero");
        int num = leer.nextInt();
            suma = num + suma;
        }
      
    }
    
    
}
