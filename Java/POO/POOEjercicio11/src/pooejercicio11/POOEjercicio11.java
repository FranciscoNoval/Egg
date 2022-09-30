/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Date hoy = new Date();
        
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int anio = leer.nextInt();
        
        Date fechaNacimiento = new Date(anio - 1900, mes-1, dia);
        System.out.println("");
        System.out.println("El dia de hoy es: "+hoy);
        System.out.println("Su fecha de nacimiento es: "+fechaNacimiento);
        System.out.println("");
        
        long cumple = (hoy.getTime() - fechaNacimiento.getTime()); 
        long unAnio = 31557600000L;
        
        System.out.println("Usted tiene "+cumple/unAnio+" años");
        
    }
    
}
