/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio5;

import Entidades.Cuenta;
import Servicios.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaServicio cs = new CuentaServicio();
        
        System.out.println("BANCO DE NOVAL");
        System.out.println("----------------------------------------------------");
        System.out.println("Abra su cuenta");
        Cuenta cta = cs.crearCuenta();
        System.out.println("Gracias por elegirnos! Usted ahora es cliente del BANCO DE NOVAL");
        leer.nextLine();
        int opMenu = 0;
        do {
            System.out.println("CAJERO AUTOMÁTICO");
            System.out.println("------------------------");
            System.out.println("1. DEPOSITOS");
            System.out.println("2. EXTRACCION");
            System.out.println("3. EXTRACCIÓN RÁPIDA");
            System.out.println("4. CONSULTAR SALDO");
            System.out.println("5. DATOS DE LA CUENTA");
            System.out.println("6. SALIR DEL SISTEMA");
            System.out.println("------------------------");
            System.out.println("Ingrese la opcion deseada");
            opMenu = leer.nextInt();
            switch (opMenu) {
                case 1:
                    cs.ingreso(cta);
                    break;
                case 2:
                    cs.retiro(cta);
                    break;
                case 3:
                    cs.extraccionRapida(cta);
                    break;
                case 4:
                   cs.consultarSaldo(cta);
                    break;
                case 5:
                    cs.consultarDatos(cta);
                    break;
                case 6:    
                    System.out.println("Usted ha salido del sistema");
            }
        } while (opMenu != 6);
    }

}
