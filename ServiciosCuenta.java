/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancoej5.cuentaServicios;

import com.mycompany.bancoej5.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Jololo
 */
public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        
        System.out.println("Escriba su numero de cuenta:");
        
        int cuenta = leer.nextInt();
        
        System.out.println("Escriba su numero de DNI");
        
        int dni = leer.nextInt();
        
        System.out.println("Ingrese su saldo actual");
        
        int saldoActual = leer.nextInt();

        return new Cuenta(cuenta, dni, saldoActual);
    }
}
