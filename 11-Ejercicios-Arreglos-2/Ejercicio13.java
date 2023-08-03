import java.util.Scanner;

public class Ejercicio13{
    public static void main(String []args){

        //Solicitar al usuario ingresar un número N, crear dos arreglos de N, llenar los dos arreglos con datos aleatorios y
        //crear un tercer arreglo de tamaño N, el cual contendrá la suma de los dos arreglos.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        // Arreglos
        int arreglo_1 [] = new int [numero];
        int arreglo_2 [] = new int [numero];

        // Ciclo para llenar los arreglos
        for(int i = 0; i < arreglo_1.length;i++){
            arreglo_1[i] = (int) (Math.random()*100+1);
            System.out.println("Los datos del primer arreglo son: "+arreglo_1[i]);
        }
        System.out.println("---------------------------------------------------");
        for(int i = 0; i < arreglo_2.length;i++){
            arreglo_2[i] = (int) (Math.random()*100+1);
            System.out.println("Los datos del segundo arreglo son: "+arreglo_2[i]);
        }

        // Tercer arreglo

        int arreglo_suma [] = new int [arreglo_1.length];
        int total = 0;
        for(int i = 0; i < arreglo_suma.length;i++){
            arreglo_suma[i] = arreglo_1[i] + arreglo_2[i];
            total += arreglo_suma[i];
        }
        
        System.out.println("La suma de los dos arreglos es: "+total);
        

    }
}