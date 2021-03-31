import java.util.Scanner;

public class Ex04_V2 {

	/*
	 * Realizá un programa que permita ingresar el valor monetario de una hora de
	 * trabajo y la cantidad de horas trabajadas por día por un trabajador. Debes
	 * mostrar el valor del salario semanal, sabiendo que trabaja todos los días
	 * hábiles y la mitad de las horas del día hábil los sábados. (Todas las horas
	 * valen lo mismo.)
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int DIAS_HAB = 5; // Cantidad de días habiles trabajados
	public static final double DIAS_SAB = 0.5; // Medio día sabado trabajado

	public static void main(String[] args) {

		double valHor; // Valor monetario de una hora de trabajo
		int horTrab; // Cantidad de horas trabajadas

		System.out.println("Ingrese el valor monetario de una hora de trabajo");
		valHor = input.nextDouble(); // Defino el valor de la hora por teclado
		input.nextLine();// Limpio el buffer

		System.out.println("Ingrese la cantidad de horas trabajadas por día");
		horTrab = input.nextInt(); // Defino la cantidad de horas trabajadas
		input.nextLine();// Limpio el buffer

		System.out.println("El valor del salario semanal es de $" + valHor * horTrab * (DIAS_HAB + DIAS_SAB));

		input.close(); // Cierra el proceso del Scanner
	}

}