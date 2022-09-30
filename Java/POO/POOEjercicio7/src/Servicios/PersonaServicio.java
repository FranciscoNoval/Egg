/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
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
        System.out.println("");
        System.out.print("Nombre: ");
        persona.setNombre(leer.next());
        System.out.print("Edad: ");
        persona.setEdad(leer.nextInt());
        while (persona.getEdad() < 0) {
            System.out.println("La edad no puede ser menor que 0, ingrésela nuevamente");
            System.out.print("Edad: ");
            persona.setEdad(leer.nextInt());
        }
        System.out.print("Sexo ([H]-hombre, [M]-mujer, [O]-otro): ");
        persona.setSexo(leer.next());
        while (!"H".equalsIgnoreCase(persona.getSexo()) && !"M".equalsIgnoreCase(persona.getSexo()) && !"O".equalsIgnoreCase(persona.getSexo())) {
            System.out.println("El dato ingresado es incorrecto, ingréselo nuevamente");
            System.out.print("Sexo ([H]-hombre, [M]-mujer, [O]-otro): ");
            persona.setSexo(leer.next());
        }
        System.out.print("Peso: ");
        persona.setPeso(leer.nextInt());
        System.out.print("Altura: ");
        persona.setAltura(leer.nextFloat());
        System.out.println("");
        System.out.println("La persona se ha creado exitosamente");
        System.out.println("");
        return persona;
    }

    public int calcularMC(Persona persona) {
        int pesoCorrecto;
        float imc = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        if (imc < 20) {
            pesoCorrecto = -1;
        } else if (imc >= 20 && imc <= 25) {
            pesoCorrecto = 0;
        } else {
            pesoCorrecto = 1;
        }
        return pesoCorrecto;
    }

    public boolean esMayorDeEdad(Persona persona) {
        if (persona.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
