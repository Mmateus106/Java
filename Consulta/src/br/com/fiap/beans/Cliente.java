package br.com.fiap.beans;

public class Cliente {
	
	private String nome;
	private String email;
	private int idade;
	private double valor;
	
	public Cliente() {
		super();
	}
	public Cliente(String nome, String email, int idade, double valor) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	

}
