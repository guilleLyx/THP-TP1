import java.util.Scanner;

public class Ex09_V1 {

	/*
	 * Realizá un programa que permita ingresar dos números que representan las
	 * medidas en grados de dos ángulos interiores de cierto triángulo. A partir de
	 * los valores de estos dos ángulos el programa debe mostrar el valor en grados
	 * del ángulo restante. Recordá que la suma de los ángulos interiores de todo
	 * triángulo es de 180º.
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int SUM_ANG = 180; // La suma de los angulos es 180º

	public static void main(String[] Args) {

		double ang1; // Angulo nº 1 interior del triangulo
		double ang2; // Angulo nº 2 interior del triangulo
		double ang3; // Angulo nº 3 interior del triangulo

		System.out.println("Ingrese el valor de un angulo de un triangulo");
		ang1 = input.nextDouble(); // Ingreso el valor del angulo 1
		input.nextLine(); // Limpio el buffer

		System.out.println("Ingrese el valor de un angulo de un triangulo");
		ang2 = input.nextDouble(); // Ingreso el valor del angulo 2
		input.nextLine(); // Limpio el buffer

		ang3 = SUM_ANG - ang1 - ang2; // Calculo el angulo 3

		System.out.println("El valor del angulo restante es de " + ang3 + "º");

		input.close(); // Cierrro el Scanner
	}

}