import java.util.Scanner;

public class Ejercicio03{
    public static void main(String []args){

        Scanner teclado = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

        int numero_registros = 100;
        int opcion;
        String nombre;
        String arreglo [] = new String [100];

        do{
            System.out.println("                                                            Memoria disponible: "+numero_registros+" Registros");
            System.out.println("1.Registrar cliente.");
            System.out.println("2.Ver lista de clientes.");
            System.out.println("3.Editar cliente.");
            System.out.println("4.Eliminar cliente.");
            System.out.println("5.Salir");

            System.out.print("--> Ingrese una opcion: ");
            opcion = teclado.nextInt();

            if(opcion == 1){
                System.out.println("Has seleccionado la opcion 1");
                System.out.print("Ingrese el nombre completo del cliente: ");
                nombre = texto.nextLine();
                

                numero_registros--;
            }else if(opcion == 2){
                System.out.println("La lista de clientes es: ");
            }else if(opcion == 3){

            }else if(opcion == 4){

            }else if(opcion == 5){
                System.out.println("Has seleccionado la opcion 5, hasta luego");
            }else{
                System.out.println("Ingresa una opcion valida");
            }


            if (numero_registros == 0){
                System.out.println("Se ha llegado al limite de memoria, por favor elimine algun cliente");
            }


















        }while(opcion !=5);

        
    }
}