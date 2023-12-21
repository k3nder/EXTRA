package net.kender.project.Seis;

import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {
		System.out.println("\r\n"
				+ "\r\n"
				+ " _______   ________     \r\n"
				+ "|\\  ___ \\ |\\   ____\\    \r\n"
				+ "\\ \\   __/|\\ \\  \\___|    \r\n"
				+ " \\ \\  \\_|/_\\ \\  \\____   \r\n"
				+ "  \\ \\  \\_|\\ \\ \\  ___  \\ \r\n"
				+ "   \\ \\_______\\ \\_______\\\r\n"
				+ "    \\|_______|\\|_______|\r\n"
				+ "                        \r\n"
				+ "                        \r\n"
				+ "                        \r\n"
				+ "\r\n"
				+ "");
		Scanner scan = new Scanner(System.in);

        System.out.print("ingrese la cantidad de puntos a procesar: ");
        int cantidadPuntos = scan.nextInt();

        int cuadrante1 = 0, cuadrante2 = 0, cuadrante3 = 0, cuadrante4 = 0;

        for (int i = 0; i < cantidadPuntos; i++) {
            System.out.println("ingrese las coordenadas del punto #" + (i + 1));
            System.out.print("ingrese la coordenada x: ");
            double x = scan.nextDouble();

            System.out.print("ingrese la coordenada y: ");
            double y = scan.nextDouble();

            if (x > 0 && y > 0) {
                cuadrante1++;
            } else if (x < 0 && y > 0) {
                cuadrante2++;
            } else if (x < 0 && y < 0) {
                cuadrante3++;
            } else if (x > 0 && y < 0) {
                cuadrante4++;
            }
        }

        System.out.println("Puntos en el primer cuadrante: " + cuadrante1);
        System.out.println("Puntos en el segundo cuadrante: " + cuadrante2);
        System.out.println("Puntos en el tercer cuadrante: " + cuadrante3);
        System.out.println("Puntos en el cuarto cuadrante: " + cuadrante4);

        scan.close();
	}

}
