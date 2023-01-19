package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner dogma = new Scanner(System.in);

		int v = 0;

		int i = 0;

		int n = 0;

		System.out.println("Introduzca un valor para v (valor inicial): ");
		v = dogma.nextInt();

		System.out.println("Introduzca un valor para i (incremento): ");
		i = dogma.nextInt();

		System.out.println("Introduzca un valor para p (longitud): ");
		n = dogma.nextInt();

		// creo array tabla de longitud dada por el usuario
		int tabla[] = new int[n];

		// for para recorrer el array tabla
		for (int e = 0; e <= tabla.length - 1; e++) {
			// dando a posicion e valor igual a v
			tabla[e] = v;
			// y luego modifico valor de v añadiendo valor de i a final de iteracion
			v += i;
		}

		// print del array tabla
		System.out.println(Arrays.toString(tabla));

		// cierro escaner
		dogma.close();

	}

}
