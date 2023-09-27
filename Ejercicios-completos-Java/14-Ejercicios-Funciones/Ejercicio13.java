public class Ejercicio13{
    public static void main (String[] args){
        int arreglo [] = new int [10];
        ascendente(arreglo);
    }

    public static void ascendente (int [] arreglo){

        for(int i = 0; i < arreglo.length;i++){
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio;
        }
        System.out.print("Arreglo original: [");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int aux;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.print("Arreglo ordenado ascendente: [");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}