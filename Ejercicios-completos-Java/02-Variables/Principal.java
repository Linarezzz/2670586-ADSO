public class Principal{
    public static void main(String[] args){
        //Las variables se definen con el nombre, ya sea byte, short, int, long PARA NÚMEROS // 
        byte turno = 15;  // Desde -128 hasta 127 //                
        short loteria_risaralda = 1247; // Desde -32.768 hasta 32.767 //
        int saldo_bancario = 1500000; // Desde -2.147.483.648 hasta 2.147.483.647 //
        long tarjeta_identidad = 2000000000*5; // Desde -9.223.372.036.854.775.808 hasta 9.223.372.036.854.775.807

        float nota = 3.5f; //La f sirve para convertir de double a float //
        double pi = 3.141592653;

        boolean bandera = true;

        char letra = 'a';  // Los char solo almacenan una letra y van en comillas simples '  '  //
        // Se usa el codigo ACSII //

        String email = "juampix159@gmail.com";


        System.out.println("turno: "+turno);
        System.out.println("loteria_risaralda: "+loteria_risaralda);
        System.out.println("saldo_bancario: "+saldo_bancario);
        System.out.println("tarjeta_identidad: "+tarjeta_identidad);

        System.out.println("nota: "+nota);
        System.out.println("pi: "+pi);
        
        System.out.println("bandera: "+bandera);

        System.out.println("letra: "+letra);

        System.out.println("email: "+email);
    
    
    }
}