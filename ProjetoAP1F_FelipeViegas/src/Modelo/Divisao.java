package Modelo;

public class Divisao {
	

	
	private double primeiroNumero;
	private double segundoNumero;
	private double resultado;
	
	public final double getPrimeiroNumero() {
		return primeiroNumero;
	}
	public final void setPrimeiroNumero(double primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}
	public final double getSegundoNumero() {
		return segundoNumero;
	}
	public final void setSegundoNumero(double segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	public final double getResultado() {
		return resultado;
	}
	public final void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public void calculo() {
		double resultado=primeiroNumero/segundoNumero;
		this.setResultado(resultado);
	}
	
	
	

	
}
