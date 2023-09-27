public class Ejercicio20{
    public static void main (String[] args){
        double base = 7;
        double altura = 10;
        areaTriangulo(base, altura);
    }

    public static void areaTriangulo (double base, double altura){
        double area = (base*altura) / 2;
        System.out.println("La base del triangulo es de "+base+" , ademas su altura es de "+altura+ " y su area es de: "+area);
    }
}