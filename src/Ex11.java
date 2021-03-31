import java.util.Scanner; //Importo la libreria del Scanner para poder utilizarlo

public class Ex11 {

	/*
	 * Realizá un programa que permita ingresar un número entero e indique si se
	 * trata de un número par o impar.
	 */

	private static Scanner input = new Scanner(System.in); // Activo el Scanner

	public static void main(String[] args) {

		int num; // Númer
		String par; // Paridad

		System.out.println("Ingrese un número"); // Imprimo por panatalla un mensaje
		num = input.nextInt(); // Ingreso el número
		input.nextLine(); //// Limpiao el buffer

		par = "impar"; // Defino el valor de la variable paridad

		if (num % 2 == 0) { // Defino el condicional if, en si es verdadero q un número dividido 2 tiene
							// como resto 0
			par = "par"; // Si es verdadero la variable paridad toma el valor par
		}
		System.out.println("El número ingresado " + num + " es " + par);

		input.close(); // Cierro el proceso del Scanner
	}

}