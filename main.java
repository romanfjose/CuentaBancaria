/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancoej5;

import com.mycompany.bancoej5.cuentaServicios.ServiciosCuenta;
import java.util.Scanner;

/**
 *
 * @author Jololo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bievenido a Cuenta Bancaria \nIngrese sus datos\n");
        int a = 0;
        ServiciosCuenta sc = new ServiciosCuenta();
        Cuenta nueva = sc.crearCuenta();
        do {

            System.out.println("Menu");
            System.out.println("1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Extraccón Rápida");
            System.out.println("5. Consultar datos de la cuenta");
            System.out.println("0. Salir del menu");
            a = leer.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Cuanto dinero ingresa: ");
                    nueva.ingresar(leer.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese dinero a retirar: ");
                    nueva.retirar(leer.nextDouble());
                    break;
                case 3:
                    System.out.println("Su saldo actual es:" + nueva.getSaldoActual());
                    break;
                case 4:
                    System.out.println("Advertencia : La extracción rápida solo permite hasta un 20% del total de la cuenta \nIngrese dinero a retirar: ");
                    nueva.extraccionRapida(leer.nextDouble());
                    break;
                case 5:
                    System.out.println("Su numero de cuenta es: " + nueva.getNumeroCuenta() + "\nSu dni es: " + nueva.getDni() + "\nSu saldo es: " + nueva.getSaldoActual());

                    break;
                case 0:
                    System.out.println("Gracias por usar la Cuenta Bancaria");
                    break;
                default:
                    System.out.println("Opción no valida\n");
                    ;
            }
        } while (a != 0);

    }//main

}
