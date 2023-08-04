import java.util.Scanner;

public class Ejercicio03{
    public static void main(String []args){

        Scanner teclado = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

        int numero_registros = 100;
        String nombre;
        int opcion;
        //String arreglo [] = new String [nombre];

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
                //for(int i = 0; i < arreglo.length;i++){
                    //arreglo[i] += nombre;
                //}
                numero_registros--;
            }

            else if(opcion == 5){
                System.out.println("Has seleccionado la opcion 5, hasta luego");
            }else{
                System.out.println("Ingresa una opcion valida");
            }



















        }while(opcion !=5);

        
    }
}