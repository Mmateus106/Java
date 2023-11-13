package br.com.fiap.beans;

public class Bike_modelos {
	
	private int id_modelo;
	private String nome;
	private double valor_aprox;
	
	public Bike_modelos() {
		super();
	}

	public Bike_modelos(int id_modelo, String nome, double valor_aprox) {
		super();
		this.id_modelo = id_modelo;
		this.nome = nome;
		this.valor_aprox = valor_aprox;
	}

	public int getId_modelo() {
		return id_modelo;
	}

	public void setId_modelo(int id_modelo) {
		this.id_modelo = id_modelo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor_aprox() {
		return valor_aprox;
	}

	public void setValor_aprox(double valor_aprox) {
		this.valor_aprox = valor_aprox;
	}
	
	

}
