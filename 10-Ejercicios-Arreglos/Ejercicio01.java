import java.util.Scanner;

public class Ejercicio01{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        // Arreglo

        int arreglo [] = new int [numero];

        // Ciclo para llenar el arreglo

        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = (i+1) * 2 - 1;
        }

        // Ciclo para imprimir el arreglo

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Numero impar en la posicion "+i+" es: "+arreglo[i]);
        }
    }
}