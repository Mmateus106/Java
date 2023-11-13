package br.com.fiap.beans;

public class Bikes {
	
	private String num_serie;
	private double valor;
	private String cor;
	private Bike_modelos id_modelo;
	
	public Bikes() {
		super();
	}

	public Bikes(String num_serie, double valor, String cor, Bike_modelos id_modelo) {
		super();
		this.num_serie = num_serie;
		this.valor = valor;
		this.cor = cor;
		this.id_modelo = id_modelo;
	}

	public Bikes(String num_serie, double valor, String cor) {
		super();
		this.num_serie = num_serie;
		this.valor = valor;
		this.cor = cor;
	}

	public String getNum_serie() {
		return num_serie;
	}

	public void setNum_serie(String num_serie) {
		this.num_serie = num_serie;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Bike_modelos getId_modelo() {
		return id_modelo;
	}

	public void setId_modelo(Bike_modelos id_modelo) {
		this.id_modelo = id_modelo;
	}
	
	
	

}
