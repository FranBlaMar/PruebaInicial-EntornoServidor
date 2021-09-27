import java.util.Scanner;

public class main {

	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		try {
		/*
		 * Obtencion de datos para crear empresa
		 */
		String nombreEmpresa = leerString("Introduzca el nombre de la empresa");
		/*
		 * Creacion de la persona Dueña de la empresa
		 */
		Persona dueño = new Persona(leerString("Ahora añada los datos del dueño.\nDni:"), leerString("Nombre"), leerInt("Edad"));
		Double ganancias = leerDouble("Introduzca las ganancias de la empresa:");
		String sector = leerString("Introduzca el sector al que pertenece la empresa (AGRICOLA,GANADERO,TECNOLOGICO,MEDICINA):");
		String vehiculo = leerString("Que vehiculo usa la empresa (Coche o Barco):");
		
		/*
		 * si el vehiculo es Coche usamos el constructor de coche y terminamos de crear la empresa
		 */
		if (vehiculo.toUpperCase().equals("COCHE")){
			Coche coche = new Coche (leerString("Introduzca los datos del coche.\nMarca:"),leerString("Matricula:"),leerString("Numero de serie:"),leerDouble("Numero de caballos:"),leerString("Fecha de ultima ITV (yyyy-mm-dd):"));
			Empresa emp = new Empresa (nombreEmpresa,dueño,ganancias,sector,coche);
			int numeroTrabajadores = leerInt ("Introduzca el numero de trabajadores que desea añadir a su empresa:");
			for (int i = 0; i<numeroTrabajadores; i++ ) {
				emp.anadirTrabajadores(new Persona(leerString("Introduzca los datos del trabajador.\nDni:"), leerString("Nombre"), leerInt("Edad")));
			}
			System.out.println(emp);
		}
		/*
		 * si el vehiculo es barco usamos el constructor de barco y terminamos de crear la empresa
		 */
		else if (vehiculo.toUpperCase().equals("BARCO")){
			Barco barco = new Barco (leerString("Introduzca los datos del barco.\nMarca:"),leerString("Matricula:"),leerString("Numero de serie:"),leerString("Codigo de Puerto:"));
			Empresa emp = new Empresa (nombreEmpresa,dueño,ganancias,sector,barco);
			int numeroTrabajadores = leerInt ("Introduzca el numero de trabajadores que desea añadir a su empresa:");
			for (int i = 0; i<numeroTrabajadores; i++ ) {
				emp.anadirTrabajadores(new Persona(leerString("Introduzca los datos del trabajador.\nDni:"), leerString("Nombre"), leerInt("Edad")));
			}
			System.out.println(emp);
		}
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


	/*
	 * Metodos estaticos para leer enteros, cadenas y doubles.
	 */
	public static int leerInt(String m) {
		System.out.println(m);
		return Integer.parseInt(teclado.nextLine());
	}
	public static String leerString(String m) {
		System.out.println(m);
		return teclado.nextLine();
	}
	public static Double leerDouble(String m) {
		System.out.println(m);
		return Double.parseDouble(teclado.nextLine());
	}
}
