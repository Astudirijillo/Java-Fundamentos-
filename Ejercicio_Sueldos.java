
import java.util.*;

/**
 *
 * @author Cristobal
 */
public class sueldos {

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);
        int cont = 1;
        int empleados = 0;
        int grado = 0;
        int horas = 0;
        int horasExtra = 0;
        double sueldoHorasExtra = 0;
        double sueldoBase = 0;
        int isapre = 0;
        int afp = 0;
        double sueldoLiquido = 0;
        double aux = 0;

        System.out.println("================  Salarios finales  ================");

        System.out.println("Cantidad de empleados");
        empleados = intro.nextInt();

        System.out.println("******************************************************");
        do {
            System.out.println("Ingrese grado del empleado N°" + (cont));
            grado = intro.nextInt();
            if (grado == 1) {
                sueldoBase = 450000;
            } else if (grado == 2) {
                sueldoBase = 550000;
            } else if (grado == 3) {
                sueldoBase = 700000;
            }
            System.out.println("******************************************************");
            System.out.println("Ingrese horas trabajadas");
            horas = intro.nextInt();
            if (horas > 40) {
                horasExtra = horas - 40;
                if (horasExtra >= 1 && horasExtra <= 3) {
                    sueldoHorasExtra = horasExtra * 2000;
                }
                if (horasExtra >= 4 && horasExtra <= 7) {
                    sueldoHorasExtra = horasExtra * 3000;
                }
                if (horasExtra > 7) {
                    sueldoHorasExtra = horasExtra * 3500;
                }
            }
            sueldoBase = sueldoLiquido;
            System.out.println("******************************************************");
            System.out.println("Seleccione la Isapre a la cual se encuentra afiliado");
            System.out.println("1.- Colmena");
            System.out.println("2.- Ban Medica");
            System.out.println("3.- Vida 3");
            System.out.println("4.- Fonasa");
            afp = intro.nextInt();
            switch (afp) {
                case 1:
                    aux = (sueldoBase * 0.065);
                    sueldoLiquido = sueldoLiquido - aux;
                    break;
                case 2:
                    aux = (sueldoBase * 0.073);
                    sueldoLiquido = sueldoLiquido - aux;
                    break;
                case 3:
                    aux = (sueldoBase * 0.07);
                    sueldoLiquido = sueldoLiquido - aux;
                    break;
                case 4:
                    aux = (sueldoBase * 0.07);
                    sueldoLiquido = sueldoLiquido - aux;
                    break;
            }
            System.out.println("******************************************************");
            System.out.println("Seleccione la AFP a la cual se encuentra afiliado");
            System.out.println("1.- BanSander");
            System.out.println("2.- Geometrica SA");
            System.out.println("3.- Cumprum");
            System.out.println("4.- Provida");
            isapre = intro.nextInt();
            switch (isapre) {
                case 1:
                    aux = (sueldoBase * 0.12);
                    sueldoLiquido = sueldoLiquido - aux;
                    break;
                case 2:
                    aux = (sueldoBase * 0.012);
                    sueldoLiquido = sueldoLiquido - aux;
                    break;
                case 3:
                    aux = (sueldoBase * 0.07);
                    sueldoLiquido = sueldoLiquido - aux;
                    break;
                case 4:
                    aux = (sueldoBase * 0.07);
                    sueldoLiquido = sueldoLiquido - aux;
                    break;
            }
            System.out.println("******************************************************");
            System.out.println("Empleado N°" + cont);
            System.out.println("Sueldo final incluyendo descuentos:");
            System.out.println("$" + sueldoLiquido);
            cont++;
        } while (cont == empleados);
    }
}
