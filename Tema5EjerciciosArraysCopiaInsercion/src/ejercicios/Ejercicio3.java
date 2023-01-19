package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	// funcion para comprobar si es primo (tema 4 funciones ej 6)
	static boolean esPrimo(int n) {

		boolean esPrimo = true;

		if ((n == 1) || (n == 0)) {
			esPrimo = false;

		} else {

			for (int i = 2; i < n; i++) {

				if (n % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}

		return esPrimo;
	}

	public static void main(String[] args) {

		int tabla[] = new int[10];

		int tablaFinal[] = new int[10];

		Scanner dogma = new Scanner(System.in);

		// for para rellenar array con numeros por teclado
		for (int i = 0; i <= tabla.length - 1; i++) {
			System.out.println("Introduzca un numero: ");
			tabla[i] = dogma.nextInt();
		}

		// for para recorrer posiciones del array
		for (int i = 0, e = 0, c = tablaFinal.length - 1; i <= tabla.length - 1; i++) {

			// uso funcion para combrobar si es primo
			if (esPrimo(tabla[i])) {
				// de serlo asigno elemento de posicion i de array tabla a posicion e de array
				// tablaFinal
				tablaFinal[e] = tabla[i];
				e++;

			} else {
				// de no serlo asigno elemento de posicion i de array tabla a posicion c de
				// array tablaFinal
				tablaFinal[c] = tabla[i];
				c--;
			}
		}

		// print del array tablaFinal
		System.out.println(Arrays.toString(tablaFinal));

		dogma.close();
	}

}
