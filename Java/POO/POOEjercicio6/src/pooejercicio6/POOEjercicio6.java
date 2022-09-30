/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio6;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CafeteraServicio cs = new CafeteraServicio();
        
        System.out.println("Cafetera NEXPRESSO");
        System.out.println("----------------------------------------------------");
        System.out.println("Vamos a llenar la cafetera por primera vez");
        Cafetera cafetera = cs.llenarCafetera();
        System.out.println("Su cafetera esta lista para usarse");
        System.out.println("Ingrese ENTER para continuar");
        leer.nextLine();
        int opMenu = 0;
        do {
            System.out.println("Menú Cafetera");
            System.out.println("------------------------");
            System.out.println("1. Servir Taza");
            System.out.println("2. Agregar Café");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Apagar cafetera");
            System.out.println("------------------------");
            System.out.println("Ingrese la opcion deseada");
            opMenu = leer.nextInt();
            switch (opMenu) {
                case 1:
                    cs.servirTaza(cafetera);
                    break;
                case 2:
                    cs.agregarCafe(cafetera);
                    break;
                case 3:
                    cs.vaciarCafetera(cafetera);
                    break;
                case 4:
                    System.out.println("Cafetera apagada");
            }
        } while (opMenu != 4);

    }
    
}
