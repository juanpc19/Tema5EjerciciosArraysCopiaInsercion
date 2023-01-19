package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		int tabla[] = new int[20];

		int tablaFinal[] = new int[20];

		int cuentaPares = 0;

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 100);
		}

		// print para comprobar array tabla
		System.out.println(Arrays.toString(tabla));

		// for each recorre array extrayendo cantidad pares
		for (int auxiliar : tabla) {

			if (auxiliar % 2 == 0) {
				cuentaPares++;
			}
		}

		// creo array tablaPar y uso cantidad de pares (contador) para dar longitud a
		// tablaPar
		int tablaPar[] = new int[cuentaPares];

		// creo array tablaImpar y uso tabla.length-cantidad pares (contador) para dar
		// longitud a tablaImpar
		int tablaImpar[] = new int[tabla.length - cuentaPares];

		// for para recorrer el array tabla
		for (int i = 0, posTablaPar = 0, posTablaImpar = 0; i < tabla.length; i++) {

			// si posicion contiene elemento par asignar a array tablaPar
			if (tabla[i] % 2 == 0) {
				tablaPar[posTablaPar] = tabla[i];
				// incremento c para avanzar posicion en caso de que exista otro numero par
				posTablaPar++;

				// si posicion contiene elemento impar asignar a array tablaImpar
			} else {
				tablaImpar[posTablaImpar] = tabla[i];
				// incremento k para avanzar posicion en caso de que exista otro numero impar
				posTablaImpar++;
			}
		}

		// Prints para comprobar arrays tablaPar y tablaPar
		System.out.println(Arrays.toString(tablaPar));
		System.out.println(Arrays.toString(tablaImpar));

		/*
		 * copio el array tablaPar en el array tablaFinal, lo copio en su totalidad
		 * (indicado con tablaPar.length) y lo empiezo a copiar en la posicion 0 del
		 * array tablaFinal
		 */
		System.arraycopy(tablaPar, 0, tablaFinal, 0, tablaPar.length);

		/*
		 * copio el array tablaImpar en el array tablaFinal, lo copio en su totalidad
		 * (indicado con tablaImpar.length) y lo empiezo a copiar en la posicion igual a
		 * valor de variable cuentaPares (cuentaPares seria justo donde acaba el array
		 * tablaPar) del array tablaFinal
		 */
		System.arraycopy(tablaImpar, 0, tablaFinal, cuentaPares, tablaImpar.length);

		// Print final
		System.out.println(Arrays.toString(tablaFinal));

	}

}
