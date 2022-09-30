/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class CuentaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /**
     * Crea la cuenta
     * @return 
     */
    public Cuenta crearCuenta(){
        Cuenta nc = new Cuenta();
        System.out.println("Ingrese sus datos para abrir la cuenta");
        System.out.print("Nombre y apellido: ");
        nc.setNombreApellido(leer.next());
        System.out.print("DNI: ");
        nc.setDni(leer.nextInt());
        System.out.print("Saldo con el que iniciará la cuenta: $");
        nc.setSaldoActual(leer.nextDouble());
        int m = 9999;
        int n = 999999;
        nc.setNumeroCuenta ((int)(Math.random()*(n-m+1)+m)); 
        System.out.println("Su cuenta fue creada con exito!");
        return nc;
    }
    
    /**
     * Deposita banco
     * @param nc 
     */
    public void ingreso(Cuenta nc){
        System.out.print("Ingrese la suma a depositar: $");
        double deposito = leer.nextInt();
        nc.setSaldoActual(nc.getSaldoActual()+deposito);
        System.out.println("Su deposito se ha hecho correctamente");
        System.out.println("");
        
        
    }
    /**
     * Extrae dinero
     * @param nc 
     */
    public void retiro(Cuenta nc){
        System.out.print("Ingrese la suma que quiere extraer: $");
        double extraccion = leer.nextInt();
        if (nc.getSaldoActual()> extraccion){
        nc.setSaldoActual(nc.getSaldoActual()-extraccion);
        System.out.println("Su extracción se ha hecho correctamente");
        System.out.println("");
        }else{
        System.out.println("Usted no tiene saldo suficiente para realizar la extracción");
        System.out.println("");    
        }
        
    }
    /**
     * Extrae dinero rapido
     * @param nc 
     */
    public void extraccionRapida(Cuenta nc){
        System.out.print("Ingrese la suma de su extraccion rápida: $");
        double extraccion = leer.nextInt();
        if (extraccion <= nc.getSaldoActual()*0.2){
        nc.setSaldoActual(nc.getSaldoActual()-extraccion);
        System.out.println("Su extracción se ha hecho correctamente");
        System.out.println("");
        }else{
        System.out.println("Usted no puede extraer mas del 20% de su saldo en una extracción rápida");
        System.out.println("");    
        
        }
       
    }
    /**
     * Consulta saldo
     * @param nc 
     */
    public void consultarSaldo(Cuenta nc){
        System.out.println("");
        System.out.println("Su saldo actual es de: $" + nc.getSaldoActual());
        System.out.println("");
    
    }
    /**
     * Consulta datos
     * @param nc 
     */
    public void consultarDatos(Cuenta nc){
        System.out.println("");
        System.out.println("Estos son los datos de la cuenta");
        System.out.println("-----------------------------------------------");
        System.out.println("Nº de Cuenta: "+nc.getNumeroCuenta());
        System.out.println("Titular: "+nc.getNombreApellido());
        System.out.println("DNI del Titular: "+nc.getDni());
        System.out.println("Saldo Actual de la cuenta: "+nc.getSaldoActual());
    
    }
}
