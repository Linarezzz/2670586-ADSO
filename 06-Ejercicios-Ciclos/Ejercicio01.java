import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de notas: ");
        int cantidad = teclado.nextInt();

        double sumaNotas = 0;
        int contador = 1;

        while(contador <= cantidad){
            System.out.print("Ingrese nota "+contador+": ");
            double nota = teclado.nextDouble();

            sumaNotas = sumaNotas + nota;

            contador = contador + 1;
        }

        double promedio = sumaNotas / cantidad;
        System.out.println("El promedio de nota obtenida es de: "+promedio);

    }
}