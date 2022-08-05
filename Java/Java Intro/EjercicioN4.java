/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavaejercicios;

/**
 *
 * @author Raul
 */
public class EjercicioN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        int tempCelsius = 22;
        double conversorFa = tempCelsius + (9* tempCelsius/5);
        System.out.println("La temperatura " + tempCelsius + "°C expresada en grados Fahrenheit es: " + conversorFa + "°F");
        
    }
    
}
