import java.util.Scanner;

public class Ejercicio11{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero;


        System.out.println("Escribir un programa que determine si una cadena ingresada por el usuario es un número par o impar.");

        System.out.print("Ingresa un numero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
    }
}