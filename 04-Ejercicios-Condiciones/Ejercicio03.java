import java.util.Scanner;

public class Ejercicio03{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        Byte numero_x, numero_y;

        System.out.println("Realizar una aplicación en JAVA, que solicite al usuario ingresar dos números enteros correspondientes a una coordenada de un plano cartesiano (x,y). La aplicación debe determinar por medio de la coordenada en que cuadrante se encuentra.");

        System.out.print("Ingrese valor de x: ");
        numero_x = teclado.nextByte();

        System.out.print("Ingrese valor de y: ");
        numero_y = teclado.nextByte();

        if(numero_x > 0 & numero_x <= 6 & numero_y > 0 & numero_y <= 6){   // & seria para poner Y en java //
            System.out.println("La coordenada ingresada se encuentra en el primer cuadrante ");
        }

    }
}