import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        // Arreglo

        int arreglo [] = new int [numero];

        // Ciclo para llenar el primer arreglo

        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = i+1;
        }

        // Ciclo para imprimir el primer arreglo

        System.out.print("Arreglo: [");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Posicion: ");
        int posicion = teclado.nextInt();


        // Segundo arreglo

        int arreglo_2 [] = new int [arreglo.length];

        // Ciclo para llenar el segundo arreglo

        int index = posicion;
        for (int i = 0; i < arreglo_2.length; i++) {
            arreglo_2[i] = arreglo[index % arreglo.length];
            index--;
            if (index < 0) {
                index = arreglo.length - 1;
            }
        }

        // Ciclo para imprimir el segundo arreglo

        System.out.print("Anti horario: ");
        for (int i = 0; i < arreglo_2.length; i++) {
            System.out.print(arreglo_2[i]);
            if (i < arreglo_2.length - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();

    }
}