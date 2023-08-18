import java.util.Scanner;

public class Ejercicio04{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        float nota_1, nota_2, nota_3, promedio;

        System.out.println(" Escribir un programa que calcule el promedio de tres notas ingresadas por el usuario y muestre un mensaje de aprobado si el promedio es mayor o igual a 7, y un mensaje de reprobado en caso contrario.");

        System.out.print("Ingresa la nota 1: ");
        nota_1 = teclado.nextFloat();

        System.out.print("Ingresa la nota 2: ");
        nota_2 = teclado.nextFloat();

        System.out.print("Ingresa la nota 3: ");
        nota_3 = teclado.nextFloat();

        System.out.print("");

        promedio = (nota_1 + nota_2 + nota_3) /3;

        System.out.println("El promedio es: "+promedio);

        if(promedio >=7){
            System.out.println("Usted esta aprobado");
        }else{
            System.out.println("Usted esta reprobado");
        }

    }
}