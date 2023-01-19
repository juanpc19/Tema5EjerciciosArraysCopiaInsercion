package ejercicios;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {

		int tabla[] = new int[100];

		int tabla2[] = new int[100];

		// for para rellenar array tabla con numeros de 1 a 100 en orden
		for (int i = 0, elemento = 1; i <= tabla.length - 1; i++) {
			tabla[i] = elemento;
			elemento++;
		}

		// for para recorrer array tabla en orden inverso (tabla.length-1 posicion (99),
		// hasta posicion 0)
		// y usando la misma cantidad de iteraciones para recorrer array tabla2 en orden
		// normal (pos 0 hasta tabla.length-1
		for (int i = tabla.length - 1, posTabla2 = 0; i >= 0; i--, posTabla2++) {
			tabla2[posTabla2] = tabla[i];
		}

		// print de array tabla
		System.out.println(Arrays.toString(tabla));

		// print de array tabla2
		System.out.println(Arrays.toString(tabla2));

	}

}
