import java.util.Scanner;

public class Ejercicio01{
    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);
        
        int suma = 0;

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        // Arreglo

        int arreglo [] = new int [numero];

        // Ciclo para llenar el arreglo

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*100+1); 
        }

        // Ciclo para mostrar los numeros aleatorios

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("El numero generado es: "+arreglo[i]);
        }

        // Ciclo para la suma 

        for(int i = 0; i < arreglo.length; i++){
            suma = suma + arreglo[i];
        }

        System.out.println("La suma de los numeros generados es: "+suma);

    }
}