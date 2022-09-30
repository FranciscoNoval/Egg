/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra5;

import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class POOExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String[] doceMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int posicion = (int) (Math.random() * 12);

        String mesSecreto = doceMeses[posicion];
        String mes;
        System.out.println("Adivine el mes secreto");
        do {
            System.out.print("Introduzca el nombre del mes en minúsculas: ");
            mes = leer.next();
            if (mes.equalsIgnoreCase(mesSecreto)) {
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            }
        } while (!mesSecreto.equalsIgnoreCase(mes));
    }

}
