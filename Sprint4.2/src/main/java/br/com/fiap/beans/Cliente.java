package br.com.fiap.beans;

public class Cliente {
	
	private String cpf;
	private String nome;
	private String dt_nasc;
	private String tel_fixo;
	private String tel_celular;
	private String email;
	
	public Cliente() {
		super();
	}

	public Cliente(String cpf, String nome, String dt_nasc, String tel_fixo, String tel_celular, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dt_nasc = dt_nasc;
		this.tel_fixo = tel_fixo;
		this.tel_celular = tel_celular;
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(String dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public String getTel_fixo() {
		return tel_fixo;
	}

	public void setTel_fixo(String tel_fixo) {
		this.tel_fixo = tel_fixo;
	}

	public String getTel_celular() {
		return tel_celular;
	}

	public void setTel_celular(String tel_celular) {
		this.tel_celular = tel_celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
}
