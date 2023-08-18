import java.util.Scanner;

public class Ejercicio07{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Escribir un programa que determine si un numero entero ingresado por el usuario es palíndromo.");

        System.out.print("Ingresa un numero: ");
        numero = teclado.nextInt();

        int digito1 = numero % 10;
        int digito2 = (numero / 10) % 10;
        int digito3 = (numero / 100) % 10;
        int digito4 = (numero / 1000) % 10;
        int digito5 = (numero / 10000) % 10;

        if (digito1 == digito5 && digito2 == digito4) {
            System.out.println("El numero " + numero + " es palindromo.");
        } else {
            System.out.println("El numero " + numero + " no es palindromo.");
        }




    }
}