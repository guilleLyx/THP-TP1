import java.util.Scanner;

public class Ex35 {

	/*
	 * Realizá un programa que permita ingresar nombre y edad de un grupo de
	 * personas (para cada una, nombre y edad). La carga termina cuando en el nombre
	 * de la persona se ingresa un asterisco (​'*'​). Mostrar al final cómo se llama
	 * la persona más joven.
	 */

	private static Scanner input = new Scanner(System.in);

	private static final char FIN = '*'; // En el nombre de la persona termina el ciclo

	public static void main(String[] args) {

		String nombre;
		int edad = 0;
		String nombreJoven = "";
		int edadJoven = 0;

		System.out.println("Ingrese un nombre");
		nombre = input.nextLine();

		if (!nombre.contentEquals(String.valueOf(FIN))) {
			System.out.println("ingrese la edad");
			edad = input.nextInt();
			input.nextLine();

			edadJoven = edad;
			nombreJoven = nombre;

			while (!nombre.contentEquals(String.valueOf(FIN))) {
				System.out.println("Ingrese un nombre");
				nombre = input.nextLine();

				if (!nombre.contentEquals(String.valueOf(FIN))) {
					System.out.println("ingrese la edad");
					edad = input.nextInt();
					input.nextLine();

					if (edadJoven > edad) {
						edadJoven = edad;
						nombreJoven = nombre;
					}
				}
			}
		}
		if (!nombreJoven.equals("")) {
			System.out.println("El nombre del más joven es " + nombreJoven);
		}

		input.close();

	}

}
