import java.util.Date; // Se importa la libreria de fechas

public class CajeroElectronico{
    //Atributos
    int capacidadTotal;
    int dineroDisponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombreBanco;
    String listaTransacciones [];  // Los atributos que son arreglos NO se ponen en el constructor
    String usuarioAdmin;
    String claveAdmin;

    //Metodo constructor
    public CajeroElectronico (int capacidadTotal,int dineroDisponible,int cant_10,int cant_20,int cant_50,int cant_100,String nombreBanco,String usuarioAdmin,String claveAdmin){
        this.capacidadTotal = capacidadTotal;  // This. para el contexto, ya que es ambiguo
        this.dineroDisponible = dineroDisponible;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;

        listaTransacciones = new String [100];
    }

    //Metodo constructor 2
    public CajeroElectronico(int capacidadTotal, String nombreBanco, String usuarioAdmin, String claveAdmin){
        this.capacidadTotal = capacidadTotal;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;

        this.dineroDisponible = 0;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;

        listaTransacciones = new String [100];
    }

    public void imprimirDetalle(){
        System.out.println("---------------------------------------");
        System.out.println("  capacidadTotal: "+capacidadTotal);
        System.out.println("  dineroDisponible: "+dineroDisponible);
        System.out.println("  cant_10: "+cant_10);
        System.out.println("  cant_20: "+cant_20);
        System.out.println("  cant_50: "+cant_50);
        System.out.println("  cant_100: "+cant_100);
        System.out.println("  nombreBanco: "+nombreBanco);
        System.out.println("  usuarioAdmin: "+usuarioAdmin);
        System.out.println("  claveAdmin: "+claveAdmin);
        System.out.println("  Historial de transacciones: ");

        for(int i = 0; i < listaTransacciones.length; i++){
            if (listaTransacciones[i] !=null){
                System.out.println("        => "+listaTransacciones[i]);
            }
        }

        System.out.println("---------------------------------------");


    }

    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){  //Ademas de void se puede usar algun otro tipo de dato
        // Calcular total ingresado, luego validar que no exceda el limite
        int total = (cant_10*10000) + (cant_20*20000) + (cant_50*50000) + (cant_100*100000);

        //Validar que no exceda el limite
        if(total <= capacidadTotal){
            //Si... almacenar los datos en los atributos y retornar verdadero
            dineroDisponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;

            registrarTransaccion(" ABASTECER", "0000 0000 0000 0000", total, "OK");
            return true;
        }else{
            //No... Imprimir mensaje y retornar falso
            registrarTransaccion(" ABASTECER", "0000 0000 0000 0000", total, "ERROR");
            return false;

        }
    }

    public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado){
        Date fecha = new Date();  //Se crea un objeto de tipo fecha, la cual genera la fecha actual del sistema
        String texto = fecha.toString()+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;  //fecha.toString para generar su texto
        
        //Buscar un indice donde este vacio
        int indice = -1;

        for(int i = 0; i < listaTransacciones.length; i++){
            if(listaTransacciones[i] == null){
                indice = i;
                break;
            }
        }

        if(indice != -1){
            listaTransacciones[indice] = texto;
        }else{
            for(int i = 0; i < listaTransacciones.length-1; i++){
                listaTransacciones[i] = listaTransacciones[i+1];
            }
            listaTransacciones[listaTransacciones.length-1] = texto;
        }

    }

    public void verHistorialCajero(String user, String pass){
        if(user.equals(usuarioAdmin) && pass.equals(claveAdmin)){ // De esta forma se evalua si el usuario y la clave del admin son iguales a las establecidad. con .equals
            
            registrarTransaccion(" HISTORIAL","0000 0000 0000 0000",0,"OK");

            System.out.println("------------------------------------");
            System.out.println("          HISTORIAL CAJERO          ");
            System.out.println("------------------------------------");
            for(int i = 0; i < listaTransacciones.length; i++){
                if(listaTransacciones[i] != null){
                    System.out.println(listaTransacciones[i]); // Se evalua cada transaccion y si esta vacia o no
                }
            }
        }else{
            System.out.println("  ===> ACCESO DENEGADO <===");
            registrarTransaccion(" HISTORIAL","0000 0000 0000 0000",0,"ERROR");

        }
        
    }

    public void consignarDineroTarjeta(TarjetaDebito tarjeta, String clave, int cant_10, int cant_20, int cant_50, int cant_100){
        int monto = (10000 * cant_10) + (20000 * cant_20) + (50000 * cant_50) + (100000 * cant_100);
        // Validar la clave
        if(tarjeta.validarClave(clave)){
            // Validar el estado de la tarjeta "ACTIVA"
            if(tarjeta.validarEstadoActiva() ){

                // El monto ingresado sea mayor a 0
                if(monto > 0){
                    // Validar que con el dinero ingresado no supere el limite del cajero
                    if(dineroDisponible + monto <= capacidadTotal){
                        // Aumentar saldo de la tarjeta
                        tarjeta.aumentarSaldo(monto, clave);

                        // Aumentar el saldo del cajero y cantidades de billetes
                        dineroDisponible += monto;
                        this.cant_10 += cant_10;
                        this.cant_20 += cant_20;
                        this.cant_50 += cant_50;
                        this.cant_100 += cant_100;

                        // Registrar la transacción
                        System.out.println("  ===> REALIZADO - CONSIGNAR DINERO <===");
                        registrarTransaccion(" CONSIGNACION",tarjeta.getNumero(), monto," OK");
                        
                    }else{
                        System.out.println("  ===> ERROR MONTO SUPERIOR - CONSIGNAR DINERO <===");
                        registrarTransaccion(" CONSIGNACION",tarjeta.getNumero(), monto," ERROR MONTO SUPERIOR");
                    }

                }else{
                    System.out.println("  ===> ERROR MONTO INFERIOR - CONSIGNAR DINERO <===");
                    registrarTransaccion(" CONSIGNACION",tarjeta.getNumero(), monto," ERROR MONTO INFERIOR");
                }
            }else{
                System.out.println("  ===> ERROR ESTADO - CONSIGNAR DINERO <===");
                registrarTransaccion(" CONSIGNACION",tarjeta.getNumero(), monto," ERROR ESTADO"); 
            }

            
        }else{
            System.out.println("  ===> ERROR PASSWORD - CONSIGNAR DINERO <===");
            registrarTransaccion(" CONSIGNACION",tarjeta.getNumero(), monto," ERROR PASSWORD");
        }
        
    }

    public void retirarDineroTarjeta(TarjetaDebito tarjeta, String clave, int cant_10, int cant_20, int cant_50, int cant_100){
        int monto = (10000 * cant_10) + (20000 * cant_20) + (50000 * cant_50) + (100000 * cant_100);
        // Validar la clave
        if(tarjeta.validarClave(clave)){
            // Validar el estado de la tarjeta "ACTIVA"
            if(tarjeta.validarEstadoActiva() ){

                // El monto a retirar ingresado sea mayor a 0
                if(monto > 0 && monto < tarjeta.getDineroDisponible()){
                    // Validar que con el dinero a retirar no supere el limite del cajero
                    if(dineroDisponible - monto < capacidadTotal){
                        // Disminuir saldo de la tarjeta
                        tarjeta.disminuirSaldo(monto, clave);

                        // Disminuir el saldo del cajero y cantidades de billetes
                        dineroDisponible -= monto;
                        this.cant_10 -= cant_10;
                        this.cant_20 -= cant_20;
                        this.cant_50 -= cant_50;
                        this.cant_100 -= cant_100;

                        // Registrar la transacción
                        System.out.println("  ===> REALIZADO - RETIRAR DINERO <===");
                        registrarTransaccion(" RETIRO ",tarjeta.getNumero(), monto," OK");
                        
                    }else{
                        System.out.println("  ===> ERROR MONTO SUPERIOR - RETIRAR DINERO <===");
                        registrarTransaccion(" RETIRO ",tarjeta.getNumero(), monto," ERROR MONTO SUPERIOR");
                    }

                }else{
                    System.out.println("  ===> ERROR MONTO INFERIOR - RETIRAR DINERO <===");
                    registrarTransaccion(" RETIRO ",tarjeta.getNumero(), monto," ERROR MONTO INFERIOR");
                }
            }else{
                System.out.println("  ===> ERROR ESTADO - RETIRAR DINERO <===");
                registrarTransaccion(" RETIRO ",tarjeta.getNumero(), monto," ERROR ESTADO"); 
            }

            
        }else{
            System.out.println("  ===> ERROR PASSWORD - RETIRAR DINERO <===");
            registrarTransaccion(" RETIRO ",tarjeta.getNumero(), monto," ERROR PASSWORD");
        }
    }

    public void verHistorialTarjeta(TarjetaDebito tarjeta, String pass) {
        if (tarjeta.getNumero().equals(tarjeta.getNumero()) && pass.equals(tarjeta.getClave())) {
            registrarTransaccion(" HISTORIAL", tarjeta.getNumero(), 0, "OK");

            System.out.println("------------------------------------");
            System.out.println("          HISTORIAL TARJETA         ");
            System.out.println("------------------------------------");
            String transacciones [] = tarjeta.getTransaccionesTarjeta();
            for (int i = 0; i < transacciones.length; i++) {
                if (transacciones[i] != null) {
                    System.out.println(transacciones[i]); // Se evalúa cada transacción y si está vacía o no
                }
            }
        } else {
            System.out.println("  ===> ACCESO DENEGADO <===");
            registrarTransaccion(" HISTORIAL", tarjeta.getNumero(), 0, "ERROR");
        }
    }

    public void ConsultarSaldoTarjeta(TarjetaDebito tarjeta, String pass) {
        if (tarjeta.getNumero().equals(tarjeta.getNumero()) && pass.equals(tarjeta.getClave())) {
            registrarTransaccion(" SALDO", tarjeta.getNumero(), 0, "OK");
            System.out.println("------------------------------------");
            System.out.println("          SALDO TARJETA             ");
            System.out.println("------------------------------------");
            System.out.println("El saldo de la tarjeta es de: " + tarjeta.getDineroDisponible());
        } else {
            registrarTransaccion(" SALDO", tarjeta.getNumero(), 0, "ERROR PASS");
        }
    }

    public void CambiarClave(TarjetaDebito tarjeta, String pass, String nuevaClave) {
        if (tarjeta.getNumero().equals(tarjeta.getNumero()) && pass.equals(tarjeta.getClave())) {
            tarjeta.setClave(nuevaClave); // Actualiza la clave con la nuevaClave
            registrarTransaccion(" CAMBIO CLAVE", tarjeta.getNumero(), 0, "OK");
            System.out.println("La clave de la tarjeta ha sido cambiada exitosamente.");
        } else {
            registrarTransaccion(" CAMBIO CLAVE", tarjeta.getNumero(), 0, "ERROR PASS");
            System.out.println("No se pudo cambiar la clave debido a un error en la contraseña.");
        }
    }
}