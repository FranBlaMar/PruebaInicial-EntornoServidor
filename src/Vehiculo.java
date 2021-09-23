import java.util.Objects;

public abstract class Vehiculo {
	private String marca;
	private String matricula;
	private String numeroSerie;
	
	//Builder de vehiculo para que lo hereden los hijos
	public Vehiculo(String marca, String matricula, String numeroSerie) {
		this.marca = marca;
		this.matricula = matricula;
		this.numeroSerie = numeroSerie;
	}
	
	//geters
	public String getMarca() {
		return marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}


	//HashCode y equals, con numeroSerie como parametro
	@Override
	public int hashCode() {
		return Objects.hash(numeroSerie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(numeroSerie, other.numeroSerie);
	}

	//ToString
	@Override
	public String toString() {
		return "Vehiculo de marca: " + marca + "con matricula:" + matricula + "y numero de serie: " + numeroSerie;
	}
}
