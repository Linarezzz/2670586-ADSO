import java.util.Scanner;

public class Ejercicio13{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Escribir un programa que determine si un número ingresado por el usuario es divisible por 2, 3 y 5 al mismo tiempo");

        System.out.print("Escribe un numero: ");
        numero = teclado.nextInt();

        if(numero % 2 ==0 && numero % 3 ==0 && numero % 5 ==0){
            System.out.println("El numero es divisible por 2,3 y 5 al mismo tiempo");
        }else{
            System.out.println("El numero NO es divisible por 2, 3, y 5 al mismo tiempo");
        }




    }
}