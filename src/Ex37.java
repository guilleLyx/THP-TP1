import java.util.Scanner;

public class Ex37 {
	/*
	 * Realizá un programa que permita al usuario ingresar hasta ​12 valores, de a
	 * uno por vez, que representan los sueldos mensuales que percibió un empleado
	 * durante un año calendario. Si durante la carga de los sueldos mensuales se
	 * detecta un valor negativo, esto indica que aún no se ha cobrado el mes en
	 * curso, y en ese caso se debe dejar de ingresar datos. Al finalizar mostrar el
	 * monto percibido por el empleado hasta ese momento (total o parcial).
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int CANT_MAX_DE_SUELDOS = 12;
	public static final int SUELDO_MIN = 0;

	public static void main(String[] args) {

		double suelMens = 0;
		double montoPercibidoTot = 0;
		int cont = 0;

		do {
			System.out.println("Ingrese un sueldo mensual");
			suelMens = input.nextDouble();
			input.nextLine();
			cont++;

			if (suelMens >= SUELDO_MIN) {
				montoPercibidoTot += suelMens;
			}

		} while (CANT_MAX_DE_SUELDOS > cont && suelMens >= SUELDO_MIN);

		System.out.println("El monto percibido por el empleado es $" + montoPercibidoTot);

		input.close();
	}
}
