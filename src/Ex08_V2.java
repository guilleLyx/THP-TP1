import java.util.Scanner;

public class Ex08_V2 {

	/*
	 * Realizá un programa que permita ingresar dos números naturales. Debes mostrar
	 * los resultados para las 4 operaciones matemáticas básicas con los números
	 * ingresados
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1; // Número natural 1
		int num2; // Número natural 2

		System.out.println("Ingrese un numero natural");
		num1 = input.nextInt(); // Ingreso el valor de num1
		input.nextLine(); // Limpieza del buffer

		System.out.println("Ingrese un numero natural");
		num2 = input.nextInt(); // Ingreso el valor de num2
		input.hasNextLine(); // Limpieza de buffer

		double num2d = num2; // num2 en double

		System.out.println("El resultado de la suma de num1 y num2 es " + (num1 + num2));
		System.out.println("El resultado de la resta de num1 y num2 es " + (num1 - num2));
		System.out.println("El resultado de la multiplicación de num1 y num2 es " + (num1 * num2));
		System.out.println("El resultado de la division de num1 y num2 es " + (num1 / num2d));

		input.close();

	}

}