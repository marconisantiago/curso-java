package entities;

public class Intervalos {

	private int numero;
	
	//public Intervalos() {
		
	//}

	public Intervalos(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "" + numero;
	}
	
	
}
