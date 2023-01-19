package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int tablaEnteros[] = new int[10];

		int cuentaPares = 0;

		Scanner dogma = new Scanner(System.in);

		for (int i = 0; i <= tablaEnteros.length - 1; i++) {
			System.out.println("Introduzca un numero: ");
			tablaEnteros[i] = dogma.nextInt();

		}

		// for each recorre array tablaEnteros extrayendo cantidad pares
		for (int auxiliar : tablaEnteros) {

			if (auxiliar % 2 == 0) {
				cuentaPares++;
			}
		}

		// creo array tablaPar y uso cantidad de pares (cuentaPares) para dar longitud a
		// numPares
		int numPares[] = new int[cuentaPares];

		// creo array tablaImpar y uso tabla.length-cantidad pares (cuentaPares) para
		// dar longitud a numImpares
		int numImpares[] = new int[tablaEnteros.length - cuentaPares];

		// for para recorrer el array tablaEnteros
		for (int i = 0, posNumPar = 0, posNumImpar = 0; i < tablaEnteros.length; i++) {

			// si posicion contiene elemento par asignar a array numPares
			if (tablaEnteros[i] % 2 == 0) {
				numPares[posNumPar] = tablaEnteros[i];
				// incremento posNumPar para avanzar posicion en caso de que exista otro numero
				// par
				posNumPar++;

				// si posicion contiene elemento impar asignar a array numImpares
			} else {
				numImpares[posNumImpar] = tablaEnteros[i];
				// incremento posNumImpar para avanzar posicion en caso de que exista otro
				// numero impar
				posNumImpar++;
			}
		}

		// prints de los arrays numPares y numImpares
		System.out.println(Arrays.toString(numPares));

		System.out.println(Arrays.toString(numImpares));

		dogma.close();
	}

}
