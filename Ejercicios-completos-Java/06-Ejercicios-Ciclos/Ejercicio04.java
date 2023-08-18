import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("|------------- Bienvenido ------------|");
            System.out.println("| 1. Docente                          |");
            System.out.println("| 2. Estudiante                       |");
            System.out.println("| 3. Salir                            |");
            System.out.println("|-------------------------------------|");
            System.out.print("--> Ingrese una opción: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("Has seleccionado la opción 1");
                System.out.print("Ingrese la cantidad de materias: ");
                int num_materias = teclado.nextInt();

                double sumaNotas = 0, sumaCreditos = 0;

                for (int contador = 1; contador <= num_materias; contador++) {
                    System.out.print("Ingrese la nota de la materia " + contador + ": ");
                    double nota = teclado.nextDouble();

                    System.out.print("Ingrese los créditos de la materia " + contador + ": ");
                    double creditos = teclado.nextDouble();

                    sumaNotas += nota * creditos;
                    sumaCreditos += creditos;
                }

                if (sumaCreditos > 0) {
                    double promedio = sumaNotas / sumaCreditos;
                    System.out.println("                                        ");
                    System.out.println("El total de créditos es: " + sumaCreditos);
                    System.out.println("El promedio del semestre es: " + promedio);
                } else {
                    System.out.println("No se ingresaron materias. El total de créditos es: 0");
                }
                 } else if (opcion == 2) {
                System.out.print("Ingrese un número para determinar la altura de la pirámide: ");
                int altura_piramide = teclado.nextInt();

                if (altura_piramide <= 0) {
                    System.out.println("La altura no es válida");
                } else {
                    for (int i = 1; i <= altura_piramide; i++) {
                        // Imprimir espacios en blanco para alinear la pirámide
                        for (int j = 1; j <= altura_piramide - i; j++) {
                            System.out.print(" ");
                        }

                        // Imprimir asteriscos para construir la pirámide
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("X");
                        }

                        // Pasar a la siguiente línea después de cada renglón de la pirámide
                        System.out.println();
                    }
                }    
                

           

            } else if (opcion == 3) {
                System.out.println("Has seleccionado la opcion 3. ¡Hasta luego!");
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }    
            
        } while (opcion != 3);
        

    }
}
