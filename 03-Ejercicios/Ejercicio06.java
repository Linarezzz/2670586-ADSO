import java.util.Scanner;

public class Ejercicio06{
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        float numero_1;
        float numero_2;
        float numero_3;
        float numero_4;
        float numero_5;
        float promedio;

        System.out.println("Escribe 5 numeros y a partir de ellos se calculara el promedio de los mismos.");

        System.out.println("Escribe el primer numero");
        numero_1 = teclado.nextFloat();

        System.out.println("Escribe el segundo numero");
        numero_2 = teclado.nextFloat();

        System.out.println("Escribe el tercer numero");
        numero_3 = teclado.nextFloat();

        System.out.println("Escribe el cuarto numero");
        numero_4 = teclado.nextInt();

        System.out.println("Escribe el quinto numero");
        numero_5 = teclado.nextInt();

        promedio = (numero_1 + numero_2 + numero_3 + numero_4 + numero_5) /5;

        System.out.println("El promedio de los 5 numeros es de: "+promedio);
        


    }  
}