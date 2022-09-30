/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Sopa;
import java.util.Scanner;

/**
 *
 * @author German
 */
public class SopaService {

    Scanner leer = new Scanner(System.in);

    String[][] m = new String[10][10];

    char aleatorio;

    String letra;

    int[] ubicacion = new int[2];

    public Sopa llenarMatriz() {

        Sopa s1 = new Sopa();

        int pos;

        for (int i = 0; i < 10; i++) {
            pos = (int) (Math.random() * 5);
            for (int j = 0; j < 10; j++) {
                if (j == pos) {
                    for (int k = 0; k < 5; k++) {
                        m[i][j] = s1.getPalabra()[i].substring(k, k + 1);
                        if (k != 4) {
                            j++;
                        }
                    }
                } else {
                    aleatorio = ((char) (Math.random() * (122 - 97 + 1) + 97));
                    letra = aleatorio + "";
                    m[i][j] = letra;
                }

            }
        }

        s1.setMatriz(m);

        return s1;
    }

    public boolean buscarPalabra(Sopa s1) {

        System.out.print("Ingrese una palabra que se encuentra en la matriz: ");
        String palabra = leer.next();

        int contador = 0, fila = 0, columna = 0;

        for (int i = 0; i < 10; i++) {
            if (contador == 5) {
                break;
            } else if (contador > 0) {
                contador = 0;
            }
            for (int j = 0; j < 10; j++) {
                if (palabra.substring(0, 1).equals(s1.getMatriz()[i][j].substring(0, 1))) {
                    contador++;
                    fila = i;
                    columna = j;
                    ubicacion[0] = fila;
                    ubicacion[1] = columna;
                    for (int k = 1; k < 5; k++) {
                        if (palabra.substring(k, k + 1).equals(s1.getPalabra()[i].substring(k, k + 1))) {
                            contador++;
                        }
                        if (k != 4) {
                            j++;
                        }
                    }
                    if (contador == 5) {
                        break;
                    }

                }
            }
        }

        if (contador == 5) {
            System.out.println("La palabra inicia en la posicion " + fila + ", " + columna);
            return true;
        } else {
            System.out.println("La palabra no se encuentra en la matriz.");
            return false;
        }

    }

    public void imprimirSopa(Sopa s1) {

        for (int i = 0; i < 10; i++) {
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + s1.getMatriz()[i][j] + " ");
            }
        }

        System.out.println("");
        System.out.println("");

    }

    public void reemplazarPalabra(Sopa s1) {

        if (buscarPalabra(s1)) {

            System.out.print("Ingrese palabra a reemplazar: ");
            String palabraNueva = leer.next();

            if (palabraNueva.length() == 5) {

                for (int i = 0; i < 5; i++) {
                    m[ubicacion[0]][ubicacion[1]] = palabraNueva.substring(i, i + 1);
                    ubicacion[1]++;
                }

            } else {

                for (int i = 0; i < palabraNueva.length(); i++) {
                    m[ubicacion[0]][ubicacion[1]] = palabraNueva.substring(i, i + 1);
                    ubicacion[1]++;
                }
                for (int i = palabraNueva.length(); i < 5; i++) {
                    aleatorio = ((char) (Math.random() * (122 - 97 + 1) + 97));
                    letra = aleatorio + "";
                    m[ubicacion[0]][ubicacion[1]] = letra;
                    ubicacion[1]++;
                }
            }

            s1.setMatriz(m);

        } else {
            System.out.println("La palabra a reemplazar no se encuentra.");
        }

    }
    
    public void matrizInvertida(Sopa s1){
        
        System.out.println("Matriz invertida===============");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + m[j][i] + " ");
            }
        }
        
        System.out.println("");
        
    }

}
