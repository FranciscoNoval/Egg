/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera llenarCafetera() {
        Cafetera caf = new Cafetera(1000, 0);
        caf.setCapacidadActual(caf.getCapacidadMaxima());
        System.out.println("Su cafetera esta llena ahora!");
        System.out.println("");
        return caf;

    }

    public void servirTaza(Cafetera caf) {

        System.out.println("Ingrese el tamaño de la taza que desea servir (en mililitros)");
        int taza = leer.nextInt();
        if (taza < caf.getCapacidadActual()) {
            caf.setCapacidadActual(caf.getCapacidadActual() - taza);
            System.out.println("Su taza fue llena completamente");

        } else if (caf.getCapacidadActual() == 0) {
            System.out.println("Ya no queda cafe, vuelva a llenar la cafetera");

        } else {
            System.out.println("En su taza solo pudieron servirse solo " + caf.getCapacidadActual());
            caf.setCapacidadActual(0);
            System.out.println("Ya no queda cafe, vuelva a llenar la cafetera");
        }

    }

    public void vaciarCafetera(Cafetera caf) {

        caf.setCapacidadActual(0);
        System.out.println("Su cafetera ha sido vaciada!");
        System.out.println("");
    }

    public void agregarCafe(Cafetera caf) {
        System.out.println("Ingrese la cantidad de cafe que quiere agregar");
        if (caf.getCapacidadActual() < caf.getCapacidadMaxima()){
        caf.setCapacidadActual(caf.getCapacidadActual() + leer.nextInt());
            System.out.println("Ahora su cafetera tiene "+caf.getCapacidadActual()+" ml.");
        }else{
            System.out.println("Su cafetera esta llena");
        }
    }
}
