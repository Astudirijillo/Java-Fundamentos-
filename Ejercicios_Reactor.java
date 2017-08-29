package reactor;

import java.util.*;

/**
 *
 * @author Cristobal
 */
public class Reactor {

    private static int dias = 7;

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        double prom;
        int[] temp = new int[dias];
        int aux = 0;

        System.out.println("=================  Reactor Nuclear  =================");
        for (int i = 0; i < 7; i++) {
            do {
                System.out.println("Ingrese la temperatura Dia N°" + (i + 1));
                temp[i] = intro.nextInt();
                if (temp[i] < 1000 || temp[i] > 1500) {
                    System.out.println("La temperatura ingresada esta incorrecta");
                    System.out.println("Intente nuevamente");
                    System.out.println("********************************************");
                }
            } while (temp[i] < 1000 || temp[i] > 1500);

            if (temp[i] >= 1000 && temp[i] <= 1100) {
                System.out.println("Temperatura Minima");
            } else if (temp[i] >= 1101 && temp[i] <= 1300) {
                System.out.println("Temperatura Normal");
            } else if (temp[i] >= 1301 && temp[i] <= 1500) {
                System.out.println("Temperatura Maxima");
            }
            System.out.println("********************************************");
        }
        for (int i = 0; i < 7; i++) {
            aux = temp[i] + aux;
            System.out.println("Temperatura dia N°" + i + ": " + temp[i] + "°C");
        }
        System.out.println("********************************************");
        prom = aux / 7;
        System.out.println("Promedio de las temperaturas por dia: " + prom + "°C");
        if (prom >= 1000 && prom <= 1100) {
            System.out.println("La temperatura promedio en la semana fue Minima");
        } else if (prom >= 1101 && prom <= 1300) {
            System.out.println("La temperatura promedio en la semana fue Normal");
        } else if (prom >= 1301 && prom <= 1500) {
            System.out.println("La temperatura promedio en la semana fue Maxima");
        }

    }
}
