import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese numero N: ");
        int numero = teclado.nextInt();

        int numeroReverso = 0;
        int numeroOriginal = numero;

        while (numero > 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero = numero / 10;
        }

        if (numeroOriginal == numeroReverso) {
            System.out.println("El numero SI es palindromo.");
        } else {
            System.out.println("El numero NO es palindromo.");
        }
    }
}