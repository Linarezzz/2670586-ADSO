import java.util.Scanner;

public class Ejercicio02{
    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        int multiplicacion = 1;

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        // Arreglo
        int arreglo [] = new int [numero];

        // Ciclo para llenar el arreglo
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*100+1);
            System.out.println("El numero generado es: "+arreglo[i]);
        }

        // Ciclo para multiplicacion
        for(int i = 0; i < arreglo.length; i++){
            multiplicacion = multiplicacion * arreglo[i];
        }

        System.out.println("El producto de los elementos es: "+multiplicacion);

    }
}