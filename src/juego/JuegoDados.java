package juego;
import java.util.Random;

public class JuegoDados {

	public static void main(String[] args) {
		int valorDado1 = 0;
        int valorDado2 = 0;
        Random dado = new Random();
        int contador = 0;
        while (valorDado1 != 6 || valorDado2 != 6){
	        
	        valorDado1 = dado.nextInt(6)+1;
	        valorDado2 = dado.nextInt(6)+1;
	        System.out.println( "Dado 1 - Dado 2");
	        System.out.println("  "+valorDado1+" 	   "+valorDado2);
	        contador++;
        }
        System.out.println("Número de tiradas: " + contador);
	}

}
