import java.util.HashSet;
import java.util.Objects;


/*
 * Enumerado para restringir los sectores de las empresas que se pueden registrar
 */
enum Sector{
	AGRICOLA,GANADERO,TECNOLOGICO,MEDICINA;
}

public class Empresa implements Impuestos{

	private String nombreEmpresa;
	private Persona dueñoEmpresa;
	private double gananciasAnuales;
	private Sector sectorDeLaEmpresa;
	private HashSet <Persona> trabajadores;
	private Vehiculo vehiculoEmpresa;
	/*
	 * Builder de Empresa
	 */
	public Empresa(String nombre, Persona dueño, double ganancias, String sectorEmpresa) {
		super();
		this.nombreEmpresa = nombre;
		this.dueñoEmpresa = dueño;
		this.gananciasAnuales = ganancias;
		this.sectorDeLaEmpresa = Sector.valueOf(sectorEmpresa.toUpperCase());
		this.trabajadores = new HashSet <Persona> ();
	}
	
	
	
	//Metodos de la interfaz
	
	/*
	 * Metodo de consulta de impuestos
	 * devuelve el porcentaje de impuestos 
	 */
	@Override
	public int consultarImpuestos() {
		return 21;
	}

	/*
	 * Metodo para realizar la reduccion de impuestos de las ganancias totales de la empresa
	 */
	@Override
	public void reduccionImpuestos() {
		this.gananciasAnuales = gananciasAnuales - (gananciasAnuales * 0.21);
	}
		
	/*
	 * Metodo para añadir trabajadores a la empresa
	 */
	public void anadirTrabajadore(Persona trabajador) throws Exception{
		if (trabajador.equals(this.dueñoEmpresa)){
			throw new Exception ("Esta persona ya está registrada como gerente de la empresa");
		}
		this.trabajadores.add(trabajador);
			
	}
	
	
	
	/*
	 * HashCode y Equals con nombre de la empresa como identificador de la clase.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nombreEmpresa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(nombreEmpresa, other.nombreEmpresa);
	}


	/*
	 * ToString
	 */
	@Override
	public String toString() {
		return "Nombre de la empresa: " + nombreEmpresa + ", ganancias anuales: "
				+ gananciasAnuales + ", sector: " + sectorDeLaEmpresa + "\n Datos del dueño: \n" + dueñoEmpresa;
	}
}
