public class Ejercicio11 {
    public static void main(String[] args) {
        factorial(5);
        factorial(4);
        factorial(6);
        factorial(7);
    }

    public static void factorial(int numero) {
        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
            return;
        }

        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
