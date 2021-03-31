import java.util.Scanner;

public class Ex06_V1 {

	/*
	 * Realizá un programa que permita ingresar el monto total de las ventas
	 * realizadas por un vendedor durante el mes, de quien se sabe que gana un
	 * sueldo fijo de 44000 pesos más el 16 por ciento del monto total vendido. Con
	 * tales datos debes calcular y mostrar el importe a cobrar por el vendedor.
	 */

	private static Scanner input = new Scanner(System.in);

	public static final int SUELDO_FIJO = 44000;
	public static final double COM = 0.16; // Porcentaje de la venta que entra en la comison

	public static void main(String[] args) {

		double valVen; // Monto de las ventas del vendedor en un mes
		double sueldoTot; // Sueldo total (Sueldo fijo + comisiones por ventas)

		System.out.println("Ingrese el monto total de las ventas del vendedor");
		valVen = input.nextDouble();
		input.nextLine();

		sueldoTot = SUELDO_FIJO + valVen * COM;

		System.out.println("El importe a cobrar por el vendedor es de $" + sueldoTot);

		input.close(); // Cierro el proceso del Scanner
	}

}