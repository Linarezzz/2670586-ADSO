import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        double numero_aleatorio = 0;
        double producto = 0;

        System.out.print("Ingrese un numero entre 1 y 6: ");
        int numero = teclado.nextInt();

        if( numero <= 0 || numero > 6){
            System.out.println("El numero no es válido");
        }else{
            while(contador <= numero){
                numero_aleatorio = Math.random() * 9;
                contador = contador + 1;
                System.out.print(" "+numero_aleatorio);
            }

        }
    }
}