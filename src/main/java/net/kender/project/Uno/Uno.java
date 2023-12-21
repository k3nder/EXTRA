package net.kender.project.Uno;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author krist
 */

public class Uno {
	public static void main(String[] args) {
		System.out.println("\r\n"
				+ "\r\n"
				+ " _______     _____     \r\n"
				+ "|\\  ___ \\   / __  \\    \r\n"
				+ "\\ \\   __/| |\\/_|\\  \\   \r\n"
				+ " \\ \\  \\_|/_\\|/ \\ \\  \\  \r\n"
				+ "  \\ \\  \\_|\\ \\   \\ \\  \\ \r\n"
				+ "   \\ \\_______\\   \\ \\__\\\r\n"
				+ "    \\|_______|    \\|__|\r\n"
				+ "                       \r\n"
				+ "                       \r\n"
				+ "                       \r\n"
				+ "\r\n"
				+ "");
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de triángulos: ");
	        int cantidadTriangulos = scanner.nextInt();

	        for (int i = 1; i <= cantidadTriangulos; i++) {
	            System.out.println("Triángulo #" + i);
	            System.out.print("Ingrese la medida de la base: ");
	            double base = scanner.nextDouble();

	            System.out.print("Ingrese la medida de la altura: ");
	            double altura = scanner.nextDouble();

	            // Calcular la superficie del triángulo
	            double superficie = calcularSuperficieTriangulo(base, altura);

	            // Mostrar información del triángulo
	            System.out.println("Medida de la base: " + base);
	            System.out.println("Medida de la altura: " + altura);
	            System.out.println("Superficie: " + superficie);

	            // Verificar si la superficie es mayor a 12
	            if (superficie > 12) {
	                System.out.println("¡Superficie mayor a 12!");
	            }

	            System.out.println(); // Separador entre triángulos
	        }
	    }

	    // Función para calcular la superficie de un triángulo
	    public static double calcularSuperficieTriangulo(double base, double altura) {
	        return (base * altura) / 2;
	    }
}
