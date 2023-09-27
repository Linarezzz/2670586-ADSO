public class Ejercicio06{
    public static void main (String[] args){
        System.out.println(numero_mayor(10,5,2));
    }

    public static int numero_mayor(int a, int b, int c){
        if( a > b && a > c){
            System.out.println("De entre los 3 numeros el numero mayor es: "+a);
            return a;
        }else if( b > a && b > c){
            System.out.println("De entre los 3 numeros el numero mayor es: "+b);
            return b;
        }else if ( c > a && c > b){
            System.out.println("De entre los 3 numeros el numero mayor es: "+c);
            return c;
        }else{
            System.out.println("Los 3 numeros son iguales");
            return a;
        }
    }
}