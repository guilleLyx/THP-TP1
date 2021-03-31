import java.util.Scanner; //Importo libreria para utilizar el Scanner

public class Ex03_V1 { // Viene por defecto,(Sin esto no funciona el programa)

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

		System.out.println("Ingrese un número entero"); // Imprimo por pantalle un mensaje
		num = input.nextInt(); // Ingreso por teclado el valor de la variable
		input.nextLine(); // Limpio el buffer

		System.out.println(
				"El número ingrasado, " + num + ", multiplicado por " + MULT + " es igual a " + num * MULT + ".");
		/*
		 * Imprime mensaje por pantalla, realiza una cuenta y luego la muestra por
		 * pantalla
		 */
		System.out.println("El número ingrasado, " + num + ", dividido por " + DIV + " es igual a " + num / DIV + ".");
		/*
		 * Imprime mensaje por pantalla, realiza una cuenta y luego la muestra por
		 * pantalla
		 */

		input.close(); // Termino el proceso del Scanner

	}

}