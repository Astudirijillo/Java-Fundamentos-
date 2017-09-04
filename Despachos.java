
package despacho;

import java.util.*;

public class Despacho {

    public static void main(String[] args) {

        System.out.println("====================  Empresa de Despacho  ====================");

        Scanner intro = new Scanner(System.in);
        double caminoCiudad1 = 25;
        double caminoCiudad2 = 13;
        double caminoCiudad3 = 20;
        int rendimiento;
        double aux;
        int cantCamionesGrandes = 1;
        int cantCamionesPeque�os = 2;
        double camionPeque�o = 15;
        double estanqueCamionPeque�o = 40;
        double camionGrande = 12;
        double estanqueCamionGrande = 60;
        int carga = 0;
        int opc = 0;
        int peso;
        int repetir = 0;
        double distanciaRecorridaPeque�o = 0;
        double distanciaRecorridaGrande = 0;
        int destino = 0;
        double gastoRecorrido = 0;
        int recorridoGrande = 0;
        int recorridoPeque�o = 0;
        double aux3;
        double combustiblePeque�o = 0;
        double combustibleGrande = 0;

        do {
            System.out.println("Tama�o del paquete a enviar en Kg. :");
            peso = intro.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            if (peso < 500) {
                System.out.println("Camiones Disponibles para el paquete a enviar:");
                System.out.println("Camiones Peque�os");
                System.out.println("N� de Camiones disponibles: " + cantCamionesPeque�os);
                System.out.println("Petroleo en estanque (Entre ambos camiones): " + (estanqueCamionPeque�o * 2) + " L");
                if (cantCamionesPeque�os == 0) {
                    System.out.println("No hay disponibilidad por el momento");
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Ciudad de destino");
                System.out.println("1.- Ciudad 1");
                System.out.println("2.- Ciudad 2");
                System.out.println("2.- Ciudad 3");
                destino = intro.nextInt();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                if (destino == 1) {
                    distanciaRecorridaGrande = caminoCiudad1 + distanciaRecorridaGrande;
                    aux = (15 * 20) / 100;
                    gastoRecorrido = (int) (caminoCiudad1 / (camionPeque�o - aux));
                    aux3 = caminoCiudad1 / 15;
                    estanqueCamionPeque�o = (camionPeque�o - gastoRecorrido) - aux3;
                    combustiblePeque�o = aux3 + gastoRecorrido;
                }
                if (destino == 2) {
                    distanciaRecorridaGrande = caminoCiudad2 + distanciaRecorridaGrande;
                    aux = (15 * 20) / 100;
                    gastoRecorrido = (int) (caminoCiudad2 / (camionPeque�o - aux));
                    aux3 = caminoCiudad2 / 15;
                    estanqueCamionPeque�o = (camionPeque�o - gastoRecorrido) - aux3;
                    combustiblePeque�o = aux3 + gastoRecorrido;
                }
                if (destino == 3) {
                    distanciaRecorridaGrande = caminoCiudad3 + distanciaRecorridaGrande;
                    aux = (15 * 20) / 100;
                    gastoRecorrido = (int) (caminoCiudad3 / (camionPeque�o - aux));
                    aux3 = caminoCiudad3 / 15;
                    estanqueCamionPeque�o = (camionPeque�o - gastoRecorrido) - aux3;
                    combustiblePeque�o = aux3 + gastoRecorrido;
                }
                recorridoPeque�o++;
            } else if (peso > 500) {
                System.out.println("Camiones Disponibles para el paquete a enviar:");
                System.out.println("Camion Grande");
                System.out.println("N� de Camiones disponibles: " + cantCamionesGrandes);
                System.out.println("Petroleo en estanque: " + estanqueCamionPeque�o + " L");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Ciudad de destino");
                System.out.println("1.- Ciudad 1");
                System.out.println("2.- Ciudad 2");
                System.out.println("2.- Ciudad 3");
                destino = intro.nextInt();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                if (destino == 1) {
                    distanciaRecorridaGrande = caminoCiudad1 + distanciaRecorridaGrande;
                    aux = (12 * 30) / 100;
                    gastoRecorrido = (int) (caminoCiudad1 / (camionPeque�o - aux));
                    aux3 = caminoCiudad1 / 12;
                    estanqueCamionPeque�o = (camionPeque�o - gastoRecorrido) - aux3;
                    combustibleGrande = aux3 + gastoRecorrido;
                }
                if (destino == 2) {
                    distanciaRecorridaGrande = caminoCiudad2 + distanciaRecorridaGrande;
                    aux = (12 * 30) / 100;
                    gastoRecorrido = (int) (caminoCiudad2 / (camionPeque�o - aux));
                    aux3 = caminoCiudad2 / 12;
                    estanqueCamionPeque�o = (camionPeque�o - gastoRecorrido) - aux3;
                    combustibleGrande = aux3 + gastoRecorrido;
                }
                if (destino == 3) {
                    distanciaRecorridaGrande = caminoCiudad3 + distanciaRecorridaGrande;
                    aux = (12 * 30) / 100;
                    gastoRecorrido = (int) (caminoCiudad3 / (camionPeque�o - aux));
                    aux3 = caminoCiudad3 / 12;                    
                    estanqueCamionPeque�o = (camionPeque�o - gastoRecorrido) - aux3;
                    combustibleGrande = aux3 + gastoRecorrido;
                }
                recorridoGrande++;
            }
            System.out.println("Desea realizar alguna otra operacion? 1=SI / 2=NO");
            repetir = intro.nextInt();
            System.out.println("***************************************************************");
        } while (repetir == 1);
        System.out.println("********************************   Resumen Diario  ********************************");
        System.out.println("Camiones Peque�os");
        System.out.println("Recorridos: " + recorridoPeque�o);
        System.out.println("Distancia Recorrida en total: " + (distanciaRecorridaPeque�o * 2));
        System.out.println("Combustible usado en Litros: " + combustiblePeque�o+" L");
        System.out.println("Combustible restante en Litros: " + estanqueCamionPeque�o+" L");
        System.out.println("Gasto realizado en combustible: $"+(combustiblePeque�o*480));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Camion Grande");
        System.out.println("Recorridos: " + recorridoGrande);
        System.out.println("Distancia Recorrida en total: " + (distanciaRecorridaGrande * 2));
        System.out.println("Combustible usado en Litros: " + combustibleGrande+" L");
        System.out.println("Combustible restante en Litros: " + estanqueCamionGrande+" L");
        System.out.println("Gasto realizado en combustible: $"+(combustibleGrande*480));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total de combustible consumido: "+(combustibleGrande+combustiblePeque�o)+" L");
        System.out.println("Gasto en combustible del dia: $"+((combustibleGrande*480)+(combustiblePeque�o*480)));
    }

}
