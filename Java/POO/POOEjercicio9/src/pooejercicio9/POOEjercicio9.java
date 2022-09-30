/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio9;

import Entidades.Matematica;
import Servicios.MatematicaServicio;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MatematicaServicio ms = new MatematicaServicio();
        Matematica operaciones = new Matematica();
        operaciones.setNum1(Math.random());
        operaciones.setNum2(Math.random());
        
        System.out.println("El numero 1 es: "+Math.abs(operaciones.getNum1()));
        System.out.println("El numero 2 es: "+Math.abs(operaciones.getNum2()));
        System.out.println("");
        System.out.println("Estas son las operaciones realizadas con ambos numeros");
        System.out.println("");
        ms.devolverMayor(operaciones);
        ms.calcularPotencia(operaciones);
        ms.calcularRaiz(operaciones);
    }
    
}
