import java.util.Scanner;//Importo libreria para utilizar el Scanner

public class Ex03_V2 { // Viene por defecto,(Sin esto no funciona el programa)

	/*
	 * Realizá un programa que permita ingresar un número entero. Debe mostrarse el
	 * número ingresado: a. Multiplicado por 5. b. Dividido por 2.
	 */

	public static final int MULT = 5; // Defino constante del tipo Integer
	public static final double DIV = 2; // Defino constante del tipo Double

	private static Scanner input = new Scanner(System.in); // Activo el proceso del Scanner (Debe ir antes del public
															// static)

	public static void main(String[] args) { // Viene por defecto, (Sin esto no funciona el programa)

		int num; // Declaro variable del tipo Integer
		int resMult; // Declaro variable del tipo Integer
		double resDiv; // Declaro variable del tipo Double

		System.out.println("Ingrese un número entero");// Imprimo por pantalle un mensaje
		num = input.nextInt(); // Ingreso por teclado el valor de la variable
		input.nextLine(); // Limpio el buffer

		resMult = num * MULT; // Defino el valor de la variable a traves de una cuenta
		resDiv = num / DIV; // Defino el valor de la variable a traves de una cuenta

		System.out
				.println("El número ingrasado, " + num + ", multiplicado por " + MULT + " es igual a " + resMult + ".");
		/* Imprimo por pantalle un mensaje */
		System.out.println("El número ingrasado, " + num + ", dividido por " + DIV + " es igual a " + resDiv + " .");
		/* Imprimo por pantalle un mensaje */

		input.close(); // Termino el proceso del Scanner
	}

}
