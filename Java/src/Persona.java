import java.util.Objects;

public class Persona {

	private String dniPersona;
	private String nombrePersona;
	private int edadPersona;
	/*
	 * Builder clase persona
	 * Si es menor de edad, exception y no se crea la persona
	 */
	public Persona(String dni, String nombre, int edad) throws Exception{
		if (edad < 18) {
			throw new Exception ("La persona debe ser mayor de edad");
		}
		this.dniPersona = dni;
		this.nombrePersona = nombre;
		this.edadPersona = edad;
	}
	
	
	/*
	 * Geters (Seters no, ya que no serian necesarios en dicha clase)
	 */
	public String getNombrePersona() {
		return nombrePersona;
	}

	public int getEdadPersona() {
		return edadPersona;
	}

	
	public String getDniPersona() {
		return dniPersona;
	}

	/*
	 * HashCode, Equals (Con el dni de persona) y toString
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dniPersona);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dniPersona, other.dniPersona);
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombrePersona + ", dni: " + dniPersona + ", edad: " + edadPersona + ".";
	}
	
	
}
