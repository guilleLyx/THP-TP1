import java.util.Scanner;

public class Ex12 {

	/*
	 * Realizá un programa que permita ingresar dos números enteros e indique cuál
	 * de ellos es el mayor.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1; // Número 1
		int num2; // Número 2
		String may; // Cual es el mayor
		int aux; // Auxiliar
		String mens; // Mensaje

		System.out.println("Ingrese un número entero");
		num1 = input.nextInt(); // Número 1
		input.nextLine(); // Limpieza de buffer

		System.out.println("Ingrese un número entero");
		num2 = input.nextInt(); // Número 2
		input.nextLine(); // Limpieza de buffer

		may = "El segundo numero (";
		aux = num2;
		mens = ") es el mayor";

		if (num1 > num2) {

			may = "El primer numero (";
			aux = num1;

		} else if (num1 == num2) {

			may = "Ambos números ingresados (";
			mens = ") son inguales, ninguno es mayor";
		}

		System.out.println(may + aux + mens);

		input.close(); // Cierro Scanner

	}
}