import java.util.Scanner;

public class Ejercicio03{
    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        //  Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y
        //  encontrar el valor máximo del arreglo de enteros.

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        // Arreglo
        int arreglo [] = new int [numero];

        // Ciclo para llenar el arreglo
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*100+1);
            System.out.println("El numero generado es: "+arreglo[i]);
        }

        int mayor = arreglo[0];

        // Ciclo para imprimir el arreglo

        for(int i = 0; i < numero; i++){
            if(arreglo[i] > mayor){
                mayor = arreglo[i];
            }
        }

        System.out.println("El numero mayor de los generados es: "+mayor);

    }
}