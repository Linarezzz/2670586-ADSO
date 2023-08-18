import java.util.Scanner;

public class Ejercicio12{
    public static void main(String []args){
        //Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y contar
        //cuántos números primos se encuentran dentro del arreglo.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int numero = teclado.nextInt();

        // Arreglo
        int arreglo [] = new int [numero];

        // Ciclo para llenar el arreglo
        for(int i = 0; i< arreglo.length;i++){
            arreglo[i] = (int) (Math.random()*100+1);
            System.out.println("Los numeros generados son: "+arreglo[i]);
        }
        

        int primos = 0;

        for (int i = 0; i < arreglo.length; i++) {
            int num = arreglo[i];

            // Verificar si el número es primo
            int divisores = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    divisores++;
                }
            }

            // Si el número tiene exactamente 2 divisores (1 y el número mismo), es primo
            if (divisores == 2) {
                primos++;
            }
        }

        System.out.println("El arreglo tiene " + primos + " numeros primos.");
    }
}