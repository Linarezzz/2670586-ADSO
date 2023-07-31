import java.util.Scanner;

public class Ejercicio06{
    public static void main(String []args){

        //Solicitar al usuario ingresar un número N y un número M, crear un arreglo de tamaño N, llenarlo con datos
        //aleatorios y contar cuántas veces aparece el número M en el arreglo.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        System.out.print("Ingrese un numero y se contara cuantas veces aparece con numeros aleatorios: ");
        int numero_2 = teclado.nextInt();

        // Arreglo

        int arreglo [] = new int [numero];

        // Ciclo para llenar el arreglo

        for(int i = 0; i < arreglo.length;i++){
            arreglo[i] = (int) (Math.random()*100+1);
            System.out.println("El numero generado es: "+arreglo[i]);
        }

        // Ciclo para imprimir el arreglo

        int contador_numero = 0;

        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == numero_2){
                contador_numero++;
            }
        }

        System.out.println("El numero "+numero_2+" se repite "+contador_numero+" veces");
    }
}