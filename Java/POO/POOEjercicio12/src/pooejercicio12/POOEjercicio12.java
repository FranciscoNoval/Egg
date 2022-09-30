/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio12;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();

        Persona persona1 = ps.crearPersona();

        ps.calcularEdad(persona1);
        System.out.println("");
        System.out.println("Calcularemos si es mayor que el receptor");
        if (ps.menorQue(persona1) == true) {
            System.out.println("");
            System.out.println("El receptor es menor que la persona creada");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("El receptor es mayor que la persona creada");
            System.out.println("");
        }
        ps.mostrarPersona(persona1);
    }

}
