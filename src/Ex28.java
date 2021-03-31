import java.util.Scanner;

public class Ex28 {

	/*
	 * Realizá un programa que a partir de un número entero ​cant ingresado por el
	 * usuario permita cargar por teclado ​cant números enteros. La computadora debe
	 * mostrar cuál fue el mayor número y en qué posición apareció.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int cant;
		int edad;
		int may = 0;
		int posMay = 0;
		int quedan;

		System.out.println("Ingrese la cantidad de numeros a ingresar");
		cant = input.nextInt();
		input.nextLine();

		quedan = cant;

		/*
		 * Consultar por posicion, Arranco de 0 o de 1?
		 */

		for (int i = 1; i <= cant; i++) {
			System.out.println("Ingrese un numero. Numeros restantes por ingresar: " + quedan);
			edad = input.nextInt();
			input.nextLine();
			quedan--;

			if (may < edad) {
				may = edad;
				posMay = i;
			}
		}
		System.out.println(may);
		System.out.println(posMay);
		
		input.close();

	}

}
