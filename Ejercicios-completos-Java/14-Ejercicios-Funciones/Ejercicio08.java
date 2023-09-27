public class Ejercicio08{
    public static void main (String[] args){
        int listaNumeros [] = new int [10];
        llenarNumeros (listaNumeros);
    }

    public static int[] llenarNumeros (int [] arreglo){
        for(int i = 0 ; i < arreglo.length;i++){
            System.out.println("["+i+"]");
        }
        return arreglo;
    }
}