import java.util.Scanner; //Importo libreria del Scanner para que funcione

public class Ex14 {

	/*
	 * Para entrar a la montaña rusa ​Infierno en las alturas se requiere tener al
	 * menos ​7 años y medir más de ​1,50 metros. Completá el siguiente cuadro a
	 * mano según los requisitos y luego haz el programa que permita, según las
	 * edades y estaturas ingresadas por el usuario, obtener los mismos resultados
	 * según los siguientes datos:
	 * 
	 *	Nombre Edad Altura ¿Entra al juego ?(V/F)
	 *	Juan 	5 	1.45			F
	 *	María 	7 	1.23			F
	 *	Luis 	8 	1.51			V
	 *	Ana 	9	1.39			F
	 */

	private static Scanner input = new Scanner(System.in); // Activo el Scanner

	public static final String NOMBRE1 = "Juan"; // Defino constante del tipo String
	public static final String NOMBRE2 = "María"; // Defino constante del tipo String
	public static final String NOMBRE3 = "Luis"; // Defino constante del tipo String
	public static final String NOMBRE4 = "Ana"; // Defino constante del tipo String
	public static final int EDAD_MIN = 7; // Defino constante del tipo Integer
	public static final double ALTURA_MIN = 1.50; // Defino constante del tipo Double

	public static void main(String[] args) {

		int edad1; // Declaro variable del tipo int
		int edad2; // Declaro variable del tipo int
		int edad3; // Declaro variable del tipo int
		int edad4; // Declaro variable del tipo int
		double altura1; // Declaro variable del tipo double
		double altura2; // Declaro variable del tipo double
		double altura3; // Declaro variable del tipo double
		double altura4; // Declaro variable del tipo double
		
		System.out.println("Ingrese la edad de " + NOMBRE1 + " en años"); // Imprimo por pantalla
		edad1 = input.nextInt(); // Defino variable por teclado
		input.nextLine(); // Limpio el buffer
		System.out.println("Ingrese la altura de " + NOMBRE1 + " en metros"); // Imprimo por pantalla
		altura1 = input.nextDouble(); // Defino variable por teclado
		input.nextLine(); // Limpio el buffer

		System.out.println("Ingrese la edad de " + NOMBRE2 + " en años");
		edad2 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese la altura de " + NOMBRE2 + " en metros");
		altura2 = input.nextDouble();
		input.nextLine();

		System.out.println("Ingrese la edad de " + NOMBRE3 + " en años");
		edad3 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese la altura de " + NOMBRE3 + " en metros");
		altura3 = input.nextDouble();
		input.nextLine();

		System.out.println("Ingrese la edad de " + NOMBRE4 + " en años");
		edad4 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese la altura de " + NOMBRE4 + " en metros");
		altura4 = input.nextDouble();
		input.nextLine();

		if (edad1 >= EDAD_MIN && altura1 > ALTURA_MIN) {
			System.out.println(NOMBRE1 + " Entra");
		} else {
			System.out.println(NOMBRE1 + " No entra");
		}

		if (edad2 >= EDAD_MIN && altura2 > ALTURA_MIN) {
			System.out.println(NOMBRE2 + " Entra");
		} else {
			System.out.println(NOMBRE2 + " No entra");
		}

		if (edad3 >= EDAD_MIN && altura3 > ALTURA_MIN) {
			System.out.println(NOMBRE3 + " Entra");
		} else {
			System.out.println(NOMBRE3 + " No entra");
		}

		if (edad4 >= EDAD_MIN && altura4 > ALTURA_MIN) {
			System.out.println(NOMBRE4 + " Entra");
		} else {
			System.out.println(NOMBRE4 + " No entra");
		}

		input.close();

	}

}