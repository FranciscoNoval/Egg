/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        Cadena laFrase = new Cadena();
        System.out.println("Ingrese una frase");
        laFrase.setFrase(leer.next());
        laFrase.setLongitud(laFrase.getFrase().length());
        System.out.println("La cadena fue creada exitosamente!");
        System.out.println("");
       
        return laFrase;
    }

    public void mostrarVocales(Cadena laFrase) {
        int cantVocales = 0;
        String vocales = "aeiou";
        for (int i = 0; i < laFrase.getLongitud(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (vocales.substring(j, j+1).equalsIgnoreCase(laFrase.getFrase().substring(i, i+1))) {
                    cantVocales++;
                }
            }
        }
        System.out.println("Tiene " + cantVocales + " Vocales");
        System.out.println("");
        
    }

    /*
    public void invertirFrase(Cadena fr){
        StringBuilder inversa = new StringBuilder(fr.getFrase());
        System.out.println("Frase Original: " + fr.getFrase());
        System.out.println("Frase Invertida: " + inversa.reverse().toString());
    }*/

    public void invertirCadena(Cadena laFrase) {
        System.out.println("\"La frase inversa es: ");
        for (int i = laFrase.getLongitud() - 1; i >= 0; i--) {
            System.out.print(laFrase.getFrase().charAt(i));
          //System.out.print(laFrase.getFrase().substring(i-1, i));
        }
        System.out.println("");
      
    }

    public void vecesRepetido(Cadena laFrase) {
        int cont = 0;
        System.out.println("Ingrese la letra que quiere buscar");
        String caract = leer.next();
        for (int i = 0; i < laFrase.getLongitud(); i++) {
            if (caract.equalsIgnoreCase(laFrase.getFrase().substring(i, i + 1))) {
                cont++;

            }
        }
        System.out.println("El caracter " + caract + " esta repetido " + cont + " veces");
        System.out.println("");
        
    }

    public void compararLongitud(Cadena laFrase) {
        System.out.println("Ingrese otra frase");
        String otraFrase = leer.next();
        if (laFrase.getLongitud() == otraFrase.length()) {
            System.out.println("Las dos frases tienen la misma longitud");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }
         System.out.println("");
        
    }

    public void unirFrases(Cadena laFrase) {
        System.out.println("Ingrese otra frase");
        String otraFrase = leer.next();
        System.out.println("Aquí estan las frases unidas");
        System.out.println(laFrase.getFrase().concat(" " + otraFrase));
        System.out.println("");
        System.out.println("Presione ENTER para continuar");
        leer.nextLine();
    }

    public void reemplazar(Cadena laFrase) {
        System.out.println("Ingrese la letra que quiere reemplazar");
        String vocal = leer.next();
        String fraseNueva = "";
        for (int i = 0; i < laFrase.getLongitud(); i++){
            if ("A".equalsIgnoreCase(laFrase.getFrase().substring(i, i+1))){
             fraseNueva = fraseNueva.concat(vocal);
            }else {
            fraseNueva = fraseNueva.concat(laFrase.getFrase().substring(i, i+1));
            }
        }
        System.out.println("La nueva frase es: "+fraseNueva);
        System.out.println("");
        
       /* fraseNueva = laFrase.getFrase().replaceFirst("a", vocal);
        System.out.println("La nueva frase es: "+fraseNueva);*/
    }
    
    public void contiene(Cadena laFrase){
        boolean esta = false;
        System.out.println("Ingrese la letra que quiere buscar");
        String vocal = leer.next();
        for (int i = 0; i < laFrase.getLongitud(); i++) {
            if (vocal.equalsIgnoreCase(laFrase.getFrase().substring(i, i + 1))) {
                esta = true;
            
            }
        }
        System.out.println("Se ha encontrado la letra ingresada?: "+esta);
        System.out.println("");
       
    }
}
