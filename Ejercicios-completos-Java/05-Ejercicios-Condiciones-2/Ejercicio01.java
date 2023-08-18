import java.util.Scanner;

public class Ejercicio01{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        Long numero;

        System.out.println("Determine si un número ingresado por el usuario es positivo o negativo.");
        System.out.print("Ingrese el numero ");
        numero = teclado.nextLong();

        if (numero < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }

    }
}