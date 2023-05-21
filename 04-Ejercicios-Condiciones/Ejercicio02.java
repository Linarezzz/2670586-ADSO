import java.util.Scanner;

public class Ejercicio02{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero;


        System.out.println("Realizar una pequeña aplicación en JAVA, donde se solicite al usuario un numero de 3 dígitos y se indique en pantalla si el número es par o impar. Ingresar número de tres dígitos: 123 El numero ingresado es: Impar ");

        System.out.println("Escribe un numero de 3 digitos y se determinara si es par o impar");
        numero = teclado.nextInt();

        if(numero<100 || numero>999){  // || es para decir O //
            System.out.println("El numero no es valido");

        }else if(numero % 2 ==0){   // Else if se usa para una condicion dentro de una condicion // 
            System.out.println(numero + " es un numero par");
        }else{
            System.out.println(numero + " es un numero impar");
        }
    }
}
