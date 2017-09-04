/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_de_servicios;

import java.util.*;

/**
 *
 * @author Cristobal
 */
public class Tienda_de_Servicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("====================  Tienda de servicios  ====================");
        Scanner intro = new Scanner(System.in);
        int opc = 0;
        int codigo = 0;
        int cont = 0;
        int totalCompra = 0;
        int puntos = 0;
        int compraNueva = 0;
        int pagoPuntos = 0;

        {
            System.out.println("Ingrese codigo del producto");
            codigo = intro.nextInt();
            if (codigo >= 100 && codigo <= 150) {
                System.out.println("Articulos de aseo");
                totalCompra = 400 + totalCompra;
            }
            if (codigo > 150 && codigo <= 200) {
                System.out.println("Alimentos no perecibles");
                totalCompra = 800 + totalCompra;
            }
            if (codigo > 200 && codigo <= 250) {
                System.out.println("Conservas");
                totalCompra = 1000 + totalCompra;
            }
            if (codigo > 250 && codigo < 300) {
                System.out.println("Panaderia");
                totalCompra = 600 + totalCompra;
            }
            if (codigo > 300) {
                System.out.println("Error de codigo, Intente Nuevamente");
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Desea realizar alguna otra compra? 1 = SI/2 = NO");
            compraNueva = intro.nextInt();
        } while (compraNueva < 0 || compraNueva > 2);

        if (totalCompra <= 10000) {
            if (codigo >= 100 || codigo < 200) {
                puntos = totalCompra / 100;
            }
            if (codigo >= 200 || codigo < 300) {
                puntos = totalCompra / 50;
            }
        }
        if (totalCompra >= 10000) {
            if (codigo >= 100 || codigo < 200) {
                puntos = totalCompra / 50;
            }
            if (codigo >= 200 || codigo < 300) {
                puntos = totalCompra / 30;
            }
        }
        System.out.println("*******************************************************");
        System.out.println("Total a Pagar: $" + totalCompra);
        System.out.println("Puntos conseguidos en la Compra: " + puntos);
        System.out.println("*******************************************************");
        System.out.println("Desea pagar con punto su compra? 1 = SI/2 = NO");
        pagoPuntos = intro.nextInt();
        if (pagoPuntos == 1) {
            System.out.println("Compra pagada con puntos");
            System.out.println("Nos vemos!!! c:");
            System.out.println("*******************************************************");
        } else if (pagoPuntos == 2) {
            System.out.println("Compra realizada Existosamente");
            System.out.println("Nos vemos!!! c:");
            System.out.println("*******************************************************");
        }
    }
}
