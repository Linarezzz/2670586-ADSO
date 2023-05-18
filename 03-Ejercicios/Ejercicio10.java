import java.util.Scanner;

public class Ejercicio10{
    public static void main (String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numero_1;
        int numero_2;
        float division;
        float residuo;

        System.out.println("Escribe un programa que tome dos números como entrada y muestre el resultado de la división y el residuo de la división entre ambos");

        System.out.println("Ingresa el primer numero");
        numero_1 = teclado.nextInt();

        System.out.println("Ingresa el segundo numero");
        numero_2 = teclado.nextInt();

        division = numero_1/numero_2;

        residuo = (numero_1 % numero_2);

        System.out.println("El resultado de la division es: "+division);

        System.out.println("El residuo de la division es: "+residuo);

    }
}