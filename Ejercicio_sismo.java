/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeoyensayo;

import java.util.*;

/**
 *
 * @author Cristobal
 */
public class TesteoyEnsayo {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);
        double sismo;
        double magnitudMax;
        double magnitudMin;
        double magnitudProm;

        System.out.println("====================  Evaluacion de Sismos  ====================");
        for (int i = 1; i < 11; i++) {

            System.out.println("Sismo N°" + i);
            System.out.println("Magnitud Minima");
            magnitudMin = intro.nextDouble();
            System.out.println("Magnitud Maxima");
            magnitudMax = intro.nextDouble();
            magnitudProm = (magnitudMax + magnitudMin) / 2;

            System.out.println("********************************************");
            System.out.println("El promedio del sismo es de: " + magnitudProm);
            if (magnitudProm < 4.0) {
                System.out.println("Se catalogaria como un sismo leve");
            }
            if (magnitudProm > 4.1 && magnitudProm <= 6.9) {
                System.out.println("Se catalogaria como un Sismo Medio");
            }
            if (magnitudProm > 7) {
                System.out.println("Se catalogaria como un Terremoto");
            }
            System.out.println("############################################");
        }
    }

}
