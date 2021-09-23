import java.time.LocalDate;

public class Coche extends Vehiculo{

	private Double caballos;
	private LocalDate fechaITV;
	
	//Builder
	public Coche(String marca, String matricula, String numeroSerie,Double numCaballos, String fechaDeITV) {
		super(marca, matricula, numeroSerie);
		this.caballos = numCaballos;
		this.fechaITV = LocalDate.parse(fechaDeITV);
	}

	@Override
	public String toString() {
		return super.toString() + "Coche con " + caballos + " caballos y fecha de ITV: " + fechaITV + ".";
	}

	
}
