import java.util.Scanner;

public class Ex05 {

	/*
	 * Realizá un programa que permita ingresar valores del mismo tipo para las
	 * variables ​num1 y num2​. Una vez cargadas, mostrar ambas variables por
	 * pantalla, intercambiá sus valores (que lo cargado en ​num1​ quede en ​num2​,
	 * y viceversa) y volvé a mostrarlas actualizadas.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1; // Variable num1
		int num2; // Variable num2
		int temp; // variable temporal para almacenar info

		System.out.println("Ingrese un valor para num1");
		num1 = input.nextInt(); // Ingreso el valor de num1
		input.nextLine(); // Limpio el buffer

		System.out.println("Ingrese un valor para num2");
		num2 = input.nextInt(); // Ingreso el valor de num2
		input.nextLine(); // Limpio el buffer

		System.out.println("El valor de num1 es " + num1);
		System.out.println("El valor de num2 es " + num2);

		temp = num1; // Estas lineas son
		num1 = num2; // para intercambiar los
		num2 = temp; // valores de num1 y num 2

		System.out.println("Se intercambiaron los valores de num1 y num2");

		System.out.println("El valor de num1 es " + num1);
		System.out.println("El valor de num2 es " + num2);

		input.close(); // Cierro el proceso del Scanner
	}
}