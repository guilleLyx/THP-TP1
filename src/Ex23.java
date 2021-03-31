import java.util.Scanner;

public class Ex23 {

	/*
	 * Realizá un programa que permita ingresar un número entero ​n​. Debe mostrar
	 * los primeros 10 múltiplos de ​n​ (desde 1 x ​n​)
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int PRIM_10_MULT = 10;

	public static void main(String[] args) {

		int n;

		System.out.println("Ingrese un numero entero");
		n = input.nextInt();
		input.nextLine();

		System.out.println("Los primeros " + PRIM_10_MULT + " multiplos del numero ingresado son:");

		for (int i = 1; i <= PRIM_10_MULT; i++) {
			System.out.println("* " + i * n);
		}

		input.close();

	}

}
