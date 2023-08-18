import java.util.Scanner;

public class Ejercicio15{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        Double metros, centimetros, pulgadas, pies;

        System.out.println("Escribe un programa que convierta una longitud en metros a otras unidades: centímetros, pulgadas y pies.");

        System.out.println("Escribe los metros que quieres convertir");
        metros = teclado.nextDouble();

        centimetros = (metros * 100);
        pulgadas = (metros * 39.37);
        pies = (metros * 3.281);

        System.out.println(metros + " metros equivalen a: "+ centimetros + " centimetros, " + pulgadas + " pulgadas y " + pies + " pies");





    }
}