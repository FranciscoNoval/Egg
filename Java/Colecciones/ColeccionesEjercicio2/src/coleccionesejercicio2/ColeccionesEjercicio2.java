/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario
 * se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el
 * perro en la lista. Si el perro está en la lista, se eliminará el perro que
 * ingresó el usuario y se mostrará la lista ordenada. Si el perro no se
 * encuentra en la lista, se le informará al usuario y se mostrará la lista
 * ordenada.
 *
 * @author Flia. Noval
 */
public class ColeccionesEjercicio2 {

    /**
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
        System.out.println("");
        
        System.out.println("Desde aqui puede borrar alguna raza");
        int borra = 1;
        String razaBorrar;
        int cont = 0;
        while (borra != 2) {
            System.out.println("¿Quiere continuar? | Ingrese [1]-SI o [2]-NO");
            borra = leer.nextInt();
            if (borra != 1) {
                if (borra == 2) {
                    break;
                }
                System.out.println("Usted ha ingresado una opcion invalida");

            } else {
                System.out.print("Ingrese una raza de perros a borrar: ");
                razaBorrar= leer.next();
                for (String raza : razaPerros){
                    if (raza.equals(razaBorrar)){
                        System.out.println("La raza " + razaBorrar.toUpperCase() + " ha sido borrada");
                        razaPerros.remove(raza);
                        cont++;
                        break;
                    }
                 }
                if (cont == 0){
                    System.out.println("La raza " + razaBorrar.toUpperCase() + " no se ha encontrado");
                }
            }
        }
        //Imprimimos las razas que quedaron
        System.out.println("Estas son las razas que han quedado en la lista");
        for (int i = 0; i < razaPerros.size(); i++) {
            System.out.println("Raza " + (i + 1) + ": " + razaPerros.get(i));
        }
        
    }

}
