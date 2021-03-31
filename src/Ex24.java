import java.util.Scanner;

public class Ex24 {

	/*
	 * Realizá un programa que permita al usuario ingresar dos números enteros ​num1
	 * ​y ​num2​, donde el primero siempre deberá ser menor o igual al segundo. La
	 * computadora debe mostrar la secuencia de números existentes entre ambos: a.
	 * Incluyéndolos; b. Excluyéndolos.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1;
		int num2;

		System.out.println("Ingrese un numero");
		num1 = input.nextInt();
		input.nextLine();

		System.out.println("Ingrese un numero, debe ser mayor o igual al anterior");
		num2 = input.nextInt();
		input.nextLine();

		while (num1 > num2) {
			System.out.println("Los numeros ingresados son incorrectos");
			System.out.println("El primer numero debe ser menor o igual al segundo");

			System.out.println("Vuelva a ingresar un numero");
			num1 = input.nextInt();
			input.nextLine();

			System.out.println("Ingrese un numero, debe ser mayor al anterior");
			num2 = input.nextInt();
			input.nextLine();
		}

		System.out.println("******Incluyendolos******");

		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}

		System.out.println("******Excluyendolos******");
		for (int i = (num1 + 1); i < num2; i++) {
			System.out.println(i);
		}

		input.close();

	}

}
