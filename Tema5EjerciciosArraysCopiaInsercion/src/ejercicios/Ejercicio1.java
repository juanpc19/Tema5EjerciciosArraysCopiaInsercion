package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int tabla[] = new int[15];

		int tabla2[] = new int[15];

		Scanner dogma = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {

			System.out.println("Introduzca un numero: ");

			tabla[i] = dogma.nextInt();
		}

		// copia el array avanzandolo una posicion con excepcion de la ultima posicion
		System.arraycopy(tabla, 0, tabla2, 1, tabla.length - 1);

		// que la copio a mano
		tabla2[0] = tabla[tabla.length - 1];

		System.out.println(Arrays.toString(tabla2));

		dogma.close();

	}

}
