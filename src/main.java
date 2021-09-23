import java.util.Scanner;

public class main {

	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		try {
		String nombreEmpresa = leerString("Introduzca el nombre de la empresa");
		Persona dueño = new Persona(leerString("Ahora añada los datos del dueño.\nDni:"), leerString("Nombre"), leerInt("Edad"));
		Double ganancias = leerDouble("Introduzca las ganancias de la empresa:");
		String Sector = leerString("Introduzca el sector al que pertenece la empresa (AGRICOLA,GANADERO,TECNOLOGICO,MEDICINA):");
		String vehiculo = leerString("Que vehiculo usa la empresa (Coche o Barco):");
		if (vehiculo.toUpperCase().equals("COCHE")){
			Coche coche = new Coche (leerString("Introduzca los datos del coche.\nMarca:"),leerString("Matricula:"),leerString("Numero de serie:"),leerDouble("Numero de caballos:"),leerString("Fecha de ultima ITV (dd/mm/yyyy):"));
		}
		else if (vehiculo.toUpperCase().equals("BARCO")){
			Barco barco = new Barco (leerString("Introduzca los datos del barco.\nMarca:"),leerString("Matricula:"),leerString("Numero de serie:"),leerString("Codigo de Puerto:"));
		}
		
		int numeroTrabajadores = leerInt ("Introduzca el numero de trabajadores que desea añadir a su empresa:");
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	//Metodos estaticos para leer enteros, cadenas y doubles.
	public static int leerInt(String m) {
		System.out.println(m);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static String leerString(String m) {
		System.out.println(m);
		return teclado.nextLine();
	}
	public static double leerDouble(String m) {
		System.out.println(m);
		return Double.parseDouble(teclado.nextLine());
	}
}
