/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class NifServicio {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");  
   
   public Nif crearNif(){
       Nif nif = new Nif();
       final char arr[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 
       'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' }; 
       System.out.println("Ingrese su DNI");
       nif.setDni(leer.nextLong());
       int posicion = (int)nif.getDni()%23;
       nif.setLetra(arr[posicion]);
       return nif;
   }
   
   public void mostrar(Nif nif){
       System.out.println("Su DNI con el dígito verificador correspondiente es: "
               +(nif.getDni())+"-"+nif.getLetra());
   }
    
}
