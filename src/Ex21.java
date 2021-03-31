import java.util.Scanner;

public class Ex21 {

	/*
	 * Realizá un programa que permita al usuario ingresar un número entero entre ​1
	 * ​y ​7​. Debe mostrarse por pantalla el nombre del día de la semana que
	 * representa tal número tomando como el primer día de la semana el Domingo. De
	 * ingresar un número fuera de rango debe mostrar error.
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num;
		String dia;

		System.out.println("Ingrese un numero del 1 a 7");
		num = input.nextInt();
		input.nextLine();

		switch (num) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Lunes";
			break;
		case 3:
			dia = "Martes";
			break;
		case 4:
			dia = "Miercoles";
			break;
		case 5:
			dia = "Jueves";
			break;
		case 6:
			dia = "Viernes";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Entrada invalida";

		}
		System.out.println(dia);

	}

}
