/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio2;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicio;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opMenu = 0;

        System.out.println("Menú Circunferencia");
        System.out.println("----------------------------------");
        Circunferencia circ1 = cs.crearCircunferencia();
        System.out.println("Presione ENTER para continuar");
        leer.nextLine();
        do {
            System.out.println("1. Calcular perímetro");
            System.out.println("2. Calcular área");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opcion deseada");
            opMenu = leer.nextInt();
            switch (opMenu) {
                case 1:
                    cs.perimetro(circ1);
                    break;
                case 2:
                    cs.area(circ1);
                    break;
                case 3:
                    System.out.println("Usted ha salido del sistema");

            }
        } while (opMenu != 3);

    }

}
