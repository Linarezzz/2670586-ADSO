import java.util.Scanner;

public class Ejercicio14{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        byte credito1,credito2,credito3;
        float nota1,nota2, nota3,total,promedio;


        System.out.println("Escribe un programa que pida al usuario ingresar 3 notas de materias y los creditos para cada materia. Calcule el promedio ponderado de esas notas.");

        System.out.println("Escribe la nota 1");
        nota1 = teclado.nextFloat();

        System.out.println("Escribe la nota 2");
        nota2 = teclado.nextFloat();

        System.out.println("Escribe la nota 3");
        nota3 = teclado.nextFloat();



        System.out.println("Ahora escribe el credito 1");
        credito1 = teclado.nextByte();

        System.out.println("Ahora escribe el credito 2");
        credito2 = teclado.nextByte();

        System.out.println("Ahora escribe el credito 3");
        credito3 = teclado.nextByte();

        total = (nota1 * credito1) + (nota2 * credito2) + (nota1 * credito3);
        promedio = total / (credito1+credito2+credito3);

        System.out.println("El promedio ponderado de las notas es de: "+promedio);







 





    }
}