package br.com.fiap.beans;

public class Produto {
	
	//Visibilidade, tipo de dado, variavel
	private String tipo;
	private String marca;
	private int quantidade;
	private double valor;
	
	//Construtor vazio
	public Produto() {
		super();
	}
	
	//Construtor cheio
	public Produto(String tipo, String marca, int quantidade, double valor) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
