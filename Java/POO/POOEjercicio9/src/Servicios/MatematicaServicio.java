/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author Flia. Noval
 */
    public class MatematicaServicio {
    
    public void devolverMayor(Matematica mat){
       if(mat.getNum1() == mat.getNum2()){
           System.out.println("Los dos numeros son iguales");
       }else {
           System.out.println("El mayor es: "+Math.max(mat.getNum1(), mat.getNum2()));
           System.out.println("");
       }
    }
    
    public void calcularPotencia(Matematica mat){
        double mayor = Math.max(mat.getNum1(), mat.getNum2());
        double menor = Math.min(mat.getNum1(), mat.getNum2());
        System.out.println("La potencia del numero mayor elevado al numero menor");
        System.out.println("es: "+ Math.pow(mayor, menor));
        System.out.println("");
    }
    
    public void calcularRaiz(Matematica mat){
    double menor = Math.abs(Math.min(mat.getNum1(), mat.getNum2()));
    
        System.out.println("La raiz cuadrada del menos es: "+Math.abs(Math.sqrt(menor)));
        System.out.println("");
    }
}
