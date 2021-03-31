import java.util.Scanner;

public class EX10 {

	/*
	 * Realizá un programa que permita resolver el siguiente problema: Tres personas
	 * aportan diferente capital a una sociedad y desean saber el valor total
	 * aportado y qué porcentaje aportó cada una (indicando nombre y porcentaje).
	 * Solicitar la carga por teclado del nombre de cada socio, su capital aportado
	 * y a partir de esto calcular e informar lo requerido previamente.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] Args) {

		String nom1; // Nombre del socio 1
		String nom2; // Nombre del socio 2
		String nom3; // Nombre del socio 3

		double cap1; // Capital aportado por el socio 1
		double cap2; // Capital aportado por el socio 1
		double cap3; // Capital aportado por el socio 1

		double porApor1; // Porcentaje aportado por el socio 1
		double porApor2; // Porcentaje aportado por el socio 2
		double porApor3; // Porcentaje aportado por el socio 3

		double capTot; // Capital total aportado

		System.out.println("Ingrese el nombre del socio");
		nom1 = input.nextLine(); // Ingreso del nombre del socio 1
		System.out.println("Ingrese el capital aportado por " + nom1);
		cap1 = input.nextDouble(); // Ingreso el capital aportado por el socio 1
		input.nextLine(); // Limpieza de buffer

		System.out.println("Ingrese el nombre del socio");
		nom2 = input.nextLine(); // Ingreso del nombre del socio 2
		System.out.println("Ingrese el capital aportado por " + nom2);
		cap2 = input.nextDouble(); // Ingreso el capital aportado por el socio 2
		input.nextLine(); // Limpieza de buffer

		System.out.println("Ingrese el nombre del socio");
		nom3 = input.nextLine(); // Ingreso del nombre del socio 3
		System.out.println("Ingrese el capital aportado por " + nom3);
		cap3 = input.nextDouble(); // Ingreso el capital aportado por el socio 3
		input.nextLine(); // Limpieza de buffer

		capTot = cap1 + cap2 + cap3;

		porApor1 = cap1 * 100 / capTot; // Calculando los porcentajes
		porApor2 = cap2 * 100 / capTot; // Calculando los porcentajes
		porApor3 = cap3 * 100 / capTot; // Calculando los porcentajes

		System.out.println("El capital total aportado es de $" + capTot);
		System.out.println(nom1 + " aporto " + porApor1 + "%");
		System.out.println(nom2 + " aporto " + porApor2 + "%");
		System.out.println(nom3 + " aporto " + porApor3 + "%");

		input.close(); // Cierro el Scanner
	}

}
