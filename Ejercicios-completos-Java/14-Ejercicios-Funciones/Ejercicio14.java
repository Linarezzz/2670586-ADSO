public class Ejercicio14{
    public static void main (String[] args){
        int[] arregloAscendente = {1, 2, 3, 4, 5}; 
        int[] arregloDesordenado = {5, 3, 2, 4, 1}; 

        boolean ascendente1 = ascendentemente(arregloAscendente);
        boolean ascendente2 = ascendentemente(arregloDesordenado);

    }

    public static boolean ascendentemente(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                System.out.println("El arreglo NO está ordenado ascendentemente");
                return false;

            }
        }
        System.out.println("El arreglo está ordenado ascendentemente");
        return true; 
    }
}