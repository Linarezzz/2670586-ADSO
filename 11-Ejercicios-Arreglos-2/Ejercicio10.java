import java.util.Scanner;

public class Ejercicio10{

    public static void main(String []args){

        // Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y crear un
        // arreglo nuevo con los datos del arreglo original sin repetir.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        // Arreglo

        int arreglo [] = new int [numero];

        // Ciclo para imprimir el arreglo

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*100+1);
            System.out.println("Los numeros generados son: "+arreglo[i]);
        }

        // Segundo arreglo

        int arreglo_2 [] = new int [arreglo.length];

        // Ciclo para llenar el segundo arreglo

        int contador = 0;

        for (int i = 0; i < arreglo.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < contador; j++) {
                if (arreglo[i] == arreglo_2[j]) {
                    repetido = true;
                }
            }
            if (repetido == false) {
                arreglo_2[contador] = arreglo[i];
                contador++;
            }
        }

        // Redimensionar el segundo arreglo para quitar los espacios no utilizados
        int[] arreglo_2SinRepetir = new int[contador];
        for (int i = 0; i < contador; i++) {
            arreglo_2SinRepetir[i] = arreglo_2[i];
        }

        // Imprimir el segundo arreglo sin repetir
        System.out.print("Arreglo sin repetir: [");
        for (int i = 0; i < arreglo_2SinRepetir.length; i++) {
            System.out.print(arreglo_2SinRepetir[i]);
            if (i < arreglo_2SinRepetir.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}