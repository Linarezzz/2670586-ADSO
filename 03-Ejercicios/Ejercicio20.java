import java.util.Scanner;

public class Ejercicio20{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Solicita al usuario un número entero de 5 dígitos como maximo, la aplicación debe sumar todos los dígitos.");

        System.out.println("Escribe el numero entero de 5 digitos");
        int numero = teclado.nextInt();  // Se puede inicializar 

        int digito_1 = numero%10;
        int digito_2 = (numero%100)/10;
        int digito_3 = (numero%1000)/100;
        int digito_4 = (numero%10000)/1000;
        int digito_5 = numero/10000;

        System.out.println(" Digito 1 es: "+digito_1);
        System.out.println(" Digito 2 es: "+digito_2);
        System.out.println(" Digito 3 es: "+digito_3);
        System.out.println(" Digito 4 es: "+digito_4);
        System.out.println(" Digito 5 es: "+digito_5);

        

        int resultado = digito_1 + digito_2 + digito_3 + digito_4 + digito_5;
        System.out.println("La suma de los dígitos es " + resultado);
    }
}