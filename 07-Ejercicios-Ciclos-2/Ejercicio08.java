import java.util.Scanner;

public class Ejercicio08{
	public static void main(String[] args) {
		
		// Variable de Entrada
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese un numero N: ");
		int numero = entrada.nextInt();

		if ( numero% 2 == 0) {
			
			int contador = 0;
			for (int columna=1; columna<=numero; columna++) {
				for (int fila=1; fila<=numero; fila++) {
					if (contador%2 == 0) {
						
						int contGenerado = 0;
						while ( contGenerado<1 ){
							int aleatorio = (int) (Math.random()*1000);
							int divisores = 0;
							for (int h=1; h<=aleatorio; h++) {
								if (aleatorio%h == 0) {
									divisores = divisores + 1;
								}
							}
							if (divisores==2) {    // Operador condicional ternario donde hace una condicion en una sola linea 
								System.out.print("["+(((aleatorio<10)? "00":((aleatorio<100)? "0":""))+aleatorio)+"]");
								contGenerado = contGenerado + 1;
							}
						}

					}else{
						
						int contGenerado = 0;
						while ( contGenerado<1 ){
							int aleatorio = (int) (Math.random()*1000);
							int divisores = 0;
							for (int h=1; h<=aleatorio; h++) {
								if (aleatorio%h == 0) {
									divisores = divisores + 1;
								}
							}
							if (divisores>2) {
								System.out.print("["+(((aleatorio<10)? "00":((aleatorio<100)? "0":""))+aleatorio)+"]");
								contGenerado = contGenerado + 1;
							}
						}

					}
					contador = contador + 1;
				}
				System.out.println("");
			}	


		}else{
			System.out.println(" ---- EL NUMERO NO ES VALIDO ----");
		}

	}
}
    

    
