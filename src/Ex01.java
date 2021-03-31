import java.util.Scanner; //Importo esta libreria, para poder utilizar el Scanner que es lo que me dejara escribir

public class Ex01 { // Viene por defecto,(Sin esto no funciona el programa)

	/*
	 * Realizá un programa que permita que el usuario ingrese su nombre. El programa
	 * debe emitir una salida con un mensaje de bienvenida que incluya el nombre
	 * ingresado
	 */
	private static Scanner input = new Scanner(System.in); // Activo el proceso del Scanner (Debe ir antes del public
															// static)

	public static void main(String[] args) { // Viene por defecto, (Sin esto no funciona el programa)

		String nombre; // Declaro variable del tipo String

		System.out.println("Ingrese su nombre"); // Imprimo por pantalla un mensaje
		nombre = input.nextLine(); // Ingreso por teclado el valor de la variable

		System.out.println("Bienvenido " + nombre); // Imprimo por pantalla un mensaje seguido de el valor de variable

		input.close(); // Termino el proceso del Scanner para evitar consumir mucha memoria

	} // Es el corchete de cierre de public class Ex1 {

} // Corchete de cierre de public static void main(String[] args) {