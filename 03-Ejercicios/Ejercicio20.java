import java.util.Scanner;

public class Ejercicio20{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero, sumDig=0;



        System.out.println("Solicita al usuario un número entero de 5 dígitos como maximo, la aplicación debe sumar todos los dígitos. Por ejemplo, si el número es 12345, la suma sería 1 + 2 + 3 + 4 + 5 = 15. Muestra el resultado por pantalla.");

        System.out.println("Escribe el numero entero de 5 digitos");
        numero = teclado.nextInt();

        

        while (numero != 0) {
        sumDig = sumDig + (numero % 10);
        numero = numero / 10;
     } 
     
        System.out.println("La suma de los dígitos es " + sumDig) ;
    }
}