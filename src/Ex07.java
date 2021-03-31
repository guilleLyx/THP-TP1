import java.util.Scanner;

public class Ex07 {

	/*
	 * Realizá un programa que permita ingresar el ancho y el largo de un terreno en
	 * metros y el valor del metro cuadrado de tierra. Debe mostrarse el valor total
	 * del terreno y la cantidad de metros de alambre para cercarlo completamente a
	 * tres alturas distintas.
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int CANT_ALAM = 3; // Cantidad de alambres a diferentes alturas

	public static void main(String[] args) {

		double ancho;// Ancho del terreno
		double largo; // Largo del terreno
		double precioTie; // precio del metro cuadrado de tierra
		double valTerr; // Valor total del terreno
		double alam; // Canitdad de alambre a utilizar

		System.out.println("Ingrese el ancho del terreno");
		ancho = input.nextDouble(); // Ingreso el ancho del terreno
		input.nextLine(); // Limpieza del buffer

		System.out.println("Ingrese el largo del terreno");
		largo = input.nextDouble(); // Ingreso el largo del terreno
		input.nextLine(); // Limpieza del buffer

		System.out.println("Ingrese el precio del metro cuadrado de la tierra");
		precioTie = input.nextDouble(); // Ingreso el precio del metro cuadrado de la tierra
		input.nextLine(); // Limpieza del buffer

		valTerr = ancho * largo * precioTie; // Calculo del valor del terreno

		alam = ancho * largo * 2 * CANT_ALAM;
		/*
		 * Calculo la cantidad a utilizar de alambre, haciendo perimetro x cantidad de
		 * alambres a diferentes alturas
		 */

		System.out.println("El valor del terreno es de $" + valTerr);
		
		System.out.println("La cantidad de alambre necesaria es " + alam + " mts");
		
		input.close();
		
	}
}
