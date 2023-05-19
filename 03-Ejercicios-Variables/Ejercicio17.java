import java.util.Scanner;

public class Ejercicio17{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        double cop,usd,eur,jpy,gbp;


        System.out.println("Escribe un programa que solicite al usuario ingresar una cantidad en COP y luego la convierta a las siguientes monedas: USD, EUR, JPY y GBP");

        System.out.println("Escribe la cantidad de dinero en pesos colombianos (COP)");
        cop = teclado.nextDouble();

        usd = (cop * 0.00022);
        eur = (cop * 0.00020);
        jpy = (cop * 0.030);
        gbp = (cop * 0.00018);

        System.out.println(cop + " pesos colombianos corresponden a :" + usd + " dolares, " + eur + " euros, " + jpy + " yenes y " + gbp + " libras esterlinas");


    }
}