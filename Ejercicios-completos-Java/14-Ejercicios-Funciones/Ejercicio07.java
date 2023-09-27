public class Ejercicio07{
    public static void main (String[] args){
        int listaNumeros [] = new int [10];
        llenarArreglo(listaNumeros);
    }

    public static int[] llenarArreglo (int [] arreglo){
        for(int i = 0; i < arreglo.length;i++){
            int aleatorio = (int) (Math.random()*500);
            arreglo[i] = aleatorio;
            System.out.print("["+arreglo[i]+"]");
        }

        return arreglo;

    }
}