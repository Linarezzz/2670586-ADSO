public class Ejercicio09 {
    public static void main(String[] args) {
        int listaNumeros[] = new int[10];
        llenarArreglo(listaNumeros);
    }

    public static void llenarArreglo(int[] arreglo) {
        if (arreglo.length == 0) {
            System.out.println("El arreglo está vacío");
            return; 
        }

        int minimo = Integer.MAX_VALUE; // 

        for (int i = 0; i < arreglo.length; i++) {
            int aleatorio = (int) (Math.random() * 500);
            arreglo[i] = aleatorio;
            System.out.print("[" + arreglo[i] + "]");

            // Encuentra el valor mínimo dentro del mismo bucle
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        
        System.out.println("\nEl valor mínimo en el arreglo es: " + minimo);
    }
}
