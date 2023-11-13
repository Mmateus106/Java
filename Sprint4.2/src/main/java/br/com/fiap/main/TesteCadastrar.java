package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class TesteCadastrar {
	
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


		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// Instanciar 
			
	
			ClienteDAO dao = new ClienteDAO();
			
			Cliente objCliente = new Cliente();
			
			objCliente.setCpf(texto("cpf"));
			objCliente.setNome(texto("nome"));
			objCliente.setDt_nasc(texto("dt_nasc"));
			objCliente.setTel_fixo(texto("tel_fixo"));
			objCliente.setTel_celular(texto("tel_celular"));
			objCliente.setEmail(texto("email"));
			
			System.out.println(dao.inserir(objCliente));
		}
}