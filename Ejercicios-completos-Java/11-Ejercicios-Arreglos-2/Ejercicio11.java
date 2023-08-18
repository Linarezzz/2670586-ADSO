import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args){
     //   Solicitar al usuario ingresar un número N y un número M, crear dos arreglos de tamaño N y M respectivamente,
     //   llenarlos con datos aleatorios y crear un arreglo que debe contener la información de los dos arreglos originales.
     //   La información debe estar ordenada de forma ascendente.

     Scanner teclado = new Scanner(System.in);

     System.out.print("Ingrese un numero: ");
     int numero = teclado.nextInt();

     System.out.print("Ingrese otro numero: ");
     int numero_2 = teclado.nextInt();

     // Arreglo para numero

     int arreglo_1 [] = new int [numero];

     // Arreglo para numero 2

     int arreglo_2 [] = new int [numero_2];

     // Ciclo para llenar ambos ciclos con numeros aleatorios

     for(int i = 0; i < arreglo_1.length;i++){
        arreglo_1[i] = (int) (Math.random()*100+1);
        System.out.println("Los numeros generados del primer numero ingresado es: "+arreglo_1[i]);
     }

     System.out.println("-----------------------------------------------------------------------");    

     for(int i = 0; i < arreglo_2.length;i++){
        arreglo_2[i] = (int) (Math.random()*100+1);
        System.out.println("Los numeros generados del segundo numero ingresado es: "+arreglo_2[i]);
     }

     // Arreglo incluyente

     int espacio_arreglo_contenedor = arreglo_1.length + arreglo_2.length;
     int arreglo_contenedor [] = new int[espacio_arreglo_contenedor];

     // Copiar elementos de arreglo_1 al arreglo_contenedor
     for (int i = 0; i < arreglo_1.length; i++) {
        arreglo_contenedor[i] = arreglo_1[i];
     }

     // Copiar elementos de arreglo_2 al arreglo_contenedor
     for (int i = 0; i < arreglo_2.length; i++) {
        arreglo_contenedor[arreglo_1.length + i] = arreglo_2[i];
     }

     // Ordenar el arreglo_contenedor de forma ascendente
     for (int i = 0; i < espacio_arreglo_contenedor - 1; i++) {
        for (int j = 0; j < espacio_arreglo_contenedor - i - 1; j++) {
            if (arreglo_contenedor[j] > arreglo_contenedor[j + 1]) {
                int temp = arreglo_contenedor[j];
                arreglo_contenedor[j] = arreglo_contenedor[j + 1];
                arreglo_contenedor[j + 1] = temp;
            }
        }
     }

     // Imprimir el arreglo_contenedor
        System.out.print("Arreglo contenedor ordenado: [");
     for (int i = 0; i < espacio_arreglo_contenedor; i++) {
         System.out.print(arreglo_contenedor[i] + " ");
            if(i < arreglo_contenedor.length - 1){
                System.out.print(", ");
            }
     }
     System.out.print("]");











    }
}