import java.util.Scanner;

public class Ejercicio14{
    public static void main(String []args){

        //Solicitar al usuario ingresar un número N y un número M, crear un arreglo de tamaño N de números flotantes,
        //llenarlo con datos aleatorios y encontrar el valor más cercano al número N que contiene el arreglo.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        System.out.print("Ingrese otro numero: ");
        int numero_2 = teclado.nextInt();

        // Arreglo
        float arreglo [] = new float [numero];

        // Ciclo para llenar el arreglo
        for(int i = 0; i < arreglo.length;i++){
            arreglo[i] = (float) (Math.random()*100+1);
            System.out.println("Los numeros generados son: "+arreglo[i]);
        }

        float cercano = arreglo[0];

        // Ciclo para imprimir el arreglo

        for(int i = 0; i < numero; i++){
            if(arreglo[i] <= cercano){
                cercano = arreglo[i];
            }
        }

        System.out.println("El numero generado mas cercano a "+numero_2+" es :"+cercano);
    }
}