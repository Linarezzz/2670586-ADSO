public class Ejercicio12 {
    public static void main(String[] args) {
        primo(3);
    }

    public static boolean primo(int numero) {
        if (numero <= 1) {
            System.out.println("El número " + numero + " NO es primo");
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("El número " + numero + " NO es primo");
                return false;
            }
        }

        System.out.println("El número " + numero + " es primo");
        return true;
    }
}
