import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese número N: ");
        int numero = teclado.nextInt();

        int contador = 0;
        int candidato = 1;
        int numero_aleatorio = 0;
        int i = 0;

        while (contador < numero) {
            

            for(contador = 1; contador <= numero; i=i+1){
                numero_aleatorio = (int) Math.floor(Math.random() * 100 + 1);

                int divisores = 0;
            for ( i = 1; i <= numero_aleatorio; i++) {
                if (numero_aleatorio % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println("Primo " + (contador) + " generado: " + numero_aleatorio);
                contador++;
            }

            candidato++;
        }
        }
    }
}