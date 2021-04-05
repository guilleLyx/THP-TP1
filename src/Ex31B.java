import java.util.Scanner;

public class Ex31B {

	/*
	 * Realizá un programa que permita validar una opción ingresada. Se le
	 * preguntará al usuario si desea continuar con alguna operación de la forma
	 * ​"¿Deseás continuar? [S/N]"​. Se espera que el usuario ingrese una ​'S' ​o
	 * una ​'N' ​(incluir las minúsculas). La opción debe ser ingresada tanto como
	 * sea necesario hasta que quede comprendida dentro de las posibilidades
	 * esperadas. Realizá este ejercicio en dos versiones (A y B): con ciclo ​while
	 * ​y con ciclo ​do​-​while​.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		char cont;

		do {
			System.out.println("¿Deseás continuar? [S/N]");
			cont = input.nextLine().toUpperCase().charAt(0);
		} while (cont != 'S' && cont != 'N');

		System.out.println(cont);
		input.close();
	}

}