import java.util.Scanner;

public class Ejercicio15{
    public static void main(String []args){
        //Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N de enteros, llenarlo con datos pedidos al
        //usuario y al final indicar al usuario si el arreglo es o no es PALÍNDROMO.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        //Arreglo
        int arreglo [] = new int [numero];

        //Ciclo para llenar el arreglo
        for(int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese el valor del dato: ");
            arreglo[0] = teclado.nextInt();
        }

        //Verificar si el arreglo es un palíndromo
        
    }
}