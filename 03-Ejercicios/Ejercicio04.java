import java.util.Scanner;

public class Ejercicio04{
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero_1;
        int numero_2;

        System.out.println("Se le pedirán dos números, luego se almacenarán en variables separadas e intercambiarán el valor de las dos variables SIN usar una variable auxiliar");

        System.out.println("Ingrese el primer numero");
        numero_1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero");
        numero_2 = teclado.nextInt();

        System.out.println("El primer numero es: "+numero_1);
        System.out.println("El segundo numero es: "+numero_2);
        System.out.println("Ahora las variables cambiaran de valor");

        numero_1 = numero_1 + numero_2;
        numero_2 = numero_1 - numero_2;
        numero_1 = numero_1 - numero_2;

        System.out.println("El nuevo valor de la variable uno es: "+numero_1);
        System.out.println("El nuevo valor de la variable dos es: "+numero_2);


    }
}