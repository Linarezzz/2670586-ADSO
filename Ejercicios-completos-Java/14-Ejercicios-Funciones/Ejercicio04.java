public class Ejercicio04{
    public static void main (String[] args){
        System.out.println("El resultado de la potencia como base el primer numero y como potencia el segundo numero es: "+potencia(4,2));
    }

    public static double potencia(double a, double b){
        double resultado = Math.pow(a,b);
        return resultado;
    }
}