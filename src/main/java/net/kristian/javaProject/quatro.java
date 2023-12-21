package net.kristian.javaProject;

import net.kristian.objects.NumScanner;

/**
 * @author krist
 */

public class quatro {
	public static final int NUMERO_LIMITE = 10;

	public static void main(String[] args) {
		int[] numeros = new NumScanner(System.in).get(3);
		if(numeros[0] < NUMERO_LIMITE || numeros[1] < NUMERO_LIMITE || numeros[2] < NUMERO_LIMITE) {
			System.out.println("Alguno de los números es menor a diez");
		}
	}
}
