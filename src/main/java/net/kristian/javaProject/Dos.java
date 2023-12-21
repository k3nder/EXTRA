package net.kristian.javaProject;

import java.util.Scanner;

import net.kristian.objects.NumScanner;

/**
 * @author krist
 */

public class Dos {

	public static void main(String[] args) {
		int[] numeros = new NumScanner(System.in).get(3);
		if(numeros[0] == numeros[1] && numeros[1] == numeros[2]) {
			System.out.println(String.format("el resultado es: %d", obtenerResultado(numeros)));
		}
	}
	private static int obtenerResultado(int[] array) {
		return array[0] + array[1] * array[2];
	}

}
