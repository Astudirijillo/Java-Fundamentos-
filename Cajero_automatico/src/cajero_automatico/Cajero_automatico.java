/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automatico;

import java.util.*;

/**
 *
 * @author Cristobal
 */
public class Cajero_automatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc = 0;
        int eleccion = 0;
        int saldo = 0;
        int dinero = 0;
        Scanner intro = new Scanner(System.in);
        System.out.println("===============  Cajero Automatico ===============");
        System.out.println("Bienvenido que desea hacer");
        do {
            System.out.println("1.- Saldo Disponible ");
            System.out.println("2.- Depositos de dinero");
            System.out.println("3.- Giros de dinero");
            eleccion = intro.nextInt();
            System.out.println("***************************************************");
            switch (eleccion) {
                case 1:
                    System.out.println("Su cuenta posee actualmente $" + saldo);
                    break;
                case 2:
                    System.out.println("Cantidad de dinero a depositar");
                    dinero = intro.nextInt();
                    saldo = dinero + saldo;
                    System.out.println("Monto depositado exitosamente");
                    break;
                case 3:
                    System.out.println("Cantidad de dinero a retirar");
                    dinero = intro.nextInt();
                    saldo = saldo - dinero;
                    if (saldo < dinero) {
                        System.out.println("ERROR: El monto que ingreso es mayor al saldo existente");
                    }
                    break;
            }
            System.out.println("***************************************************");
            System.out.println("Desea continuar? 1. Si 2. No");
            opc = intro.nextInt();
            if (opc == 2){
                System.out.println("Nos vemos!! c:");
            }
            System.out.println("***************************************************");
        } while (opc == 1);
    }
}
