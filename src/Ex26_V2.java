import java.util.Scanner;

public class Ex26_V2 {
	/*
	 * Realizá un programa que permita al usuario ingresar un número natural ​n​. La
	 * computadora debe mostrar los primeros ​n ​múltiplos de ​3 ​excepto aquellos
	 * que sean a la vez múltiplos de 5​.
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int TRES = 3;
	public static final int CINCO = 5;

	public static void main(String[] args) {

		int n;
		int aux;
		int cont;

		System.out.println("Ingrese un numero natural");
		n = input.nextInt();
		input.nextLine();

		for (int i = 1; i <= n; i++) {
			if (i % CINCO != 0) {
				System.out.println(i + " * " + TRES + " = " + (i * TRES));
			}
		}

		input.close();
	}
}
