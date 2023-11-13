package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;


public class TesteSelecionar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		ClienteDAO dao = new ClienteDAO();
		
		List<Cliente> listaClientes = (ArrayList<Cliente>) dao.selecionar();
		
		if (listaClientes != null) {
			for(Cliente cliente : listaClientes) {
				System.out.println(cliente.getCpf() + "" + 
									cliente.getNome() + "" + 
									cliente.getDt_nasc() + "" + 
									cliente.getTel_fixo() + "" + 
									cliente.getTel_celular() + "" +
									cliente.getEmail());
			}
			}
		}

	}

