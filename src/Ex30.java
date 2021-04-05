import java.util.Scanner;

public class Ex30 {

	/*
	 * Realizá un programa que permita realizar varias operaciones matemáticas
	 * ingresando un caracter por cada una la operación a realizar (‘+’, ‘-’, ‘*’,
	 * ‘/’, ‘F’) y dos números enteros en el caso que no haya elegido ‘F’. La
	 * computadora debe mostrar el resultado para la operación ingresada. Considerar
	 * que no se puede dividir por cero. Cuando la operación ingresada sea ‘F’ nos
	 * indicará que no se desean calcular más operaciones.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		char op;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		boolean div = false;
		String mensOp = "";

		do {

			System.out.println(
					"Ingrese el caracter de operación matematica a utilizar +, -, *, /, o la letra 'F' para terminar");
			op = input.nextLine().toUpperCase().charAt(0);

			if (op != 'F') {

				System.out.println("Ingrese un número entero");
				num1 = input.nextInt();
				input.nextLine();

				System.out.println("Ingrese un número entero");
				num2 = input.nextInt();
				input.nextLine();
				result = 0;

				switch (op) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					div = true;
					break;
				default:
					mensOp = "OP erreoneo";
					break;
				}
				if (div == true) {
					if (num2 == 0) {

						System.out.println("ERROR");
					} else {
						result = num1 / num2;
					}
				}

				if (mensOp != "") {
					System.out.println(mensOp);
				}
				System.out.println(num1 + " " + op + " " + num2 + "" + " = " + result);
			}
		} while (op != 'F');
		System.out.println("No se desean calcular más operaciones");
		input.close();
	}

}
