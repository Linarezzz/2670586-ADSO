import java.util.Scanner;

public class Ejercicio05{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero_1, numero_2, numero_3;


        System.out.println("se solicite al usuario tres números enteros y se indique en pantalla si los números se ingresaron en orden ascendente.");

        System.out.print("Ingresa el primer numero: ");
        numero_1 = teclado.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        numero_2 = teclado.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        numero_3 = teclado.nextInt();

        if(numero_1 < numero_2 & numero_1 < numero_3 & numero_2 < numero_3){
            System.out.println("Los numeros se ingresaron en orden ascedente");
        }else{
            System.out.println("Los numeros ingresados NO estan en orden ascendente");
        }
    }
}