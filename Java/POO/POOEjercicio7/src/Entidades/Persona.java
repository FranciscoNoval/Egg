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
public class Persona {
    private String nombre;
    private int edad; 
    private String sexo;
    private float peso;
    private float altura;
    private int imc;
    private boolean mayorEdad;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, float peso, float altura, int imc, boolean mayorEdad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public int getImc() {
        return imc;
    }

    public boolean getMayorEdad() {
        return mayorEdad;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }
    
    
}
