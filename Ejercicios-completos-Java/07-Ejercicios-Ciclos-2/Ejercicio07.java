import java.util.Scanner;

public class Ejercicio07{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese numero N (impar): ");
        int numero = teclado.nextInt();

        if (numero % 2 != 0) {
            int mitad = numero / 2;
            int espacios = mitad;

            // Parte superior del rombo
            for (int contador = 1; contador <= mitad + 1; contador++) {
                for (int parte_superior = 1; parte_superior <= espacios; parte_superior++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * contador - 1; k++) {
                    System.out.print("x");
                }
                System.out.println();
                espacios--;
            }

            // Parte inferior del rombo
            espacios = 1;
            for (int contador = mitad; contador >= 1; contador--) {
                for (int parte_superior = 1; parte_superior <= espacios; parte_superior++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * contador - 1; k++) {
                    System.out.print("x");
                }
                System.out.println();
                espacios++;
            }
        } else {
            System.out.println("El numero ingresado no es impar.");
        }
    }
}