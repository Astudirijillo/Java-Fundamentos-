
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Cristobal
 */
public class Notas {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double nota;

        System.out.println("==============  Notas  ==============");
        do {
			System.out.println("Ingrese la nota entre 1.0 y 7.0");
			nota = intro.nextDouble();		
            if (nota < 1.0 && nota >= 3.9) {
                System.out.println("Nota Insuficiente");
            } else if (nota <= 4.0 && nota >= 4.9) {
                System.out.println("Nota Suficiente");
            } else if (nota < 5.0 && nota <= 5.9) {
                System.out.println("Nota Buena");
            } else if (nota < 6.0 && nota <= 7.0) {
                System.out.println("Nota muy buena");
            }
        } while (nota > 1.0 && nota < 7.0);
    }
}
