package br.com.fiap.excecoes;

public class Excecao  extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Excecao() {
		super();
		System.out.println("Mensagem de falha");
	}
	
	public Excecao(Exception e) {
		super();
		if (e.getClass().toString().equals("Class java.lang.NumberFormatException")) {
			System.out.println("Digitou letra em vez de numero");
		}else {
			System.out.println("Falha desconhecida");
		}
	}
	
	

}
