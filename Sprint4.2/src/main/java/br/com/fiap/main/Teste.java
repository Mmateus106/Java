package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Bike_modelos;
import br.com.fiap.beans.Bikes;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Imagens;
import br.com.fiap.beans.Videos;
import br.com.fiap.beans.Vistoria;

public class Teste {
	
	//metodo static
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		//Criando a lista "listaBikes"
		List<Bikes> listaBikes = new ArrayList<Bikes>();
		
		//Instanciar objetos
		
		Vistoria objVistoria = null;
		Cliente objCliente = null;
		Bikes objBikes = null;
		Bike_modelos objBike_modelos = null;
		Imagens objImagens = null;
		Videos objVideos = null;
		
		
		//Entrada dos objetos dentro do DO WHILE
		do {
			objVistoria = new Vistoria();
			objVistoria.setId_vistoria(inteiro("Digite o id da vistoria"));
			objVistoria.setDt_inicio(inteiro("Informe a data de inicio da vistoria"));
			objVistoria.setDt_fim(inteiro("Informe a data do fim da vistoria"));
			objVistoria.setAprov(texto("Informe se a vistoria foi aprovada"));
			objVistoria.setObs(texto("Informe alguma observacao sobre a vistoria"));
			
			objBikes = new Bikes();
			objBikes.setNum_serie(texto("Digite o numero de serie"));
			objBikes.setCor(texto("Digite a cor da bike"));
			objBikes.setValor(real("Digite o valor da bike"));
			
			objBike_modelos = new Bike_modelos();
			objBike_modelos.setId_modelo(inteiro("Digite o id de modelo da bike"));
			objBike_modelos.setNome(texto("Digite o nome do modelo da bike"));
			objBike_modelos.setValor_aprox(real("Digite o valor aproximado"));
			
			// Entrada usada para implementar o Insert
			objCliente = new Cliente();
			objCliente.setCpf(texto("Informe o seu cpf"));
			objCliente.setNome(texto("Informe seu nome completo"));
			objCliente.setDt_nasc(texto("Informe sua data de nascimento"));
			objCliente.setTel_fixo(texto("Informe seu telefone fixo"));
			objCliente.setTel_celular(texto("Informe seu numero de celular"));
			objCliente.setEmail(texto("Informe seu email"));
			
			objImagens = new Imagens();
			objImagens.setId_img(inteiro("Informe o id da imagem"));
			objImagens.setImg(texto("Envie a imagem"));
			objImagens.setId_vistoria1(inteiro("Digite o id da vistoria1"));
			
			objVideos = new Videos();
			objVideos.setId_videos(inteiro("Informe o id dos videos"));
			objVideos.setVideo(texto("Envie os videos"));
			
			listaBikes.add(objBikes);
			
			
		} while (  JOptionPane.showConfirmDialog(null, "Adicionar mais bikes?" ,
				"Cadastro de bikes", JOptionPane.YES_NO_OPTION , 
				JOptionPane.QUESTION_MESSAGE ) ==0);
		
		 for (Bikes bikes : listaBikes) {
			 
			System.out.println("Id da vistoria: " + objVistoria.getId_vistoria() + 
					"\nData de início da vistoria: " + objVistoria.getDt_inicio() + 
					 "\nData do fim da vistoria: " + objVistoria.getDt_fim() + 
					 "\nAprovação da Vistoria: " + objVistoria.getAprov() + 
					 "\nObservações: " + objVistoria.getObs());
			 
			 System.out.println("Número de série: " + bikes.getNum_serie() + 
					 "\nCor: " + bikes.getCor() + 
					 "\nValor: " + bikes.getValor());
			 
			 
			 System.out.println("Id de modelo da bike: " + objBike_modelos.getId_modelo() + 
					 "\nNome do modelo: " + objBike_modelos.getNome() + 
					 "\nValor aproximado: " + objBike_modelos.getValor_aprox());
			 
			 System.out.println("Cpf do cliente: " + objCliente.getCpf() + 
					 "\nNome do cliente: " + objCliente.getNome() + 
					 "\nData de nascimento: " + objCliente.getDt_nasc() + 
					 "\nTelefone fixo: " + objCliente.getTel_fixo() + 
					 "\nTelefone celular: " + objCliente.getTel_celular() + 
					 "\nEmail do cliente: " + objCliente.getEmail());
			 
			 System.out.println("Id da imagem: " + objImagens.getId_img() + 
					 "\nImagem da bike: " + objImagens.getImg() +  
					 "\nId da vistoria atribuida as imagens: " + objImagens.getId_vistoria1());
			 
			 System.out.println("Id dos videos: " + objVideos.getId_videos() + 
					"\nVideos da vistoria: " + objVideos.getVideo());
		 }
		
		


	}

}