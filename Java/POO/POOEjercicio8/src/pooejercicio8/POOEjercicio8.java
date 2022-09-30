/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio8;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CadenaServicio cs = new CadenaServicio();
        System.out.println("TRABAJO CON CADENAS");
        System.out.println("----------------------------------");
        Cadena cadena1 = cs.crearCadena();
        System.out.println("Presione ENTER para continuar al menú");
        leer.nextLine();
        int opMenu = 0;
        do {
            System.out.println("MENÚ RECTANGULO");
            System.out.println("1. MOSTRAR VOCALES");
            System.out.println("2. INVERTIR FRASE");
            System.out.println("3. LETRA REPETIDA");
            System.out.println("4. COMPARAR LONGITUD");
            System.out.println("5. UNIR FRASES");
            System.out.println("6. REEMPLAZAR LETRA");
            System.out.println("7. CONTIENE LETRA");
            System.out.println("8. SALIR");
            System.out.println("Ingrese la opcion deseada");
            opMenu = leer.nextInt();

            switch (opMenu) {
                case 1:
                    cs.mostrarVocales(cadena1);
                    break;
                case 2:
                   cs.invertirCadena(cadena1);
                    break;
                case 3:
                   cs.vecesRepetido(cadena1);
                    break;
                case 4:
                   cs.compararLongitud(cadena1);
                    break;
                case 5:
                    cs.unirFrases(cadena1);
                    break;
                case 6:
                  cs.reemplazar(cadena1);
                    break;
                case 7:
                    cs.contiene(cadena1);
                    break;
                case 8:
                    System.out.println("Usted ha salido del sistema");
                default:
                    System.out.println("La opcion ingresada es incorrecta");
            }

        } while (opMenu != 8);
    }

    /*declaraciones de variables
        int n1, n2, suma;
        String cadena;
        leer el primer número
        cadena = JOptionPane.showInputDialog(null, "Introduce el primer número entero");                          
        n1 = Integer.parseInt(cadena); //obtener el int a partir del String cadena
        leer el segundo número
        cadena = JOptionPane.showInputDialog(null, "Introduce el segundo número entero");                         
        n2 = Integer.parseInt(cadena);  //obtener el int a partir del String cadena
        
        suma = n1 + n2;
        
        //mostrar resultados
        JOptionPane.showMessageDialog(null, "Ha introducido los números " + 
                                             n1 + " y " + n2 + "\n Suma: " + suma);*/
}
