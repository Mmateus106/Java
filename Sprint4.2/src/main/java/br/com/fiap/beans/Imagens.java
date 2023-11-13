package br.com.fiap.beans;

public class Imagens {
	
	private int id_img;
	private String img;
	private Vistoria id_vistoria;
	private int id_vistoria1;
	
	public Imagens() {
		super();
	}

	public Imagens(int id_img, String img, Vistoria id_vistoria, int id_vistoria1) {
		super();
		this.id_img = id_img;
		this.img = img;
		this.id_vistoria = id_vistoria;
		this.id_vistoria1 = id_vistoria1;
	}

	public Imagens(int id_img, String img, int id_vistoria1) {
		super();
		this.id_img = id_img;
		this.img = img;
		this.id_vistoria1 = id_vistoria1;
	}

	public int getId_img() {
		return id_img;
	}

	public void setId_img(int id_img) {
		this.id_img = id_img;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Vistoria getId_vistoria() {
		return id_vistoria;
	}

	public void setId_vistoria(Vistoria id_vistoria) {
		this.id_vistoria = id_vistoria;
	}

	public int getId_vistoria1() {
		return id_vistoria1;
	}

	public void setId_vistoria1(int id_vistoria1) {
		this.id_vistoria1 = id_vistoria1;
	}
	
	
	
	
	

}
