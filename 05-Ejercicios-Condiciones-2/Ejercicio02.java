import java.util.Scanner;

public class Ejercicio02{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero_1, numero_2, numero_3, numero_4;

        System.out.println("Escribir un programa que calcule el máximo de 4 números ingresados por el usuario utilizando una estructura condicional.");

        System.out.print("Escribe el primer numero: ");
        numero_1 = teclado.nextInt();

        System.out.print("Escribe el segundo numero: ");
        numero_2 = teclado.nextInt();

        System.out.print("Escribe el tercer numero: ");
        numero_3 = teclado.nextInt();

        System.out.print("Escribe el cuarto numero: ");
        numero_4 = teclado.nextInt();

        if (numero_1 > numero_2 && numero_1 > numero_3 && numero_1 > numero_4){
            System.out.println("El numero mayor es: "+numero_1);
        }else if (numero_2 > numero_1 && numero_2 > numero_3 && numero_2 > numero_4){
            System.out.println("El numero mayor es: "+numero_2);
        }else if (numero_3 > numero_1 && numero_3 > numero_2 && numero_3 > numero_4){
            System.out.println("El numero mayor es: "+numero_3);
        }else if (numero_4 > numero_1 && numero_4 > numero_2 && numero_4 > numero_3){
            System.out.println("El numero mayor es: "+numero_4);
        }
    }
}