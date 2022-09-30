/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Complete el formulario para crear a la persona");
        System.out.print("Nombre: ");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Día: ");
        int dia = (leer.nextInt());
        System.out.print("Mes: ");
        int mes = (leer.nextInt());
        System.out.print("Año: ");
        int anio = (leer.nextInt());
        persona.setFechaNacimiento(new Date(anio - 1900, mes - 1, dia));
        System.out.println("La persona fue creada con exito");
        System.out.println("");
        return persona;
    }

    public void calcularEdad(Persona persona) {
        Date hoy = new Date();
        long cumple = hoy.getTime() - persona.getFechaNacimiento().getTime();
        long unAnio = 31557600000L;
        persona.setEdad(cumple / unAnio);
    }

    public boolean menorQue(Persona persona) {
        System.out.println("Ingrese la edad de otra persona");
        int otraEdad = leer.nextInt();
        if (otraEdad < (int) persona.getEdad()) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Aquí esta la persona creada");
        System.out.println("");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + persona.getEdad());
    }
}
