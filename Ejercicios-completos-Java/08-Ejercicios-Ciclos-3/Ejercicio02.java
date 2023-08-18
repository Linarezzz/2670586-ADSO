import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total financiada: ");
        double cantidad_financiada = teclado.nextDouble();

        System.out.println("-------------------------------------");

        System.out.print("Ingrese la cantidad de cuotas pagadas: ");
        int cuotas_pagadas = teclado.nextInt();

        System.out.println("-------------------------------------");

        double interesTotal = 0;

        for (int contador = 1; contador <= cuotas_pagadas; contador++) {
            System.out.print("Ingrese el valor de la cuota " + contador + ": ");
            double valor_cuota = teclado.nextDouble();

            double interes = ((cuotas_pagadas * valor_cuota) - cantidad_financiada) / cantidad_financiada * 100;
            interesTotal += interes;
        }

        System.out.println("El porcentaje total de interés pagado es de: " + interesTotal + "%");
    }
}
