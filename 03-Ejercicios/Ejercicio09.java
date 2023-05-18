import java.util.Scanner;

public class Ejercicio09{
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Escribe un programa que tome un número como entrada y determine si es par o impar.");

        System.out.println("Escribe el numero");
        numero = teclado.nextInt();

        if(numero % 2 == 0) {   // Se abre if, que es una condicion, luego el numero y residuo que es % que de igual a 0 //
            System.out.println(numero+" es un numero par");
        }else {   // Se abre un else, que seria un SINO se escribe la otra condicion // 
            System.out.println(numero+" es un numero impar");
        }

    }

}