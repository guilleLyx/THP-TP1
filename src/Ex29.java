import java.util.Scanner;

public class Ex29 {

	/*
	 * Realizá un programa que permita validar la nota de un examen. Se espera que
	 * la nota que el usuario ingrese sea un número comprendido entre ​0 ​y ​10​. La
	 * misma debe ser ingresada tantas veces como sea necesario hasta que quede
	 * comprendida dentro del rango indicado.
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int NOTA_MIN = 0;
	public static final int NOTA_MAX = 10;

	public static void main(String[] args) {

		int nota;
		do {
			System.out.println("Ingrese la nota del examen. Recuerde que debe ser entre 10 y 0");
			nota = input.nextInt();
			input.nextLine();

		} while (nota <= (NOTA_MIN -1) || nota >= (NOTA_MAX +1) );
		System.out.println("La nota, " + nota + ", a sido satisfactoriamente cargada");

		input.close();
	}

}
