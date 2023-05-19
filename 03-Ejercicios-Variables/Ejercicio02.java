import java.util.Scanner;
public class Ejercicio02{
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int temperatura;
        int resultado;

        System.out.println("Ingresa la temperatura que quieres pasar de grados celsius a grados Fahrenheit");
        temperatura = teclado.nextInt();

        resultado = temperatura * 9/5 + 32;

        System.out.println("La temperatura de grados celcius a grados Fahrenheit es: "+resultado);


    }
}