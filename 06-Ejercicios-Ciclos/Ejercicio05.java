import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        int numero_anterior = 0;
        int numero_siguiente = 1;

        System.out.println("Sucesión de Fibonacci hasta el número " + numero + ":");
        System.out.print(numero_anterior + " ");

        for (int i = 0; i < numero; i++) {
            System.out.print(numero_anterior + " ");
            int siguiente = numero_anterior + numero_siguiente;
            numero_anterior = numero_siguiente;
            numero_siguiente = siguiente;
        }

        System.out.println();
    }
}