import java.util.Scanner;

public class Ejercicio08{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero;


        System.out.println("se solicite al usuario un número (máximo 9 dígitos) y se muestre en pantalla el numero representado en palabras");

        System.out.print("Ingresa el numero: ");
        numero = teclado.nextInt();

        if(numero > 999_999_999){
            System.out.println("El numero no es valido");   // PENDIENTE POR TERMINAR // 
        }
    }
}