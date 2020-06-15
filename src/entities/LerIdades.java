package entities;

import java.util.ArrayList;
import java.util.List;

public class LerIdades {
	private int idade;
	private String name;
	//private int menorIdade;
	private int soma;

	public LerIdades() {

	}

	public LerIdades(int idade) {
		this.idade = idade;

	}
	

	public LerIdades(int idade, String name) {
		super();
		this.idade = idade;
		this.name = name;
	//	this.menorIdade = menorIdade;
		//this.soma = soma;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	

	public int getSoma() {
		return soma;
	}

	public void setSoma(int idade) {
		this.soma += idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

//	List<LerIdades> list = new ArrayList<>();
//	LerIdades valor= new LerIdades();

	
}
