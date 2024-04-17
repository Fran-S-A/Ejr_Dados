package juego;
import java.util.Random;

public class JuegoDados {

	public static void main(String[] args) {
		/**
		 * Se crean dos variables que almacenan los valores de los dados.
		 */
		int valorDado1 = 0;
        int valorDado2 = 0;
        Random dado = new Random(); // Random que se utiliza para generar los valores.
        int tiradas = 0; // Contador para las tiradas
        /**
         * Se utiliza un bucle para realizar tiradas hasta que ambos valores sean 6.
         */
        while (valorDado1 != 6 || valorDado2 != 6){
	        valorDado1 = tirada(dado);
	        valorDado2 = tirada(dado);
	        mostrarResultados(valorDado1, valorDado2);
	        tiradas++;
        }
        // Al terminar se imprimen las tiradas.
        System.out.println("Número de tiradas: " + tiradas);
	}
	/**
	 * Método que imprime los resultados de las tiradas.
	 * @param valorDado1 Entero con el valor del dado 1.
	 * @param valorDado2 Entero con el valor del dado 2.
	 */
	public static void mostrarResultados(int valorDado1, int valorDado2) {
		System.out.println( "Dado 1 - Dado 2");
		System.out.println("  "+valorDado1+" 	   "+valorDado2);
	}
	/**
	 * Método que genera el valor entre 0 y el valor especificado, por esto se suma 1,
     * para que nunca salga 0.
	 * @param dado Objeto Random
	 * @return Valor del dado
	 */
	public static int tirada(Random dado) {
		return dado.nextInt(6)+1;
	}

}
