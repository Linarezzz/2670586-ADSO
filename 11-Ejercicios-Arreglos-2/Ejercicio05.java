import java.util.Scanner;

public class Ejercicio05{
    public static void main(String []args){

        //Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios flotantes y
        //calcular el promedio de todos los elementos.


    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese un numero: ");
    int numero = teclado.nextInt();

    // Arreglo, se cambia a tipo de dato
    float arreglo [] = new float [numero];

    // Ciclo para llenar el arreglo

    for(int i = 0; i <arreglo.length;i++){
        arreglo[i] = (float) (Math.random() * 100+1);
        System.out.println("Los numeros flotantes generados son: "+arreglo[i]);
    }
    }

}