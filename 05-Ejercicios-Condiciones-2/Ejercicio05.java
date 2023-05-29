import java.util.Scanner;

public class Ejercicio05{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int año;

        System.out.println("Escribir un programa que determine si un año ingresado por el usuario es bisiesto");
        System.out.println("Escribe el año");
        año = teclado.nextInt();

        if(año % 4 == 0){
            System.out.print("El año es bisiesto");
        }else{
            System.out.print("El año NO es bisiesto");
        }
    }
}