import java.util.Scanner;

public class Principal{
    public static void main (String []args){

        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numero = new Scanner(System.in);

        CajeroElectronico cajero_02 = new CajeroElectronico(150000000, "Davivienda","adso45321","1234");
        cajero_02.abastecerCajero(1000, 1000, 500, 500);
        cajero_02.abastecerCajero(20000, 20000, 5000, 5000);
        cajero_02.imprimirDetalle();

        TarjetaDebito tarjeta_01 = new TarjetaDebito("Juan Linares", "0001 0001 0001 0001" ,"Banco pobre",0,450000,"2299");
        
        cajero_02.consignarDineroTarjeta(tarjeta_01, "2299", 0,0,0,0);

        cajero_02.imprimirDetalle();

        cajero_02.retirarDineroTarjeta(tarjeta_01, "2299", 0,0,0,0);
        cajero_02.imprimirDetalle();

        cajero_02.verHistorialTarjeta(tarjeta_01,"2299");

        cajero_02.ConsultarSaldoTarjeta(tarjeta_01,"2299");

        cajero_02.CambiarClave(tarjeta_01,"2299","1234");

        cajero_02.verHistorialTarjeta(tarjeta_01,"2299");



        
    }
}