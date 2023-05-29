import java.util.Scanner;

public class Ejercicio10{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int fecha;
        System.out.println("Escribir un programa que determine si una persona es mayor de edad ingresando su fecha de nacimiento.");
        System.out.print("Ingresa el año de nacimiento: ");
        fecha = teclado.nextInt();

        if(fecha <= 2005){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted NO es mayor de edad");
        }

    }
}