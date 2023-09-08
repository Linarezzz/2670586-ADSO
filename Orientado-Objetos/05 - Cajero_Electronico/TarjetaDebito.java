import java.util.Date;
public class TarjetaDebito{
    //Atributos
    private String nombrePropietario;
    private String numeroTarjeta;
    private String nombreBanco;
    private int dineroDisponible;
    private int cantidadRetiro;
    private String TransaccionesTarjeta [];
    private String clave;
    private String estado;

    //Metodo constructor
    public TarjetaDebito (String nombrePropietario, String numeroTarjeta, String nombreBanco, int dineroDisponible, int cantidadRetiro, String clave){
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.dineroDisponible = dineroDisponible;
        this.cantidadRetiro = cantidadRetiro;
        this.clave = clave;
        this.estado = "ACTIVA";

        TransaccionesTarjeta = new String [10];
    }

    public void imprimirDetalle(){
        System.out.println("---------------------------------------");
        System.out.println("  nombrePropietario: "+nombrePropietario);
        System.out.println("  numeroTarjeta: "+numeroTarjeta);
        System.out.println("  nombreBanco: "+nombreBanco);
        System.out.println("  dineroDisponible: "+dineroDisponible);
        System.out.println("  clave: "+clave);
        System.out.println("  estado: "+estado);
        System.out.println("  Historial de transacciones: ");

        for(int i = 0; i < TransaccionesTarjeta.length; i++){
            if (TransaccionesTarjeta[i] !=null){
                System.out.println("        => "+TransaccionesTarjeta[i]);
            }
        }

        System.out.println("---------------------------------------");


    }

    public void registrarTransaccionTarjeta(String tipo, int monto, String estado){
        Date fecha = new Date();  //Se crea un objeto de tipo fecha, la cual genera la fecha actual del sistema
        String texto = fecha.toString()+tipo+" - "+" - "+monto+" - "+estado;  //fecha.toString para generar su texto
        
        //Buscar un indice donde este vacio
        int indice = -1;

        for(int i = 0; i < TransaccionesTarjeta.length; i++){
            if(TransaccionesTarjeta[i] == null){
                indice = i;
                break;
            }
        }

        if(indice != -1){
            TransaccionesTarjeta[indice] = texto;
        }else{
            for(int i = 0; i < TransaccionesTarjeta.length-1; i++){
                TransaccionesTarjeta[i] = TransaccionesTarjeta[i+1];
            }
            TransaccionesTarjeta[TransaccionesTarjeta.length-1] = texto;
        }

    }

    public void verHistorial(String pass){
        if(pass.equals(clave) ){

            registrarTransaccionTarjeta(" HISTORIAL ",0,"OK");
            for(int i = 0; i < TransaccionesTarjeta.length; i++){
                if(TransaccionesTarjeta[i] != null){
                    System.out.println(" => "+TransaccionesTarjeta[i]);
                }
            }
        }else{
            System.out.println(" ===> ACCESO DENEGADO DESDE LA TARJETA <===");
            registrarTransaccionTarjeta(" HISTORIAL ",0,"ERROR");
        }
    }

    public boolean aumentarSaldo(int monto, String pass) {
        if ( pass.equals(clave) ) {
            if(monto > 0){
                dineroDisponible += monto;
                System.out.println("  ===> TRANSACCION EXITOSA EN TARJETA <===");
                registrarTransaccionTarjeta(" AUMENTOSALDO ", monto, "OK");
                return true;
            }else{
                System.out.println("  ===> ERROR EN MONTO INGRESADO <===");
                registrarTransaccionTarjeta(" AUMENTOSALDO ", monto, "ERROR");
                return false;
            }
        }else{
            System.out.println("  ===> ERROR EN PASSWORD AUMENTO DE SALDO <===");
            registrarTransaccionTarjeta(" AUMENTOSALDO ", monto, "ERROR");
            return false;
        }
    }

    public boolean disminuirSaldo(int monto, String pass) {
        if ( pass.equals(clave) ) {
            if(monto > 0 && monto <= cantidadRetiro){
                if( monto <= dineroDisponible){
                    dineroDisponible -= monto;
                    System.out.println("  ===> TRANSACCION EXITOSA EN TARJETA <===");
                    registrarTransaccionTarjeta(" DISMINUIRSALDO ", monto, "OK");
                    return true;
                }else{
                    System.out.println("  ===> ERROR EN MONTO INGRESADO SUPERA DINERO EN TARJETA <===");
                    registrarTransaccionTarjeta(" DISMINUIRSALDO ", monto, " ERROR");
                    return false;
                }
            }else{
                System.out.println("  ===> ERROR EN MONTO INGRESADO - FUERA DE RANGO <===");
                registrarTransaccionTarjeta(" DISMINUIRSALDO ", monto, " ERROR");
                return false;
            }
        }else{
            System.out.println("  ===> ERROR EN PASSWORD DISMINUICION DE SALDO <===");
            registrarTransaccionTarjeta(" DISMINUIRSALDO ", monto, " ERROR");
            return false;
        }
    }

    public int getSaldo(String pass){
        if(pass.equals(clave)){
            registrarTransaccionTarjeta(" CONSULTASALDO ",0," OK");
            return dineroDisponible;
        }else{
            registrarTransaccionTarjeta(" CONSULTASALDO ",0," ERROR");
            return -1;

        }
    }

    public boolean validarClave(String pass){
        if(pass.equals(clave)){
            registrarTransaccionTarjeta(" VALIDARCLAVEINTERNA",0," OK");
            return true;
        }else{
            registrarTransaccionTarjeta(" VALIDARCLAVEINTERNA",0," ERROR");
            return false;
        }
    }

    public boolean validarEstadoActiva(){
        if(estado.equals("ACTIVA")){
            return true;
        }else{
            return false;
        }
    }

    public String getNumero(){
        return numeroTarjeta;
    }
}