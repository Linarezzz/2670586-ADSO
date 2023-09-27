public class Ejercicio16 {
    public static void main(String[] args) {
        long numero1 = 12345346; 
        long numero2 = 7; 

        contarDigitos(numero1);
        contarDigitos(numero2);
    }

    public static void contarDigitos(long numero) {
        long contador = 0;
        long numeroOriginal = numero; 

        while (numero != 0) {
            numero = numero / 10; // Elimina el último dígito
            contador++;
        }

        System.out.println("El número " + numeroOriginal + " tiene " + contador + " dígitos.");
    }
}
