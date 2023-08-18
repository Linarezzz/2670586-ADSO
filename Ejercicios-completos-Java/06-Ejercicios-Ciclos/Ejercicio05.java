import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        int fb1 = 0;
        int fb2 = 1;
        int contador = 1;
    
        System.out.println("Sucesión de Fibonacci hasta el número " + numero + ":");

        while (contador <= numero){
            if (contador == 1){
                System.out.print(" "+fb1+",");
            } 

            if (contador == 2){
                System.out.print(" "+fb2+",");
            } 

            if (contador > 2){
                int fbactual = fb1 + fb2;
                System.out.print(" "+fbactual+",");

                fb1 = fb2;
                fb2 = fbactual;
            }

             contador = contador + 1;

            
        }
                    
    }
}