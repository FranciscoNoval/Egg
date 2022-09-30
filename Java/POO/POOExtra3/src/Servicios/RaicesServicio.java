/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class RaicesServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Raices constructor() {
        Raices raices = new Raices();
        System.out.println("Ingrese 3 valores enteros para A, B y C");
        System.out.print("A: ");
        raices.setA(leer.nextInt());
        System.out.print("B: ");
        raices.setB(leer.nextInt());
        System.out.print("C: ");
        raices.setC(leer.nextInt());
        System.out.println("Los valores fueron seteados con exito!");
        System.out.println("");
        return raices;
    }

    public double getDiscriminante(Raices raices) {
        double discri = (Math.pow(raices.getB(), 2)-(4*raices.getA()*raices.getC()));
        //System.out.println("Este es el discriminante: "+discri);
        //System.out.println("");
        return discri;
    }

    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices)>= 0;
    }

    public boolean tieneRaiz(Raices raices) {
       return getDiscriminante(raices) == 0;
    }
    
    //(-b±√((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaices(Raices raices) {
        if (tieneRaices(raices) == true){
        double x1= (-(raices.getB()) + (Math.sqrt(getDiscriminante(raices))) )/(2*raices.getA());
        double x2= (-(raices.getB()) - (Math.sqrt(getDiscriminante(raices))) )/(2*raices.getA());
            System.out.println("Los valores para X son los siguientes");
            System.out.println("X1: "+x1);
            System.out.println("X2: "+x2);
        
        }
    }
    
     public void obtenerRaiz(Raices raices) {
         
     }

    public void calcular(Raices raices) {
    }

     
    
}
