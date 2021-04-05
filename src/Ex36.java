import java.util.Scanner;

public class Ex36 {

	/*
	 * Realizá un programa que permita ingresar números mientras el promedio entre
	 * todos los ingresados sea menor a ​20​. Al terminar el ingreso indicar la
	 * cantidad de valores leídos
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int PROMEDIO_MAX = 20;

	public static void main(String[] args) {

		int num;
		int cant = 0;
		int prom;
		int sumDeNum = 0;

		do {
			System.out.println("Ingrese un número");
			num = input.nextInt();
			input.nextLine();

			cant++;
			sumDeNum += num;
			prom = sumDeNum / cant;

		} while (prom < PROMEDIO_MAX);

		System.out.println("La cantidad de valores leidos es de " + cant);

		input.close();

	}

}
