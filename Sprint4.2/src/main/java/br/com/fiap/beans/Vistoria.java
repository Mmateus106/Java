package br.com.fiap.beans;

public class Vistoria {
	
	private int id_vistoria;
	private int dt_inicio;
	private int dt_fim;
	private String aprov;
	private String obs;
	private Bikes num_serie;
	private Cliente cpf;
	
	//construtor vazio
	public Vistoria() {
		super();
	}

	//construtor cheio
	public Vistoria(int id_vistoria, int dt_inicio, int dt_fim, String aprov, String obs, Bikes num_serie, Cliente cpf) {
		super();
		this.id_vistoria = id_vistoria;
		this.dt_inicio = dt_inicio;
		this.dt_fim = dt_fim;
		this.aprov = aprov;
		this.obs = obs;
		this.num_serie = num_serie;
		this.cpf = cpf;
	}

	//construtor cheio sem atributos de ref
	public Vistoria(int id_vistoria, int dt_inicio, int dt_fim, String aprov) {
		super();
		this.id_vistoria = id_vistoria;
		this.dt_inicio = dt_inicio;
		this.dt_fim = dt_fim;
		this.aprov = aprov;
	}

	public int getId_vistoria() {
		return id_vistoria;
	}

	public void setId_vistoria(int id_vistoria) {
		this.id_vistoria = id_vistoria;
	}

	public int getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(int dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	public int getDt_fim() {
		return dt_fim;
	}

	public void setDt_fim(int dt_fim) {
		this.dt_fim = dt_fim;
	}

	public String getAprov() {
		return aprov;
	}

	public void setAprov(String aprov) {
		this.aprov = aprov;
	}

	public String getObs() {
		return obs;
	}
	
	public void setObs(String obs) {
		this.obs = obs;
	}
	public Bikes getNum_serie() {
		return num_serie;
	}

	public void setNum_serie(Bikes num_serie) {
		this.num_serie = num_serie;
	}

	public Cliente getCpf() {
		return cpf;
	}

	public void setCpf(Cliente cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	

}
