import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 6: ");
        int numero = teclado.nextInt();

        if (numero <= 0 || numero > 6) {
            System.out.println("El número no es válido");
        } else {
            int variable = 0;
            int resultado = 0;

            for (int i = 0; i < numero; i++) {
                int numeroAleatorio = (int) (Math.random() * 10);
                variable = (variable * 10) + numeroAleatorio;
            }

            resultado = variable * 2;

            System.out.println("El número construido es: " + variable);
            System.out.println("Resultado producto: " + resultado);
        }
    }
}