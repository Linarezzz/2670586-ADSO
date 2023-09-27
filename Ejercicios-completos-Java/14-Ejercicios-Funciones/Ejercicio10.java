public class Ejercicio10 {
    public static void main(String[] args) {
        int arreglo[] = new int[5];
        promedio(arreglo);
    }

    public static void promedio(int[] arreglo) {
        double suma = 0;
        double promedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            double aleatorio = Math.random() * 100; 
            arreglo[i] = (int) aleatorio; 
            System.out.print("[" + arreglo[i] + "]");
            suma += arreglo[i];
        }
        promedio = suma / arreglo.length; 
        System.out.println("\nEl promedio es de: " + promedio);
    }
}
