package net.kristian.javaProject;

/**
 * @author krist
 */

public class siete {
	public static void main(String[] args) {
		int[] numeros = {12,21,323,25,21};
		
		System.out.print(ObtenerMenor(numeros) + "-");
		System.out.print(ObtenerMayor(numeros));
	}
	private static int ObtenerMayor(int... numeros) {
		int mayor = 0;
		for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
		return mayor;
	}
	
	private static int ObtenerMenor(int... numeros) {
		int menor = 500;
		for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
		return menor;
	}
}
