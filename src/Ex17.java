import java.util.Scanner;

public class Ex17 {

	/*
	 * Realizá un programa que permita ingresar una edad (entre ​1 ​y ​120 ​años) y
	 * un género (​'F' para mujeres, ​'M' para hombres). En caso de haber ingresado
	 * valores erróneos (edad fuera de rango o género inválido), informar tal
	 * situación. Si los datos están bien ingresados el programa debe indicar,
	 * sabiendo que las mujeres se jubilan con ​60 años o más y los hombres con ​65​
	 * años o más, si la persona está en edad de jubilarse.
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int EDAD_MIN = 1;
	public static final int EDAD_MAX = 120;
	public static final int EDAD_F = 60;
	public static final int EDAD_M = 65;

	public static void main(String[] args) {

		int edad;
		char gen;
		String mensErr = "";
		String jub = "No";

		System.out.println("Ingrese una edad entre 1 y 120 años");
		edad = Integer.parseInt(input.nextLine());

		if (edad >= EDAD_MIN && edad <= EDAD_MAX) {

			System.out.println("Ingrese un género 'F' para mujer y 'M' para hombre");
			gen = input.nextLine().toUpperCase().charAt(0); // Asi solicito una sola letra, .toUpperCase() es para la
															// mayuscula y charAt(0) indica la posicion del caracter en
															// una palabra

			if (gen == 'M') {
				if (edad >= EDAD_M) {
					jub = "Si";
				}

			} else if (gen == 'F') {
				if (edad >= EDAD_F) {
					jub = "Si";
				}

			} else {
				mensErr = "Valor erreoneo de genero.";
			}

		} else {
			mensErr = "Valor de edad fuera de rango.";
		}

		if (mensErr == "") {
			System.out.println(jub + " esta en edad de jubilarse.");
		} else {
			System.out.println(mensErr);
		}

	}

}