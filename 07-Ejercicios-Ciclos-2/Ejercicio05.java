import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese numero N: ");
        int numero = teclado.nextInt();

        int factorial = 1;
        String sucesion = "";

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
            sucesion = sucesion + i;
            if (i < numero) {
                sucesion = sucesion + " x ";
            }
        }

        System.out.println("Factorial:");
        System.out.println(sucesion + " = " + factorial);
    }
}