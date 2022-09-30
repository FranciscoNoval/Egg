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
public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;
    private String nombreApellido;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual, String nombreApellido) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.nombreApellido = nombreApellido;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
    public String getNombreApellido() {
        return nombreApellido;
    }
    
}
