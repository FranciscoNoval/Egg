/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class PuntosServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   public Puntos crearPuntos(){
       Puntos puntos = new Puntos();
       System.out.println("Ingrese las coordenadas de dos puntos en un grafico de 20 X 20 puntos");
       System.out.println("Coordenadas del primer punto (entre 0 y 20)");
       System.out.print("X1: ");
       puntos.setX1(leer.nextInt());
       System.out.print("Y1: ");
       puntos.setY1(leer.nextInt());
       System.out.println("Coordenadas del segundo punto(entre 0 y 20)");
       System.out.print("X2: ");
       puntos.setX2(leer.nextInt());
       System.out.print("Y2: ");
       puntos.setY2(leer.nextInt());
       while (puntos.getX1() < 0 || puntos.getX1() > 20 || puntos.getY1() < 0 || puntos.getY1() > 20 
               || puntos.getX2() < 0 || puntos.getX2() > 20 || puntos.getY2() < 0 || puntos.getY2() > 20  ){
       
           System.out.println("Alguno de los numeros ingresados es incorrecto, recuerde ingresar numeros entr 0 y 20");
           System.out.println("Coordenadas del primer punto (entre 0 y 20)");
       System.out.print("X1: ");
       puntos.setX1(leer.nextInt());
       System.out.print("Y1: ");
       puntos.setY1(leer.nextInt());
       System.out.println("Coordenadas del segundo punto(entre 0 y 20)");
       System.out.print("X2: ");
       puntos.setX2(leer.nextInt());
       System.out.print("Y2: ");
       puntos.setY2(leer.nextInt());
       }
       System.out.println("Las coordenadas fueron seteadas con exito!");
       System.out.println("Punto 1: "+puntos.getX1()+", "+puntos.getY1());
       System.out.println("Punto 2: "+puntos.getX2()+", "+puntos.getY2());
       System.out.println("");
       return puntos;
   }
   
   public void calcularDistancia(Puntos puntos){
       int distancia = (int)Math.sqrt(Math.pow((puntos.getX1()- puntos.getX2()), 2)+Math.pow((puntos.getY1()- puntos.getY2()), 2));
       System.out.println("La distancia entre los puntos P1: ["+puntos.getX1()+", "+puntos.getY1()+"] y P2: ["
               +puntos.getX2()+", "+puntos.getY2()+"] es: "+distancia);
       System.out.println("");
   }
}
