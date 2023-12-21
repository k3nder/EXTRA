package net.kristian.objects;

import java.io.InputStream;

import java.util.Scanner;

public class NumScanner {
	private Scanner scan;
	public NumScanner(InputStream s) {
		scan = new Scanner(s);
	}
	public int[] get(int numOfnumbers) {
		int[] numeros = new int[numOfnumbers];
		for(int i = 1;i <= numOfnumbers;i++) {
			System.out.println("ingresa numero " + i + ": ");
			numeros[i-1] = scan.nextInt();
		}
		return numeros;
	}
	public int[] get(int numOfnumbers,String... listaDePrints) {
		int[] numeros = new int[numOfnumbers];
		for(int i = 1;i <= numOfnumbers;i++) {
			System.out.println(listaDePrints[i-1]);
			numeros[i-1] = scan.nextInt();
		}
		return numeros;
	}
}
