import java.util.Scanner;

public class Ejercicio03{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero para determinar la altura de la paramide: ");
        int altura_piramide = teclado.nextInt();


        if(altura_piramide <=0){
            System.out.println("La altura no es valida");
        }else{
         for (int i = 1; i <= altura_piramide; i++) {
            // Imprimir espacios en blanco para alinear la pirámide
            for (int j = 1; j <= altura_piramide - i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos para construir la pirámide
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("X");
            }

            // Pasar a la siguiente línea después de cada renglón de la pirámide
            System.out.println();
            }
        }

    }
}




