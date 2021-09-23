
public class Barco extends Vehiculo{

	private String codigoPuerto;
	
	public Barco(String marca, String matricula, String numeroSerie, String codigoDePuerto) {
		super(marca, matricula, numeroSerie);
		this.codigoPuerto = codigoDePuerto;
	}

	@Override
	public String toString() {
		return super.toString() + "Barco con codigo de puerto:" + codigoPuerto + ".";
	}

	
}
