import java.util.Scanner;

public class Ejercicio08{
    public static void main(String []args){

        // Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y separar
        // los números pares e impares en dos arreglos diferentes.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        // Arreglo

        int arreglo [] = new int [numero];

        // Ciclo para generar numeros aleatorios e imprimirlos

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*100+1);
            System.out.println("El numero aleatorio es: "+arreglo[i]);
        }

        // Contar cuántos números pares e impares hay en el arreglo
        int cantidadPares = 0;
        int cantidadImpares = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        // Crear arreglos para los números pares e impares
        int arregloPares [] = new int[cantidadPares];
        int arregloImpares [] = new int[cantidadImpares];

        int indicePares = 0;
        int indiceImpares = 0;

        // Separar los números pares e impares en los arreglos correspondientes
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                arregloPares[indicePares] = arreglo[i];
                indicePares++;
            } else {
                arregloImpares[indiceImpares] = arreglo[i];
                indiceImpares++;
            }
        }

        // Imprimir el arreglo de números pares
        System.out.print("Arreglo Pares: [");
        for (int i = 0; i < arregloPares.length; i++) {
            System.out.print(arregloPares[i]);
            if (i < arregloPares.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Imprimir el arreglo de números impares
        System.out.print("Arreglo Impares: [");
        for (int i = 0; i < arregloImpares.length; i++) {
            System.out.print(arregloImpares[i]);
            if (i < arregloImpares.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}