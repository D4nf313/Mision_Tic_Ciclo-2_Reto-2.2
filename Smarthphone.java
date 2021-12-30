package Retoexterno2;

public class Smarthphone  extends TelefonoCelular{

private double bateria=8;
private String tonoTimbre= "Silencio";
private String conectividad;
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
public String getConectividad() {
	return conectividad;
}
public void setConectividad(String conectividad) {
	this.conectividad = conectividad;
}
public Smarthphone(String tipo, String numero, String operador, String conectividad) {
	super(tipo, numero, operador);
	this.conectividad = conectividad;
}
public String toString() {
	
	return
	"\tTeléfono Celular Smart Phone en el operador " +getOperador() +"\n"
	 + "\tNúmero Telefónico : " +getNumero()  +"\n"
	 + "\tDuración Máxima Batería: 8 horas"  +"\n"
	 + "\tTono de Timbre: " + getTonoTimbre()  +"\n"
	 + "\tTipo de Sintonizador:" +getConectividad(); 
	
}	

	
	
	
}
