import java.util.Scanner;

public class Ejercicio13{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int segundosiniciales, horas, minutos, segundos;

        System.out.println("Escribe un programa que tome un número de segundos como entrada y lo convierta a un formato de horas, minutos y segundos");

        System.out.println("Escribe los segundos");
        segundosiniciales = teclado.nextInt();

        minutos = segundosiniciales / 60;
        segundos = segundosiniciales % 60;

        horas = minutos / 60;
        minutos = minutos % 60;

        System.out.println(segundosiniciales + " segundos son: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
        




    }
}