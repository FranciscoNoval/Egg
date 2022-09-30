/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio7;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        Persona[] persona = new Persona[4];
        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        int mayor = 0;
        int menor = 0;
        int cont = 0;
        System.out.println("Bienvenido a CREA PERSONA, hoy crearemos 4 personas distintas!");
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            cont++;
            System.out.println("");
            System.out.println("Formulario para Persona Nº "+cont);
            System.out.println("-----------------------------------------------------");
            persona[i] = ps.crearPersona();
            persona[i].setImc(ps.calcularMC(persona[i]));
            persona[i].setMayorEdad(ps.esMayorDeEdad(persona[i]));
            switch (persona[i].getImc()) {
                case -1:
                    bajoPeso++;
                    break;
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrePeso++;
                    break;
                default:
                    break;
            }
            if (persona[i].getMayorEdad() == true) {
                mayor++;
               }else {
                menor++;    
            }
        }
        
        System.out.println("De acuerdo con los datos ingresados pudimos calcular que...");
        System.out.println("");
        System.out.println("el "+(bajoPeso * 100)/4+" % de las personas estan con bajo peso");
        System.out.println("el "+(pesoIdeal * 100)/4+" % de las personas estan en su peso ideal");
        System.out.println("el "+(sobrePeso * 100)/4+" % de las personas estan con sobrepeso");
        System.out.println("");
        System.out.println("En cuanto a las edades...");
        System.out.println("el "+(mayor * 100)/4+" % de las personas son mayores de edad");
        System.out.println("el "+(menor * 100)/4+" % de las personas son menores de edad");
    }

}
