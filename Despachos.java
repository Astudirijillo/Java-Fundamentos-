
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
        int cantCamionesPequeños = 2;
        double camionPequeño = 15;
        double estanqueCamionPequeño = 40;
        double camionGrande = 12;
        double estanqueCamionGrande = 60;
        int carga = 0;
        int opc = 0;
        int peso;
        int repetir = 0;
        double distanciaRecorridaPequeño = 0;
        double distanciaRecorridaGrande = 0;
        int destino = 0;
        double gastoRecorrido = 0;
        int recorridoGrande = 0;
        int recorridoPequeño = 0;
        double aux3;
        double combustiblePequeño = 0;
        double combustibleGrande = 0;

        do {
            System.out.println("Tamaño del paquete a enviar en Kg. :");
            peso = intro.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            if (peso < 500) {
                System.out.println("Camiones Disponibles para el paquete a enviar:");
                System.out.println("Camiones Pequeños");
                System.out.println("N° de Camiones disponibles: " + cantCamionesPequeños);
                System.out.println("Petroleo en estanque (Entre ambos camiones): " + (estanqueCamionPequeño * 2) + " L");
                if (cantCamionesPequeños == 0) {
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
                    gastoRecorrido = (int) (caminoCiudad1 / (camionPequeño - aux));
                    aux3 = caminoCiudad1 / 15;
                    estanqueCamionPequeño = (camionPequeño - gastoRecorrido) - aux3;
                    combustiblePequeño = aux3 + gastoRecorrido;
                }
                if (destino == 2) {
                    distanciaRecorridaGrande = caminoCiudad2 + distanciaRecorridaGrande;
                    aux = (15 * 20) / 100;
                    gastoRecorrido = (int) (caminoCiudad2 / (camionPequeño - aux));
                    aux3 = caminoCiudad2 / 15;
                    estanqueCamionPequeño = (camionPequeño - gastoRecorrido) - aux3;
                    combustiblePequeño = aux3 + gastoRecorrido;
                }
                if (destino == 3) {
                    distanciaRecorridaGrande = caminoCiudad3 + distanciaRecorridaGrande;
                    aux = (15 * 20) / 100;
                    gastoRecorrido = (int) (caminoCiudad3 / (camionPequeño - aux));
                    aux3 = caminoCiudad3 / 15;
                    estanqueCamionPequeño = (camionPequeño - gastoRecorrido) - aux3;
                    combustiblePequeño = aux3 + gastoRecorrido;
                }
                recorridoPequeño++;
            } else if (peso > 500) {
                System.out.println("Camiones Disponibles para el paquete a enviar:");
                System.out.println("Camion Grande");
                System.out.println("N° de Camiones disponibles: " + cantCamionesGrandes);
                System.out.println("Petroleo en estanque: " + estanqueCamionPequeño + " L");
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
                    gastoRecorrido = (int) (caminoCiudad1 / (camionPequeño - aux));
                    aux3 = caminoCiudad1 / 12;
                    estanqueCamionPequeño = (camionPequeño - gastoRecorrido) - aux3;
                    combustibleGrande = aux3 + gastoRecorrido;
                }
                if (destino == 2) {
                    distanciaRecorridaGrande = caminoCiudad2 + distanciaRecorridaGrande;
                    aux = (12 * 30) / 100;
                    gastoRecorrido = (int) (caminoCiudad2 / (camionPequeño - aux));
                    aux3 = caminoCiudad2 / 12;
                    estanqueCamionPequeño = (camionPequeño - gastoRecorrido) - aux3;
                    combustibleGrande = aux3 + gastoRecorrido;
                }
                if (destino == 3) {
                    distanciaRecorridaGrande = caminoCiudad3 + distanciaRecorridaGrande;
                    aux = (12 * 30) / 100;
                    gastoRecorrido = (int) (caminoCiudad3 / (camionPequeño - aux));
                    aux3 = caminoCiudad3 / 12;                    
                    estanqueCamionPequeño = (camionPequeño - gastoRecorrido) - aux3;
                    combustibleGrande = aux3 + gastoRecorrido;
                }
                recorridoGrande++;
            }
            System.out.println("Desea realizar alguna otra operacion? 1=SI / 2=NO");
            repetir = intro.nextInt();
            System.out.println("***************************************************************");
        } while (repetir == 1);
        System.out.println("********************************   Resumen Diario  ********************************");
        System.out.println("Camiones Pequeños");
        System.out.println("Recorridos: " + recorridoPequeño);
        System.out.println("Distancia Recorrida en total: " + (distanciaRecorridaPequeño * 2));
        System.out.println("Combustible usado en Litros: " + combustiblePequeño+" L");
        System.out.println("Combustible restante en Litros: " + estanqueCamionPequeño+" L");
        System.out.println("Gasto realizado en combustible: $"+(combustiblePequeño*480));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Camion Grande");
        System.out.println("Recorridos: " + recorridoGrande);
        System.out.println("Distancia Recorrida en total: " + (distanciaRecorridaGrande * 2));
        System.out.println("Combustible usado en Litros: " + combustibleGrande+" L");
        System.out.println("Combustible restante en Litros: " + estanqueCamionGrande+" L");
        System.out.println("Gasto realizado en combustible: $"+(combustibleGrande*480));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total de combustible consumido: "+(combustibleGrande+combustiblePequeño)+" L");
        System.out.println("Gasto en combustible del dia: $"+((combustibleGrande*480)+(combustiblePequeño*480)));
    }

}
