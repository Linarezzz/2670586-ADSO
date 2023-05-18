import java.util.Scanner;

public class Ejercicio11{
    public static void main (String[] args ){

        Scanner teclado = new Scanner(System.in);

        double radio;
        double perimetro;
        double area;

        System.out.println("Escribe un programa que tome el radio de un círculo como entrada y calcule su perímetro y su área (π * radio^2).");

        System.out.println("Escribe el radio del circulo");
        radio = teclado.nextDouble();

        perimetro = (2*Math.PI*radio);
        area = Math.PI * Math.pow (radio ,2);

        System.out.println("El perimetro del circulo es de: "+perimetro);
        System.out.println("El area del circulo es de: "+area);

    }
}