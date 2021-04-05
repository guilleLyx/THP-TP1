import java.util.Scanner;

public class Ex32 {

	/*
	 * Realizá un programa que permita validar la nota de un examen de la misma
	 * manera que el ejercicio ​28​ pero con las siguientes nuevas directivas:
	 */
	// ● Las notas 1 y 3 no usan nunca.
	// ● La nota 0 se reserva para los ausentes En resumen, las notas válidas pueden
	// ser un ​2​ ​o un valor entre ​4​ ​y ​10​.

	private static Scanner input = new Scanner(System.in);

	public static final int NOTA_MIN = 4;
	public static final int NOTA_MAX = 10;
	public static final int NOTA_EXTRA = 2;

	public static void main(String[] args) {

		int nota;
		do {
			System.out.println("Ingrese la nota del examen. Recuerde que debe ser entre 4 y 10, ademas del 2");
			nota = input.nextInt();
			input.nextLine();

		} while ((nota < NOTA_MIN || nota > NOTA_MAX) && nota != NOTA_EXTRA);
		System.out.println("La nota, " + nota + ", a sido satisfactoriamente cargada");

		input.close();
	}

}
