import java.util.Scanner;

public class Ejercicio02{
    public static void main(String []args){
        //Realizar una aplicación en JAVA que solicite al usuario un numero entero N, cree un arreglo
        //de String de tamaño N, llene el arreglo con datos pedidos al usuario, muestre el arreglo en
        //pantalla

        //Después de mostrar el arreglo en pantalla se debe solicitar al usuario ingresar un nombre y la
        //aplicación debe mostrar en pantalla la posición donde se encuentra exactamente ese nombre
        //en arreglo.


        Scanner teclado = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        //Arreglo
        String arreglo [] = new String [numero];

        //Ciclo para llenar el arreglo
        for(int i = 0; i<arreglo.length;i++){
            System.out.print("Ingrese un nombre: ");
            arreglo[i] = texto.nextLine();
        }
        System.out.println("-----------------------------------");
        //Ciclo para imprimir el arreglo
        for(int i = 0; i<arreglo.length;i++){
            System.out.println("Las palabras ingresadas del arreglo son: "+arreglo[i]);
        }

        System.out.print("Ingrese un nombre y se mostrara la posicion en la que esta en el arreglo: ");
        String nombre = texto.nextLine();

        for(int i = 0; i<arreglo.length;i++){
            if(arreglo[i].equalsIgnoreCase(nombre)){  // .equals.ignore case es una condicion que se cumple con datos tipo string o no primitivos
                System.out.println("El nombre se encuentra en la posicion "+i);
            }
        }




    }
}