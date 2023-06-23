import java.util.Scanner;

public class Ejercicio08{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar un número: ");
        int numero = teclado.nextInt();

        if (numero < 0 || numero > 999999) {
            System.out.println("El número ingresado está fuera del rango");
        }

        System.out.println("------------------------------------");

        int divisor = 100000;
        int contador = 1;

        while (divisor >= 1) {
            int digito = numero / divisor;
            System.out.println("-> El dígito " + contador + " es: " + digito);
            numero = numero % divisor;
            divisor = divisor / 10;
            contador++;
        }

        System.out.println("------------------------------------------------------");


        
    }
}