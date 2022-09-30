/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio10;

import java.util.Arrays;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio10 {

    /**
     * Realizar un programa en Java donde se creen dos arreglos: el primero será
     * un arreglo A de 50 números reales, y el segundo B, un arreglo de 20
     * números, también reales. El programa deberá inicializar el arreglo A con
     * números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe
     * ordenar de menor a mayor y copiar los primeros 10 números ordenados al
     * arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el
     * valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
     * elementos y el combinado de 20.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        System.out.println("Este es el arreglo A");
        System.out.println("--------------------------");
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random();
            System.out.println("[" + arregloA[i] + "] ");
        }
        Arrays.sort(arregloA);

        System.out.println("");
        System.out.println("");
        System.out.println("El arreglo ordenado");
        System.out.println("--------------------------");
        for(int i = 0; i < arregloB.length; i++) {
            arregloB[i] = arregloA[i];
        }
        Arrays.fill(arregloB, 10, 20, 0.5);
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println("[" + arregloB[i] + "] ");

        }
    }

}
