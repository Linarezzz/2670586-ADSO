import java.util.Scanner;

public class Ejercicio09{
    public static void main(String []args){

        // Solicitar al usuario ingresar un número N y un número M, crear un arreglo de tamaño N, llenarlo con datos
        // aleatorios y buscar dentro del arreglo el número M. La aplicación debe devolver la posición donde se encuentra
        // el número M o devolver -1 en caso de no encontrarlo.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        System.out.print("Ingrese otro numero, se buscara dentro de numeros aleatorios: ");
        int numero_2 = teclado.nextInt();

        // Arreglo

        int arreglo [] = new int [numero];

        // Ciclo para llenar el arreglo

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*1000+1);
            System.out.println("El numero generado es: "+arreglo[i]);
        }

        // Ciclo para buscar el número y devolver la posición si se encuentra
        int posicionEncontrada = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (numero_2 == arreglo[i]) {
                posicionEncontrada = i;
                System.out.println("El número " + numero_2 + " se encuentra en el arreglo en la posición " + i);
            }
        }

        // Si el número no se encontró, mostrar -1
        if (posicionEncontrada == -1) {
            System.out.println("El número " + numero_2 + " no se encuentra en el arreglo.");
        }

    }
}