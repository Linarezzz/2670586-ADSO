import java.util.Scanner;

public class Ejercicio03{
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero_1;
        int numero_2;
        int auxiliar;

        System.out.println("Se le pedirán dos números, luego se almacenarán en variables separadas e intercambiarán el valor de las dos variables usando una variable auxiliar");

        System.out.println("Ingrese numero 1");
        numero_1 = teclado.nextInt();

        System.out.println("Ingrese numero 2");
        numero_2 = teclado.nextInt();

        System.out.println("El numero 1 es: "+numero_1);
        System.out.println("El numero 2 es: "+numero_2);

        System.out.println("Ahora las variables intercambiaran sus valores");

        auxiliar = numero_1;
        numero_1 = numero_2;
        numero_2 = auxiliar;

        System.out.println("El nuevo valor de la variable 1 es: "+numero_1);
        System.out.println("El nuevo valor de la variable 2 es: "+numero_2);



    }
}