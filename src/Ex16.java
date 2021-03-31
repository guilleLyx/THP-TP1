import java.util.Scanner;

public class Ex16 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int cantAsientos; // Cantidad de asientos disponible
		int cantInscriptos; // Cantidad de Inscriptos
		int disponibilidad; // Disponibilidad de asientos

		System.out.println("Indique la cantidad de inscriptos");
		cantInscriptos = Integer.parseInt(input.nextLine()); // Ingreso la cantidad de inscriptos

		System.out.println("Indique la cantidad de asientos disponibles");
		cantAsientos = Integer.parseInt(input.nextLine()); // Ingreso la cantidad de asientos

		if (cantAsientos >= cantInscriptos) {
			System.out.println("Alcanzan los asientos");
		} else {
			disponibilidad = cantInscriptos - cantAsientos;
			System.out.println("Faltan " + disponibilidad + " asientos");
		}

		input.close();// Cierro Scanner

	}

}