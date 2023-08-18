import java.util.Scanner;

public class Ejercicio06{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese numero N: ");
        int numero_1 = teclado.nextInt();

        System.out.print("Ingrese numero M: ");
        int numero_2 = teclado.nextInt();

        for (int contador = numero_1; contador <= numero_2; contador++) {
            int factorial = 1;
            String sucesion = "";

            for (int valor = 1; valor <= contador; valor++) {
                factorial = factorial * valor;
                sucesion = sucesion + valor;
                if (valor < contador) {
                    sucesion = sucesion + " x ";
                }
            }

            System.out.println("Factorial de " + contador + " (" + contador + "!):");
            System.out.println(sucesion + " = " + factorial);
        }    
    }
}