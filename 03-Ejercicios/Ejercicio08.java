import java.util.Scanner;

public class Ejercicio08{
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        String primer_texto;
        String segundo_texto;



        System.out.println("Escribe un programa que tome dos cadenas de texto como entrada y las concadene en una sola cadena");

        System.out.println("Escribe el primer texto");
        primer_texto = teclado.nextLine();   // Para guardar la informacion de los string se usa next LINE, no string como de costumbre //

        System.out.println("Escribe el segundo texto");
        segundo_texto = teclado.nextLine();

        System.out.println(primer_texto + segundo_texto);

    }
}