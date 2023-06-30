import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese numero N: ");
        int numero_principal = teclado.nextInt();
        int numero = numero_principal;

        System.out.print("Raiz digital: ");
        while (numero > 9) {
            int sumaDigitos = 0;

            while (numero != 0) {
                int digito = numero % 10;
                sumaDigitos = sumaDigitos + digito;
                numero = numero / 10;

                System.out.print(digito);
                if (numero != 0) {
                    System.out.print(" + ");
                }
            }

            numero = sumaDigitos;
            if (numero > 9) {
                System.out.println(" = " + numero);
            }
        }

        System.out.println();
        System.out.println("Raiz Digital:");
        System.out.println("La Raiz Digital de " + numero_principal + " es: " + numero);
    }
}