/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta_autos;

import java.util.*;

/**
 *
 * @author Cristobal
 */
public class Venta_Autos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int cantVehiculos = 0;
        int cont = 1;
        int marca = 0;
        int año = 0;
        int valorVehiculo = 0;
        int i;
        int valorCompra = 0;
        int comision = 0;
        int comisionVehiculo = 0;

        System.out.println("=====================  Automotora  =====================");
        System.out.println("Ingrese cantidad de vehiculos a vender");
        cantVehiculos = intro.nextInt();
        do {
            System.out.println("####################  Vehiculo N°" + cont + "  ####################");
                            
                System.out.println("1.- Toyota");
                System.out.println("2.- Mitsubishi");
                System.out.println("3.- Subaru");
            do {
                System.out.print("Marca del vehiculo: ");
                marca = intro.nextInt();
                if (marca < 1 || marca > 3) {
                    System.out.println("Marca del vehiculo incorrecta");
                    System.out.println("Intente Nuevamente");
                    System.out.println("***********************************************************");
                }
            } while (marca < 1 || marca > 3);
            System.out.println("***********************************************************");
            
            do {
                System.out.println("1.- 2005");
                System.out.println("2.- 2010");
                System.out.print("Año del Vehiculo: ");
                año = intro.nextInt();
                if (año < 1 || año > 2) {
                    System.out.println("Año del vehiculo incorrecto");
                    System.out.println("Intente Nuevamente");
                    System.out.println("***********************************************************");                    
                }
                System.out.println("***********************************************************");
            } while (año < 1 || año > 2);

            if (marca == 1) {
                if (año == 1) {
                    valorCompra = 13000000;
                } else if (año == 2) {
                    valorCompra = 20000000;
                }
            }
            if (marca == 2) {
                if (año == 1) {
                    valorCompra = 15000000;
                } else if (año == 2) {
                    valorCompra = 23000000;
                }
            }
            if (marca == 3) {
                if (año == 1) {
                    valorCompra = 12000000;
                } else if (año == 2) {
                    valorCompra = 21500000;
                }
            }
            comision = (int) (valorCompra * 0.10);
            valorVehiculo = valorCompra;
            comisionVehiculo = comision;
            System.out.println("***********************************************************");
            System.out.println("##################  Resumen Vehiculo N°" + cont+"  ##################");
            if (marca == 1) {
                System.out.println("- Marca del vehiculo: Toyota");
            } else if (marca == 2) {
                System.out.println("- Marca del Vehiculo: Mitsubishi");
            } else if (marca == 3) {
                System.out.println("- Marca del Vehiculo: Subaru");
            }
            if (año == 1) {
                System.out.println("- Año del vehiculo: 2005");
            } else if (año == 2) {
                System.out.println("- Año del vehiculo: 2010");
            }
            System.out.println("- Valor de la compra: $" + valorVehiculo);
            System.out.println("- Comision por venta: $" + comisionVehiculo);
            cont++;
        } while (cont == cantVehiculos);
        System.out.println("***********************************************************");
    }
}
