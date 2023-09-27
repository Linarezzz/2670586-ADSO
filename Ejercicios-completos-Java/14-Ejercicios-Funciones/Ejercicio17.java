public class Ejercicio17{
    public static void main (String[] args){
        int numero = 12345;
        sumaDigitos(numero);
    }

    public static void sumaDigitos (int numero){
        int numeroOriginal = numero;
        System.out.print("La suma de los digitos de "+numeroOriginal+" es: ");
        while (numero > 9) {
            int sumaDigitos = 0;

            while (numero != 0) {
                int digito = numero % 10;
                sumaDigitos = sumaDigitos + digito;
                numero = numero / 10;
            }

            numero = sumaDigitos;
            if (numero > 9) {
                System.out.println(numero);
            }
        }
    }
}