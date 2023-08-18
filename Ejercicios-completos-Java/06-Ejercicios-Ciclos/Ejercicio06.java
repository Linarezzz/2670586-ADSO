import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la posicion del n-esimo Fibonacci: ");
        int posicion = teclado.nextInt();

        int numAnterior = 0;
        int numActual = 1;

        for (int i = 2; i < posicion; i++) {
            int siguiente = numAnterior + numActual;
            numAnterior = numActual;
            numActual = siguiente;
        }

        System.out.println("El n-ésimo número Fibonacci en la posición " + posicion + " es: " + numActual);



    }
}