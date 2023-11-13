package br.com.fiap.beans;

public class Videos {
	
	private int id_videos;
	private String video;
	private Vistoria id_vistoria;
	
	public Videos() {
		super();
	}

	public Videos(int id_videos, String video, Vistoria id_vistoria) {
		super();
		this.id_videos = id_videos;
		this.video = video;
		this.id_vistoria = id_vistoria;
	}

	public Videos(int id_videos, String video) {
		super();
		this.id_videos = id_videos;
		this.video = video;
	}

	public int getId_videos() {
		return id_videos;
	}

	public void setId_videos(int id_videos) {
		this.id_videos = id_videos;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public Vistoria getId_vistoria() {
		return id_vistoria;
	}

	public void setId_vistoria(Vistoria id_vistoria) {
		this.id_vistoria = id_vistoria;
	}
	
	

}
