import java.util.Scanner;

public class Ejercicio06{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        byte edad;


        System.out.println("Escribir un programa que determine si una persona puede votar ingresando su edad.");

        System.out.print("Ingresa la edad: ");
        edad = teclado.nextByte();

        if(edad >=18){
            System.out.println("Usted puede votar");
        }else if(edad < 18){
                System.out.println("Usted no tiene la edad suficiente para votar");
        }else{
            System.out.println("Ingrese una edad valida");
        }



    }
}