/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancoej5;

/**
 *
 * @author Jololo
 */
public class Cuenta {

    private int numeroCuenta;
    private int dni;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public void ingresar(double plata) {        
        saldoActual += plata;
        System.out.println("Tu saldo es de: " + saldoActual);
    }

    public void retirar(double plata) {
        
        if (plata < saldoActual) {
            this.saldoActual -= plata;
            System.out.println("Tu saldo es de: " + this.saldoActual);
        } else {

            System.out.println("Saldo insuficiente, solo se retiro: " + (this.saldoActual) + " faltaron:  " + (plata - saldoActual));
            this.saldoActual = 0;
            System.out.println("Tu saldo actual es de: " + this.saldoActual);
        }
    }

    public double consultarSaldo() {
        return getSaldoActual();
    }

    public void consultarDatos() {
        System.out.println("Numero de cuenta: " + numeroCuenta + " DNI: " + dni + " Saldo Actual: " + saldoActual);
    }

    public void extraccionRapida(double plata) {
        
        if (plata > (saldoActual * 0.2)) {
            System.out.println("Error, excede el 20% de limite");
            System.out.println("Tu saldo es de: " + this.saldoActual);
        } else {
            saldoActual -= plata;
            System.out.println("Tu saldo es de: " + this.saldoActual);
        }
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

}
