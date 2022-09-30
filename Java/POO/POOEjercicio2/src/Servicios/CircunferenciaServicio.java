/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class CircunferenciaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo para crear la circunferencia
     *
     * @return
     */
    public Circunferencia crearCircunferencia() {

        Circunferencia circ = new Circunferencia(0);

        System.out.println("Ingrese el radio de la circunferencia a calcular");
        circ.setRadio(leer.nextDouble());
        System.out.println("");
        System.out.println("La circunferencia ha sido creada con exito!");
        return circ;

    }

    public void area(Circunferencia c) {

        double calarea = c.getRadio() * c.getRadio() * Math.PI;
        System.out.println("");
        System.out.println("El area de la circunferencia es: " + calarea);
        System.out.println("");
    }

    public void perimetro(Circunferencia c) {

        double calperim = c.getRadio() * 2 * Math.PI;
        System.out.println("");
        System.out.println("El perímetro de la circunferencia es: " + calperim);
        System.out.println("");
    }
}
