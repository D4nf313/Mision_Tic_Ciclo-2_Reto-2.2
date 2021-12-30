package Retoexterno2;

public class TelefonoCelular {
	private String tipo;
	private String numero;
	private String operador;
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public TelefonoCelular(String tipo, String numero, String operador) {
		super();
		this.tipo = tipo;
		this.numero = numero;
		this.operador = operador;
	}

	

	
}
