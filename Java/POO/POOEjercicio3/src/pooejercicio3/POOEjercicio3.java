/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio3;

import Entidades.Operacion;
import Servicios.OperacionServicio;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opMenu = 0;

        System.out.println("Menú Operacion");
        System.out.println("----------------------------------");
        Operacion operacion1 = os.crearOperacion();
        System.out.println("Presione ENTER para continuar");
        leer.nextLine();
        do {
            System.out.println("MENÚ OPERACIÓN");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("Ingrese la opcion deseada");
            opMenu = leer.nextInt();
            switch (opMenu) {
                case 1:
                    System.out.println("La suma de los números ingresados es: "+os.sumar(operacion1));
                    break;
                case 2:
                    System.out.println("La resta de los números ingresados es: "+os.restar(operacion1));
                    break;
                case 3:
                    if (os.multiplicar(operacion1) == 0){
                        System.out.println("La operacion es erronea, uno de los dos numeros es 0");
                    }else {
                    System.out.println("La multiplicación de los números ingresados es: "+os.multiplicar(operacion1));
                    }
                    break;
                case 4:
                    if (os.dividir(operacion1) == 0){
                        System.out.println("La operacion es erronea, uno de los dos numeros es 0");
                    }else {
                    System.out.println("La multiplicación de los números ingresados es: "+os.dividir(operacion1));
                    }
                    break;
                case 5:
                    System.out.println("Usted ha salido del sistema");

            }
        } while (opMenu != 5);

    }

}
