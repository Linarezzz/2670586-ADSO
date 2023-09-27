public class Ejercicio22 {
    public static void main(String[] args) {
        int numero = 5; // Cambia el número deseado aquí
        primos(numero);
    }

    public static void primos(int numero) {
        int[] arreglo = new int[numero];
        int primo = 2;
        int contador = 0;

        System.out.println("--> "+numero+" numeros primos encontrados son:");

        while (contador < numero) {
            int divisores = 0;
            for (int i = 1; i <= primo; i++) {
                if (primo % i == 0) {
                    divisores = divisores + 1;
                }
            }
            if (divisores == 2) {
                arreglo[contador] = primo;
                primo++;
                contador++;
            } else {
                primo++;
            }
        }

        // Imprime el arreglo una vez que se llena
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
}
