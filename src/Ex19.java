import java.util.Scanner;

public class Ex19 {

	/*
	 * Existen dos reglas que identifican dos conjuntos de valores: a. El número es
	 * de un solo dígito. b. El número es impar. A partir de estas reglas, realizá
	 * un programa que permita ingresar un número entero. Debe asignar el valor que
	 * corresponda a las variables booleanas ​esDeUnSoloDigito​, ​esImpar​,
	 * estaEnAmbos y ​noEstaEnNinguno el valor ​Verdadero o ​Falso​, según
	 * corresponda, para indicar si el valor número ingresado pertenece o no a cada
	 * conjunto. Definí un lote de prueba de varios números y probá el algoritmo,
	 * escribiendo los resultados tal como se hizo en los ejercicios anteriores.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num; // Numero
		boolean esDeUnSoloDigito;
		boolean esImpar;
		boolean estaEnAmbos;
		boolean noEstaEnNinguno;

		System.out.println("Ingrese un numero");
		num = input.nextInt();
		input.nextLine(); 

		esDeUnSoloDigito = num < 10 && num > -10; // Aparentemente es como un if q tira false o true
		esImpar = num % 2 != 0;
		estaEnAmbos = esDeUnSoloDigito && esImpar;
		noEstaEnNinguno = esDeUnSoloDigito || esImpar;

		System.out.println("esDeUnSoloDigito: " + esDeUnSoloDigito);
		System.out.println("esImpar: " + esImpar);
		System.out.println("estaEnAmbos: " + estaEnAmbos);
		System.out.println("noEstaEnNinguno: " + noEstaEnNinguno);

		input.close();// Cierro Scanner

	}
}
