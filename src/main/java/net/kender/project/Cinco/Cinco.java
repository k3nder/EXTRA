package net.kender.project.Cinco;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Cinco {
	public static void main(String[] args) {
		System.out.println("\r\n"
				+ "\r\n"
				+ " _______   ________      \r\n"
				+ "|\\  ___ \\ |\\   ____\\     \r\n"
				+ "\\ \\   __/|\\ \\  \\___|_    \r\n"
				+ " \\ \\  \\_|/_\\ \\_____  \\   \r\n"
				+ "  \\ \\  \\_|\\ \\|____|\\  \\  \r\n"
				+ "   \\ \\_______\\____\\_\\  \\ \r\n"
				+ "    \\|_______|\\_________\\\r\n"
				+ "             \\|_________|\r\n"
				+ "                         \r\n"
				+ "                         \r\n"
				+ "\r\n"
				+ "");
		Scanner scan = new Scanner(System.in);
		System.out.println("introcune numero de triangulos");
		int num = scan.nextInt();
		HashMap<Type,Integer> typeListHash = getValues(scan,num);
		System.out.println("Triangulos EQUILATEROS: " + typeListHash.get(Type.EQUILATERO));
		System.out.println("Triangulos ISOSCELES: " + typeListHash.get(Type.ISOSCELES));
		System.out.println("Triangulos ESCALENO: " + typeListHash.get(Type.ESCALENO));
		int maxvalue = Integer.MAX_VALUE;
		Type type = Type.EQUILATERO;
		for(Entry<Type,Integer> l: typeListHash.entrySet()) {
			if(l.getValue() < maxvalue) {
				maxvalue = l.getValue();
				type = l.getKey();
			}
		}
		System.out.println("el menor muneros de triangulos es el: " + type + " con " + maxvalue + " triangulos");
		scan.close();
	}
	private static HashMap<Type,Integer> getValues(Scanner scan,int num){
		HashMap<Type,Integer> typeListHash = new HashMap<Type,Integer>();
		typeListHash.put(Type.EQUILATERO, 0);
		typeListHash.put(Type.ESCALENO, 0);
		typeListHash.put(Type.ISOSCELES, 0);
		for(int i = 0;i <= num; i++) {
			System.out.println("introduce el lado derecho del triangulo");
			int derecha = scan.nextInt();
			System.out.println("introduce el lado inzquierda del triangulo");
			int izquierda = scan.nextInt();
			System.out.println("introduce base");
			int base = scan.nextInt();
			if( ( derecha == izquierda ) && ( izquierda == base ) ) {
				System.out.println("es un triangulo: " + Type.EQUILATERO);
				typeListHash.put(Type.EQUILATERO, typeListHash.get(Type.EQUILATERO) + 1);
			} else if( ( derecha == izquierda ) || ( izquierda == base ) || ( derecha == base ) ) {
				System.out.println("es un triangulo: " + Type.ISOSCELES);
				typeListHash.put(Type.ISOSCELES, typeListHash.get(Type.ISOSCELES) + 1);
			} else if( ( derecha != izquierda ) && ( izquierda != base ) ) {
				System.out.println("es un triangulo: " + Type.ESCALENO);
				typeListHash.put(Type.ESCALENO, typeListHash.get(Type.ESCALENO) + 1);
			}
		}
		return typeListHash;
	}
}
