import java.util.Scanner;

public class Ex38 {

	/*
	 * Realizá un programa que permita controlar con validación el ingreso a un
	 * sitio web. Teniendo ya precargados un nombre de usuario (​"admin"​) y una
	 * contraseña (​"123456"​), el programa debe permitir al usuario ingresar sus
	 * credenciales. Si las mismas son erróneas, se volverán a pedir hasta un máximo
	 * de ​3 intentos. Finalmente, la computadora debe mostrar alguno de los
	 * siguientes mensajes según sea el caso: ​"Acceso concedido" ​o ​"Se ha
	 * bloqueado la cuenta"​.
	 */

	private static Scanner input = new Scanner(System.in);

	private static final String NOMBRE_DE_USUARIO = "admin";
	private static final int CONTRASEÑA = 123456;
	public static final int N_INTENTOS = 3;

	public static void main(String[] args) {

		String userName = ""; //Nombre de usuario ingresado
		int password = 0; // Contraseña ingresada
		int trys = 0; // Intentos

		while ((!NOMBRE_DE_USUARIO.equals(userName) || CONTRASEÑA != password) && trys != N_INTENTOS) {
			System.out.println("Ingrese el nombre de usuario");
			userName = input.nextLine();

			System.out.println("Ingrese la contraseña");
			password = input.nextInt();
			input.nextLine();

			trys++;
		}
		if (userName.equals(NOMBRE_DE_USUARIO) && password == CONTRASEÑA) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Se ha bloqueado la cuenta");
		}
		input.close();
	}

}
