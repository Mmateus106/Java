package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;


public class TesteDeletar {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos
		
		ClienteDAO dao = new ClienteDAO();
		
		Cliente objCliente = new Cliente();
		
		objCliente.setCpf(texto("Informe o cpf a ser deletado"));
		
		System.out.println(dao.deletar(objCliente));

	}

}
