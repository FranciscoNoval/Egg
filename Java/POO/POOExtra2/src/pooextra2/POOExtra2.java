/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra2;

import Entidades.Puntos;
import Servicios.PuntosServicio;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class POOExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PuntosServicio ps = new PuntosServicio();
        Puntos puntos = ps.crearPuntos();
        System.out.println("Presione ENTER para continuar...");
        leer.next();
        ps.calcularDistancia(puntos);
    }
    
}
