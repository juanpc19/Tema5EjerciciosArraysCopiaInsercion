package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int tabla[] = new int[10];

		// creo el array tablaCopia con una posicion mas para la primera insercion del
		// switch
		int tablaCopia[] = new int[tabla.length + 1];

		String seleccion = "";

		Scanner dogma = new Scanner(System.in);

		int v = 0;

		int p = 0;

		// for para rellenar array tabla con numeros random
		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 10);
		}

		// ejecuto el switch una vez con do que evaluara a la variable seleccion
		// ejecutando el case correspondiente
		do {

			System.out
					.println("Seleccione una opcion del menu: \na. Mostrar valores. \nb. Introducir valor.\nc. Salir.");

			seleccion = dogma.next();

			// switch que evaluara a seleccion
			switch (seleccion) {

			// print de array tabla en caso "a"
			case "a" -> {
				System.out.println(Arrays.toString(tabla));
			}

			// peticion de valores para variables v y p al usuario en caso "b"
			case "b" -> {

				System.out.println("Introduzca un valor para v (valor): ");
				v = dogma.nextInt();

				System.out.println("Introduzca un valor para p (posicion): ");
				p = dogma.nextInt();

				// copia de array tabla desde posicion 0 en array tablaCopia desde posicion 0,
				// cantidad de elementos a copiar igual a p
				// lo que copiara el array tabla en el array tablaCopia desde la posicion 0
				// hasta la posicion en la que el usuario quiere insertar el nuevo valor (p)
				System.arraycopy(tabla, 0, tablaCopia, 0, p);

				// copia de array tabla desde posicion p en array tablaCopia desde posicion p+1,
				// cantidad de elementos a copiar igual a tabla.length - p
				// lo que copiara el array tabla desde p en el array tablaCopia
				// desde la posicion siguiente a la que el usuario quiere insertar el nuevo
				// valor
				// rellenando el array tablaCopia hasta la ultima posicion
				// dejando el hueco para la insercion libre
				System.arraycopy(tabla, p, tablaCopia, p + 1, tabla.length - p);

				// inserto el nuevo valor del usuario en la posicion libre
				tablaCopia[p] = v;

				// sobreescribo tabla con tablaCopia para que el print de case "a" del switch
				// refleje los cambios
				tabla = tablaCopia;

				// aumento en 1 la longitud del array tablaCopia en caso de necesitarlo en otra
				// iteracion
				tablaCopia = Arrays.copyOf(tablaCopia, tablaCopia.length + 1);

			}

			}

			// Establezco condicion mientras que seleccion sea igual a "a" o igual a "b"
			// que de cumplirse mantendra el bucle en ejecucion
		} while (seleccion.equals("a") || seleccion.equals("b"));

		// cierro escaner
		dogma.close();
	}

}
