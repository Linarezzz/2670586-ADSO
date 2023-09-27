public class Ejercicio21{
    public static void main (String[] args){
        int celcius = 4;
        fahrenheit(celcius);
    }

    public static void fahrenheit (double temperatura){
        double fahrenheit = (temperatura*9/5) + 32;
        System.out.println(temperatura+" grados Celcius convertidos a fahrenheit son: "+fahrenheit+" grados ");

    }
}