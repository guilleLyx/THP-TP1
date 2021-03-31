import java.util.Scanner; //Importo libreria para utilizar el Scanner

public class Ex02_V1 { // Viene por defecto,(Sin esto no funciona el programa)

	/*
	 * Realizá un programa que permita ingresar 3 notas pertenecientes a tres
	 * trimestres distintos para cierto alumno de nivel secundario. Debe calcularse
	 * y mostrarse la nota promedio.
	 */

	private static Scanner input = new Scanner(System.in);// Activo el proceso del Scanner (Debe ir antes del public
															// static)

	public static void main(String[] args) { // Viene por defecto, (Sin esto no funciona el programa)

		int nota1; // Declaro variable del tipo Integer
		int nota2; // Declaro variable del tipo Integer
		int nota3; // Declaro variable del tipo Integer

		System.out.println("Ingrese la nota del primer trimestre"); // Imprimo por pantalle un mensaje
		nota2 = input.nextInt(); // Ingreso por teclado el valor de la variable
		input.nextLine(); // Limpio el buffer

		System.out.println("Ingrese la nota del segundo trimestre"); // Imprimo por pantalle un mensaje
		nota1 = input.nextInt(); // Ingreso por teclado el valor de la variable
		input.nextLine(); // Limpio el buffer

		System.out.println("Ingrese la nota del tercer trimestre"); // Imprimo por pantalle un mensaje
		nota3 = input.nextInt(); // Ingreso por teclado el valor de la variable
		input.nextLine(); // Limpio el buffer

		System.out.println("La nota promedio de las tres notas es " + (nota1 + nota2 + nota3) / 3);
		/* Imprimo un mensaje y muestro el esultado de una cuenta */

		input.close(); // Termino el procesod del Scanner

	}

}