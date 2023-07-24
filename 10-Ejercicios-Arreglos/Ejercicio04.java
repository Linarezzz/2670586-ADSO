import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        // Arreglo
        int arreglo[] = new int[numero];

        // Ciclo para llenar el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = teclado.nextInt();
        }

        // Ciclo para imprimir el arreglo original
        System.out.print("Arreglo original: [");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Ciclo para ordenar el arreglo de forma descendente
        int aux;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        // Ciclo para imprimir el arreglo ordenado de forma descendente
        System.out.print("Arreglo ordenado descendente: [");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}