import java.util.Scanner;

public class Ex33 {

	/*
	 * Realizá un programa que permita al usuario ingresar números hasta que se
	 * introduzca un ​0​. La computadora debe mostrar el número máximo y el número
	 * mínimo.
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int FIN = 0;

	public static void main(String[] args) {

		int num;
		int numMax;
		int numMin;

		System.out.println("Ingrese un número");
		num = input.nextInt();
		input.nextLine();

		if (num != 0) {
			numMax = num;
			numMin = num;

			do {
				System.out.println("Ingrese un número");
				num = input.nextInt();
				input.nextLine();

				if (num != 0) {
					if (num > numMax) {
						numMax = num;
					} else if (num < numMin) {
						numMin = num;
					}
				}

			} while (num != 0);

			System.out.println("El numero más grande ingresado fue " + numMax);
			System.out.println("El numero más chico ingresado fue " + numMin);

			input.close();
		}

	}

}
