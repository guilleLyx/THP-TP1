import java.util.Scanner;

public class Ex34 {

	/*
	 * Realizá un programa que permita ingresar la estatura (en metros con
	 * decimales) de cada jugador de un equipo de baloncesto. La carga finalizará al
	 * ingresar cero. Calcular y mostrar la estatura promedio del equipo.
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int FIN = 0; // Finaliza la carga

	public static void main(String[] args) {

		double alt;
		int cant = 0;
		double altProm = 0;
		double sumDeAlt = 0;

		do {
			System.out.println("Ingrese un número");
			alt = input.nextDouble();
			input.nextLine();

			if (alt != 0) {
				cant++;
				sumDeAlt += alt;
				altProm = sumDeAlt / cant;
			}

		} while (alt != FIN);

		System.out.println("La estatura promedio del equipo es de " + altProm);

		input.close();

	}

}
