package net.kender.project.Siete;

import net.kristian.objects.NumScanner;

public class Siete {
	public static void main(String[] args) {
		System.out.println("\r\n"
				+ "\r\n"
				+ " _______    ________  \r\n"
				+ "|\\  ___ \\  |\\_____  \\ \r\n"
				+ "\\ \\   __/|  \\|___/  /|\r\n"
				+ " \\ \\  \\_|/__    /  / /\r\n"
				+ "  \\ \\  \\_|\\ \\  /  / / \r\n"
				+ "   \\ \\_______\\/__/ /  \r\n"
				+ "    \\|_______||__|/   \r\n"
				+ "                      \r\n"
				+ "                      \r\n"
				+ "                      \r\n"
				+ "\r\n"
				+ "");
		int[] nums = new NumScanner(System.in).get(10);
		int num_pares = 0;
		int num_positivos = 0;
		int num_negativos = 0;
		int num_mutipos15 = 0;
		for(int i:nums) {
			if((i%2) == 0) {
				num_pares++;
			}
			if(i > 0) {
				num_positivos++;
			}
			if(i < 0) {
				num_negativos++;
			}
			if((i%15) == 0) {
				num_mutipos15++;
			}
			
			System.out.println("numeros pares: " + num_pares + "\nnumeros positivos: " + num_positivos + "\nnum_negativos: " + num_negativos + "\nnumeros mutiples de 15: " + num_mutipos15);
		}
	}
}
