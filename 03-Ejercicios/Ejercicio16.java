import java.util.Scanner;

public class Ejercicio16{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int inversion_inicial,periodo;
        double tasa_interes, precio_final;

        System.out.println("Escribe un programa que calcule el monto final obtenido a partir de una inversión inicial, una tasa de interés y un número de períodos utilizando la fórmula del interés compuesto.");

        System.out.println("Escribe la inversion inicial");
        inversion_inicial = teclado.nextInt();

        System.out.println("Escribe la tasa de interes");
        tasa_interes = teclado.nextDouble();

        System.out.println("Escribe el periodo de tiempo en meses");
        periodo = teclado.nextInt();

        precio_final = inversion_inicial * (1+tasa_interes);

        System.out.println("El monto final obtenido es de: "+precio_final);


    }
}