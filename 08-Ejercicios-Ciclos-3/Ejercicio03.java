import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor total a financiar: ");
        double valorTotal = teclado.nextDouble();

        System.out.print("Ingrese la tasa de interés (en porcentaje): ");
        double tasaInteres = teclado.nextDouble();

        System.out.print("Ingrese la cantidad de cuotas: ");
        int cantidadCuotas = teclado.nextInt();

        System.out.println("-------------------------------------");
        System.out.println("DETALLE DE CADA CUOTA");
        System.out.println("-------------------------------------");

        double tasaInteresDecimal = tasaInteres / 100;
        double factor = Math.pow(1 + tasaInteresDecimal, cantidadCuotas);
        double valorCuota = (valorTotal * tasaInteresDecimal * factor) / (factor - 1);
        double deudaTotal = valorTotal;

        for (int cuota = 1; cuota <= cantidadCuotas; cuota++) {
            double interes = deudaTotal * tasaInteresDecimal;
            double abonoCapital = valorCuota - interes;
            deudaTotal -= abonoCapital;

            System.out.println("Cuota " + cuota + ":");
            System.out.println("Valor de la cuota: " + valorCuota);
            System.out.println("Valor del interés: " + interes);
            System.out.println("Valor del abono a capital: " + abonoCapital);
            System.out.println("Deuda total restante: " + deudaTotal);
            System.out.println("-------------------------------------");
        }
    }
}
