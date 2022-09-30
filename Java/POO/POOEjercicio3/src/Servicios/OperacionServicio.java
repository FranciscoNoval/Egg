/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class OperacionServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion(){
        
        Operacion op = new Operacion();
        System.out.print("Ingrese el primer número: ");
        op.setNum1(leer.nextInt());
        System.out.print("Ingrese el segundo número: ");
        op.setNum2(leer.nextInt());
                
        return op;
    }
    
    public double sumar(Operacion op){
        
        double suma = op.getNum1() + op.getNum2();
        System.out.println("");
        return suma;
    }
    
    public double restar(Operacion op){
    double resta = op.getNum1() - op.getNum2();
        System.out.println("");
        return resta;
    }
    
    public double multiplicar(Operacion op){
        double multi;
        if (op.getNum1() == 0 || op.getNum2() == 0){
        multi = 0;
        }else{  
        multi = op.getNum1() * op.getNum2();
       }
        return multi;
    }    
    
    
    public double dividir(Operacion op){
        double divid;
        if (op.getNum1() == 0 || op.getNum2() == 0){
        divid = 0;
        }else{  
        divid = op.getNum1() / op.getNum2();
       }
        return divid;
    }    
}
