package net.kristian.javaProject;

import net.kristian.objects.Cuadrante;
import net.kristian.objects.NumScanner;

/**
 * @author krist
 */

public class cinco {

	public static void main(String[] args) {
		int[] numeros = new NumScanner(System.in).get(2,"introduce x: ","introduce y: ");
		
		System.out.println("el quadrante es: " + determinarCuadrante(numeros[0], numeros[1]).name());
		
	}
	public static Cuadrante determinarCuadrante(int x, int y) {
		if(x == 0) {
			System.out.println("x no puede ser 0");
			return Cuadrante.ORIGEN;
		}
		if(y == 0) {
			System.out.println("y no puede ser 0");
			return Cuadrante.ORIGEN;
		}
		
        if (x > 0 && y > 0) {
            return Cuadrante.PRIMER;
        } else if (x < 0 && y > 0) {
            return Cuadrante.SEGUNDO;
        } else if (x < 0 && y < 0) {
            return Cuadrante.TERCER;
        } else if (x > 0 && y < 0) {
            return Cuadrante.QUARTO;
        } else {
            return Cuadrante.ORIGEN;
        }
    }

}
