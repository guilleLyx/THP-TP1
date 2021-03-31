import java.util.Scanner;

public class Ex20 {

	/*
	 * Realizá un programa que permita ingresar dos números enteros y la operación a
	 * realizar (​'+'​, ​'-'​, ​'*'​, ​'/'​). Debe mostrarse el resultado para la
	 * operación ingresada. Considerar que no se puede dividir por cero (en ese caso
	 * mostrar el texto ​'ERROR'​).
	 */
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1; // Numero 1
		int num2; // Numero 2
		char op; // Operador
		int res = 0; // Resultado
		String mens = ""; // Mensaje de error
		boolean err = false; // Error

		System.out.println("Ingrese un numero");
		num1 = input.nextInt();
		input.nextLine();

		System.out.println("Ingrese un numero");
		num2 = input.nextInt();
		input.nextLine();

		System.out.println("Ingrese un operando (+ - * /)");
		op = input.next().charAt(0);
		input.nextLine();

		switch (op) { // Identificando el operando para saber que cuenta hacer
		case '+':
			res = num1 + num2;

			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			err = true;
			break;
		default:
			mens = "Operando erroneo";
		}

		if (err == true) {

			if (num2 == 0) {
				mens = "ERROR";
			} else {
				res = num1 / num2;
			}
		}
		if (mens == "") {
			System.out.println("Resultado: " + res);
		} else {
			System.out.println(mens);
		}

		input.close();
	}

}
