import java.util.Scanner;

public class Ejercicio18{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Escribe un programa que solicite al usuario ingresar su peso y altura, y calcule el Índice de Masa Corporal (IMC) utilizando la fórmula: IMC = peso / (altura^2).");

        System.out.println("Ingresa tu peso");
        peso = teclado.nextDouble();

        System.out.println("Ingresa tu altura");
        altura = teclado.nextDouble();

        imc = peso / Math.pow (altura,2);

        System.out.println("El indice de masa corporal (IMC) es de: "+imc);

    }
}