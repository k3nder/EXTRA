package net.kender.project.Quatro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quatro {

	public static void main(String[] args) {
		System.out.println("\r\n"
				+ "\r\n"
				+ " _______   ___   ___     \r\n"
				+ "|\\  ___ \\ |\\  \\ |\\  \\    \r\n"
				+ "\\ \\   __/|\\ \\  \\\\_\\  \\   \r\n"
				+ " \\ \\  \\_|/_\\ \\______  \\  \r\n"
				+ "  \\ \\  \\_|\\ \\|_____|\\  \\ \r\n"
				+ "   \\ \\_______\\     \\ \\__\\\r\n"
				+ "    \\|_______|      \\|__|\r\n"
				+ "                         \r\n"
				+ "                         \r\n"
				+ "                         \r\n"
				+ "\r\n"
				+ "");
		Scanner scan = new Scanner(System.in);
		System.out.println("introduce un num del 1 - 10");
		int num = scan.nextInt();
		if(num > 10) {
			throw new InputMismatchException("la entrada es mañor a 10 i no se permite: " + num);
		}
		for(int i = 0;i <= 12;i++) {
			System.out.println(i*num);
		}
	}

}
