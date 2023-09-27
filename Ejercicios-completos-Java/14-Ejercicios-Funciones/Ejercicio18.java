public class Ejercicio18{
    public static void main (String[] args){
        int numero = 12345;
        invertido(numero);
    }

    public static void invertido (int numero){
        int numeroOriginal = numero;
        System.out.print("El numero "+numeroOriginal+" invertido es: ");
        while (numero > 9) {
            int sumaDigitos = 0;

            while (numero != 0) {
                int digito = numero % 10;
                sumaDigitos = sumaDigitos + digito;
                numero = numero / 10;

                System.out.print(digito);
                if (numero != 0) {
                    System.out.print("");
                }
            }

        }
    }
}