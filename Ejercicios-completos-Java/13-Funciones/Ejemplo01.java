
public class Ejemplo01{

    public static void main(String[] args){

        int listado [] = new int [10];

        imprimirArreglo( listado );

        listado = llenarArreglo( listado );

        imprimirArreglo( listado );   // Se envia la referencia del arreglo y no se envia por valor


        String listadoPersonas [] = new String [5]; // Imprimir y modificar arreglos de tipo string con funciones

        imprimirArregloTexto (listadoPersonas);
        listadoPersonas = restablecerArreglo(listadoPersonas);
        imprimirArregloTexto (listadoPersonas);





        /*
        System.out.println("Probando funciones");
        System.out.println(" Suma = "+sumar(5,3));
        System.out.println(" Suma = "+sumar(3,2));
        System.out.println(" Suma = "+sumar(-3,20));
        System.out.println(" Suma = "+sumar(100,-50));

        System.out.println("Probando funciones");
        System.out.println(" division = "+division(5,3));
        System.out.println(" division = "+division(3,2));
        System.out.println(" division = "+division(-3,20));
        System.out.println(" division = "+division(100,-50));

        saludar();
        saludarEnBucle(5);

        imprimirTabla(5,10);
        */

        // int juanito = sumar(4,4);  // Otra forma de imprimir el resultado
        // System.out.println("juanito = "+juanito);

        // if(sumar(-5,12) >= 0){
        //     System.out.println(" El resultado es positivo");
        // }else{
        //     System.out.println(" El resultado es negativo");
        // }

    }
    
    public static int sumar(int a, int b){  // Siempre que despues de public si el tipo de dato es diferente a void SIEMPRE se debe de poner return
        int resultado = (a+b);    // Las operaciones van entre parentesis
        return resultado;  // return remlaza la invocacion de la funcion
    }

    public static float division(float a, float b){ // Este tipo de funciones deben incluir static para que sea compatible con la clase main
        float resultado = (float) (a/b);
        return resultado;
    }

    public static void saludar(){
        System.out.println("+----------------------------+");
        System.out.println("          HOLA MUNDO         +");
        System.out.println("+----------------------------+");

    }

    public static void saludarEnBucle(int cantidad){
        for(int i = 0; i < cantidad; i++){
            System.out.println("+----------------------------+");
            System.out.println("          HOLA MUNDO "+i+"    ");
            System.out.println("+----------------------------+");            
        }
    }

    public static void imprimirTabla(int tabla, int multiplo){

        for(int i=0; i <=multiplo;i++){
            System.out.println(tabla+" x "+i+" = "+(tabla*i));
        }
    }

    public static void imprimirArreglo( int [] arreglo ){   // Indicar la dimension

        for(int i = 0; i < arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }

        System.out.println("");

    }

    public static int[] llenarArreglo(int [] arreglo ){

        for(int i = 0; i < arreglo.length; i++){
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio;
        }

        return arreglo;
    }

    public static String[] restablecerArreglo(String [] arreglo ){

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = "Ninguno.";
        }

        return arreglo;
    }

    public static void imprimirArregloTexto(String [] arreglo ){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }

        System.out.println("");
    }


}