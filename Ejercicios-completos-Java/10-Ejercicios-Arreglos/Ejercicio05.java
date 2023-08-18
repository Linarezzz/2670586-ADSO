import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args){

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

        System.out.print("Numero de movimientos: ");
        int movimientos = teclado.nextInt();

        // Ciclo para movimientos del arreglo

        for (int i = 1; i <= movimientos; i++) {
            int temp = arreglo[0]; // Guardamos el valor del primer elemento
            for (int j = 1; j < arreglo.length; j++) {
                arreglo[j - 1] = arreglo[j]; // Desplazamos los demás elementos a la izquierda
            }
            arreglo[arreglo.length - 1] = temp; // Colocamos el primer elemento al final del arreglo

            // Imprimir el arreglo después de cada movimiento
            System.out.print("Movimiento " + i + ": {");
            for (int k = 0; k < arreglo.length; k++) {
                System.out.print(" " + arreglo[k]);
                if (k < arreglo.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println(" }");

        }
    }
}