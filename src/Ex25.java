import java.util.Scanner;

public class Ex25 {

	/*
	 * Realizá un programa que permita ingresar dos números enteros que representen
	 * el ancho y el alto de una matriz de cruces. El programa debe dibujar dicha
	 * matriz.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1;
		int num2;
		int aux;

		System.out.println("Ingrese un numero que represente el ancho de la matriz");
		num1 = input.nextInt();
		input.nextLine();

		System.out.println("Ingrese un numero que represente el alto de la matriz");
		num2 = input.nextInt();
		input.nextLine();

		while (num2 > 0) {

			aux = num1;

			while (aux > 0) {
				System.out.printf("X ");
				aux--;
			}
			System.out.println("");
			num2--;
		}
		input.close();
	}
}

/*
 * 
 */
