import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un sueldo total: ");
        int sueldo = teclado.nextInt();

        System.out.print("Cantidad de pagos: ");
        int Cantidad_pagos = teclado.nextInt();

        System.out.println(" -------------- FORMAS DE PAGO -----------------");
        System.out.println("          1. Pagos de igual valor.              ");
        System.out.println("          2. Primer pago diferente.             ");
        System.out.println("          3. Ultimo pago diferente.             ");
        System.out.println("          4. Primer y Ultimo pago diferente.    ");

        System.out.print("Ingrese forma de pago: ");
        int opcion = teclado.nextInt();

        if (opcion >= 1 && opcion <= 4){
            }else if(opcion == 1){
                System.out.println("Opcion 1");

            }
        else{
            System.out.println("Ingrese una opcion valida");
        }
    }
}