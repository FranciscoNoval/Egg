/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class ColeccionesEjercicio1 {

    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de
     * tipo String. El programa pedirá una raza de perro en un bucle, el mismo
     * se guardará en la lista y después se le preguntará al usuario si quiere
     * guardar otro perro o si quiere salir. Si decide salir, se mostrará todos
     * los perros guardados en el ArrayList.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razaPerros = new ArrayList<>();
        System.out.println("En este programa usted ingresará razas de perros que guardaremos");
        int sigue = 1;
        while (sigue != 2) {
            System.out.println("¿Quiere continuar? | Ingrese [1]-SI o [2]-NO");
            sigue = leer.nextInt();
            if (sigue != 1) {
                if (sigue == 2) {
                    break;
                }
                System.out.println("Usted ha ingresado una opcion invalida");

            } else {
                System.out.print("Ingrese una raza de perros: ");
                razaPerros.add(leer.next());
            }
        }
        System.out.println("Usted ha terminado de ingresar razas de perros");
        System.out.println("");

        //Imprimimos las razas ingresadas
        System.out.println("Estas son las razas que usted ha ingresado");
        for (int i = 0; i < razaPerros.size(); i++) {
            System.out.println("Raza " + (i + 1) + ": " + razaPerros.get(i));
        }
    }

}
