/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio4;

import Entidades.Rectangulo;
import Servicios.RectanguloServicio;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
               RectanguloServicio rs = new RectanguloServicio();
        System.out.println("PROGRAMA >> RECTANGULO <<");
        System.out.println("----------------------------------");
        Rectangulo rect = rs.crearRectangulo();
        System.out.println("Presione ENTER para continuar al menú");
        leer.nextLine();
        int opMenu = 0;
        do {
            System.out.println("MENÚ RECTANGULO");
            System.out.println("1. PERIMETRO");
            System.out.println("2. SUPERFICIE");
            System.out.println("3. DIBUJAR");
            System.out.println("4. REDIMENSIONAR RECTANGULO");
            System.out.println("5. SALIR");
            System.out.println("Ingrese la opcion deseada");
            opMenu = leer.nextInt();
            
            switch (opMenu) {
                case 1:
                    System.out.println("El perimetro del rectangulo es: "+rs.perimetro(rect));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("La superficie del rectangulo es: "+rs.superficie(rect));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Este es el diagrama del rectangulo");
                    rs.imprimirRectangulo(rect);
                    System.out.println("");
                    break;
                case 4:
                    rect = rs.crearRectangulo();
                    break;
                case 5:
                    System.out.println("Usted ha salido del sistema");
            }
             
        } while (opMenu != 5);   
        

    }
    
}

