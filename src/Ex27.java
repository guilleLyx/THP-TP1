import java.util.Scanner;

public class Ex27 {
	/*
	 * Realizá un programa que permita ingresar ​5 ​edades. Calcular y mostrar el
	 * promedio de todas las edades ingresadas y cuántas edades fueron valores
	 * impares mayores que ​18.​
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int CANT_EDADES = 5;
	public static final int CONDICION = 18;

	public static void main(String[] args) {

		int edad;
		int sumEdades = 0;
		int cont = 0;

		for (int i = 0; i < CANT_EDADES; i++) {
			System.out.println("Ingrese una edad");
			edad = input.nextInt();
			input.nextLine();
			sumEdades += edad;
			if (edad > CONDICION && edad % 2 == 1) {
				cont++;
			}
		}

		System.out.println("El promedio de todas las edades ingresasdas es: " + (sumEdades / CANT_EDADES));
		System.out.println("La cantidad de edades  impares mayores a 18 es: " + cont++);
		
		input.close();
	}

}
