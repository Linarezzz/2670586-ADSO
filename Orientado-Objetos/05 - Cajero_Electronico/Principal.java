import java.util.Scanner;

public class Principal{
    public static void main (String []args){

        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numero = new Scanner(System.in);

        CajeroElectronico cajero_01= new CajeroElectronico(500,250,5,10,20,2,"Banco popular","adso123","Admin pro");

        cajero_01.imprimirDetalle();

        CajeroElectronico cajero_02 = new CajeroElectronico(150000000, "Davivienda","adso45321","1234");
        cajero_02.imprimirDetalle();

        cajero_02.abastecerCajero(1000, 1000, 500, 500);
        cajero_02.imprimirDetalle();

        TarjetaDebito miTarjeta = new TarjetaDebito("Juan", "1234 5678 9012 3456", "Banco pobre", 1500, 500, "1234", "ACTIVA");
        miTarjeta.aumentarSaldo(500); // Aumenta el saldo en 500 unidades

        miTarjeta.imprimirDetalle();

        miTarjeta.disminuirSaldo(200);
        miTarjeta.imprimirDetalle();
    }
}