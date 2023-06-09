import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad materias: ");
        int num_materias = teclado.nextInt();

        double sumaNotas = 0, sumaCredito = 0;
        int contador = 1;
        while(contador <= num_materias) {
            System.out.print("Ingrese nota materia "+contador+ ": ");
            double nota = teclado.nextDouble();

            System.out.print("Ingrese creditos materia "+contador+ ": ");
            double creditos = teclado.nextDouble();

            sumaNotas = sumaNotas + (nota*creditos);
            sumaCredito = sumaCredito + creditos;
            contador = contador + 1;
        }

        double promedio = sumaNotas / sumaCredito; 

        System.out.println("                       ");
        System.out.println("El total de creditos es: "+sumaCredito);
        System.out.println("El promedio del semestre es: "+promedio);


        
    }
}