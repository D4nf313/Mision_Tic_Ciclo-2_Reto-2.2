package Retoexterno2;

public class Flecha extends TelefonoCelular {
	private double bateria = 96;
	private String tonoTimbre = "Todero";
	private String radio;

	public double getBateria() {
		return bateria;
	}

	public void setBateria(double bateria) {
		this.bateria = bateria;
	}

	public String getTonoTimbre() {
		return tonoTimbre;
	}

	public void setTonoTimbre(String tonoTimbre) {
		this.tonoTimbre = tonoTimbre;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public Flecha(String tipo, String numero, String operador, String radio) {
		super(tipo, numero, operador);
		this.radio = radio;
	}

	@Override
	public String toString() {
	
		return
		"\tTel�fono Celular Flecha en el operador " +getOperador()  +"\n"
		 + "\tN�mero Telef�nico : " +getNumero()   +"\n"
		 + "\tDuraci�n M�xima Bater�a: 96 horas"  +"\n"
		 + "\tTono de Timbre: " + getTonoTimbre()  +"\n"
		 + "\tTipo de Sintonizador:" +getRadio();
		
	}	







}
