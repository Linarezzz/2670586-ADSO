import java.util.Scanner;

public class Ejercicio07{
    public static void main(String []args){

        // Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y crear un
        // nuevo arreglo que contenga los elementos en orden inverso al arreglo original.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        // Arreglo

        int arreglo [] = new int [numero];

        // Ciclo para llenar el arreglo

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*100+1);
            System.out.println("El numero generado es: "+arreglo[i]);
        }

        // Segundo arreglo

        int arreglo_inverso [] = new int [numero];

        // Ciclo para devolverlo

        int indice = numero - 1;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo_inverso[indice] = arreglo[i];
            indice--;
        }

        // Ciclo para imprimir el arreglo
        System.out.print("Arreglo inverso: ");
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo_inverso[i]);
            if (i < arreglo_inverso.length - 1 ){
                System.out.print(",");
            }
        }

    }    
}