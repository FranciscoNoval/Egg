/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Flia. Noval
 */
public class Nif {
     private long dni;
    private char letra;

    public Nif() {
    }

    public Nif(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public char getLetra() {
        return letra;
    }
}
