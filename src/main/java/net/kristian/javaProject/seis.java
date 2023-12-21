package net.kristian.javaProject;

import net.kristian.objects.NumScanner;

/**
 * @author krist
 */

public class seis {

	public static void main(String[] args) {
		int[] numeros = new NumScanner(System.in).get(2,"introdiuce el salario actual: ","introdiuce loa años trabajados: ","");
		
		
		System.out.println("otrogar sueldo de: " + calcularNuevoSalario(numeros[0], (numeros[0] < 500 && numeros[1] >= 10) ? 20:
																					(numeros[0] < 500 && numeros[1] < 10) ? 5:
																					(numeros[0] >= 500) ? numeros[0] : 0));
		
	} 
	public static double calcularNuevoSalario(double salarioActual, double porcentajeAumento) {
        return salarioActual * (1 + porcentajeAumento / 100);
    }

}
