import java.util.Scanner;

public class Ejercicio{
    public static void main(String[] args){

        // Ejercicio: Solicitar un numero y que genere N numeros pares con un arreglo

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriba un numero: ");
        int numero = teclado.nextInt();

        // Crear el arreglo

        int arreglo [] = new int [numero];

        // Ciclo para llenar el arreglo

        for (int i = 0; i < numero; i++){
            arreglo[i] = (i+1) * 2;
        }


        // Ciclo para imprimir el arreglo
        // se puede usar el arreglo con .length para que la condicion sea hasta el arreglo

        for(int contador = 0; contador < arreglo.length ; contador++){ 
            System.out.println("El arreglo en la posicion "+contador+" es: "+arreglo[contador]);
        }



    }
}