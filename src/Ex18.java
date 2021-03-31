import java.util.Scanner;

public class Ex18 {

	/*
	 * Realizá un programa que permita al usuario ingresar dos números enteros. La
	 * computadora debe indicar si el mayor es divisible ​por el menor. (Un número
	 * entero ​a ​es divisible por un número entero ​b ​cuando el ​resto​ de la
	 * división entre ​a​ y ​b​ es ​0
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1;
		int num2;
		int may;
		int men;

		String mens = " no ";

		System.out.println("Ingrese un numero");
		num1 = input.nextInt();
		input.nextLine();

		System.out.println("Ingrese un numero");
		num2 = input.nextInt();
		input.nextLine();

		if (num1 > num2) {
			may = num1;
			men = num2;
			
			}else {
			may = num2;
			men = num1;
			}
		
		if (num1 % num2 == 0) {
			mens = " si ";
		}
		System.out.println("El numero " + num1 + mens + "es divisble por el numero " + num2);
		
		input.close();
		
			
		
		
	}

}
