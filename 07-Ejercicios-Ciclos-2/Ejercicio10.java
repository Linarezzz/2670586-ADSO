import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("--> Ingresar número N: ");
        int numero = teclado.nextInt();

        System.out.println("Cuadrado latino:");

        int contador = 1;

        for (int fila = 0; fila < numero; fila++) {
            for (int columna = 0; columna < numero; columna++) {
                System.out.print(contador + " ");
                contador++;
                if (contador > numero) {
                    contador = 1;
                }
            }
            System.out.println();
            contador++;
        }
    }
}