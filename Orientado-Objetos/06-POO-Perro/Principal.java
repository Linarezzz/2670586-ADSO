import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);


        //Arreglo de perros
        Perro listado [] = new Perro [50];

        //listado[0] = new Perro("Alnurfo","Juanpa",6,"pincher",4.4,100);
        //listado[1] = new Perro("Carbon","Juanpa",9,"labrador",5.2,150);

        // System.out.print("Ingrese el nombre de la mascota: ");
        // String nombre = entrada_texto.nextLine();

        // System.out.print("Ingrese el nombre del propietario: ");
        // String propietario = entrada_texto.nextLine();

        // System.out.print("Ingrese edad de la mascota: ");
        // int edad = entrada_numero.nextInt();

        // System.out.print("Ingrese raza de la mascota: ");
        // String raza = entrada_texto.nextLine();

        // System.out.print("Ingrese peso de la mascota: ");
        // double peso = entrada_numero.nextDouble();

        // System.out.print("Ingrese nivel de energia de la mascota: ");
        // int energia = entrada_numero.nextInt();

        // listado[2] = new Perro(nombre,propietario,edad,raza,peso,energia);

        //Imprimir arreglo
        for(int i = 0; i < listado.length;i++){
            if(listado[i] != null){
                listado[i].imprimirDetalle(); // La funcion imprimir detalle remplaza el system.out.print
            }
        }

        //Perro mas pesado
        Perro mas_pesado = listado[0];
        for(int i = 0; i < listado.length;i++){
            if( listado[i] != null){

                if( listado[i].getPeso() >= mas_pesado.getPeso()){
                    mas_pesado = listado[i];
                }

            }
        }

        if(mas_pesado != null){
            System.out.println("Nombre mas pesado: "+mas_pesado.getNombre());
            System.out.println("Propietario de mas pesado: "+mas_pesado.getPropietario());
            System.out.println("Peso de mas pesado: "+mas_pesado.getPeso());
        }else{
            System.out.println("La lista no contiene Perros");
        }
    }
}
