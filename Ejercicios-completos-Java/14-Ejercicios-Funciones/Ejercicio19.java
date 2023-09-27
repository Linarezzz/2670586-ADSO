public class Ejercicio19{
    public static void main (String[] args){
        double radio = 5.2;
        areaCirculo(radio);
    }

    public static void areaCirculo(double radio ){
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El circulo con un radio de "+radio+" tiene un area de: "+area);
    }
}