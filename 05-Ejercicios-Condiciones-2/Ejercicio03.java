import java.util.Scanner;

public class Ejercicio03{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Escribir un programa que determine si un número ingresado por el usuario es par.");

        System.out.print("Ingresa un numero: ");
        numero = teclado.nextInt();

        if(numero % 2 ==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}