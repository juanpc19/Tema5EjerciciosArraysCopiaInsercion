package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int tablaEnteros[] = new int[10];

		// creo array con 0 posiciones para añadir las necesarias posteriormente
		int tablaCopia[] = new int[0];

		Scanner dogma = new Scanner(System.in);

		// for para rellenar array con numeros por teclado
		for (int i = 0; i <= tablaEnteros.length - 1; i++) {
			System.out.println("Introduzca un numero: ");
			tablaEnteros[i] = dogma.nextInt();
		}

		// sort para ordenar para busqueda binaria
		Arrays.sort(tablaEnteros);

		// for para recorrer posiciones del array tablaEnteros
		for (int i = 0, posTablaCopia = 0; i <= tablaEnteros.length - 1; i++) {

			// hago busqueda binaria de posicion i de array tablaEnteros en array tablaCopia
			int posicion = Arrays.binarySearch(tablaCopia, tablaEnteros[i]);

			// si la posicion devuelta es menor a 0 significa que no ha sido encontrado en
			// el array
			if (posicion < 0) {

				// en cuyo caso creo una nueva posicion en el array tablaCopia
				tablaCopia = Arrays.copyOf(tablaCopia, tablaCopia.length + 1);

				// para insertar en ella el elemento contenido en posicion i de tablaEnteros
				tablaCopia[posTablaCopia] = tablaEnteros[i];

				// e incremento en 1 el valor de posTablaCopia
				posTablaCopia++;
			}

		}

		// print de array tablaEnteros
		System.out.println(Arrays.toString(tablaEnteros));

		// print de array tablaCopia
		System.out.println(Arrays.toString(tablaCopia));

		// cierro escaner
		dogma.close();
	}

}
