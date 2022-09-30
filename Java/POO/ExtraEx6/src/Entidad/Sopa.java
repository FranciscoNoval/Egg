/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author German
 */
public class Sopa {
    
    private String[][] matriz;
    private String[] palabra = {"arbol", "letra", "perla", "recta", "lleno", "asado", "pilas", "dedos", "nadie", "julio"};

    public Sopa() {
    }

    public Sopa(String[][] matriz, String palabra) {
        this.matriz = matriz;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }
    
    
    
}
