import java.util.Scanner;

public class Ex13 {

	/*
	 * Realizá un programa para ingresar tres números enteros e indique cuál de
	 * ellos es el mayor y su valor.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		int may;
		String mens1;
		String mens2;

		System.out.println("Ingrese un numero");
		num1 = input.nextInt(); // Ingreso el primer numero
		input.nextLine(); // Limpieza del buffer

		System.out.println("Ingrese un numero");
		num2 = input.nextInt(); // Ingreso el segundo numero
		input.nextLine(); // Limpieza del buffer

		System.out.println("Ingrese un numero");
		num3 = input.nextInt(); // Ingreso el tercer numero
		input.nextLine(); // Limpieza del buffer

		may = num3;

		if (num1 > num2) {

			may = num1;
			mens1 = "EL primer número (";
			mens2 = ") es el mayor";

		} else {

			may = num2;
			mens1 = "EL segundo número (";
			mens2 = ") es el mayor";

		}
		if (num3 > may) {

			may = num3;
			mens1 = "EL tercer número (";
			mens2 = ") es el mayor";

		}

		if (num1 == num2 && num3 == num1) {

			may = num1;
			mens1 = "Los tres numeros (";
			mens2 = ") son iguales.";
		}

		else if (num1 == num2 && num1 != num3) {

			may = num2;
			mens1 = "El primer y segundo número (";
			mens2 = ") son los mayores";

		} else if (num1 == num3) {

			may = num1;
			mens1 = "El primer y tercer número (";
			mens2 = ") son los mayores";

		} else if (num2 == num3) {

			may = num1;
			mens1 = "El segundo y tercer número (";
			mens2 = ") son los mayores";

		}

		System.out.println(mens1 + may + mens2);

		input.close(); // Cierro Scanner

	}

}
