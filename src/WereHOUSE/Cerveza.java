package WereHOUSE;

public class Cerveza implements Alcoholico{
	private String origen;
	private String cereales;
	private double gradosAlcohol;
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getCereales() {
		return cereales;
	}
	public void setCereales(String cereales) {
		this.cereales = cereales;
	}
	public double getGradosAlcohol() {
		return gradosAlcohol;
	}
	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	@Override
	public boolean esFuerte() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public double calcularTasa() {
		// TODO Auto-generated method stub
		return 0;
	}

}
