package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cliente;
import br.com.fiap.conexoes.ConexaoFactory;

public class ClienteDAO {
	
	public Connection minhaConexao;
	
	public ClienteDAO() throws ClassNotFoundException, SQLException { 
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert
	public String inserir(Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" Insert into clientes values (?,?,?,?,?,?)");
		
		stmt.setString(1, cliente.getCpf());
		stmt.setString(2, cliente.getNome());
		stmt.setString(3, cliente.getDt_nasc());
		stmt.setString(4, cliente.getTel_fixo());
		stmt.setString(5, cliente.getTel_celular());
		stmt.setString(6, cliente.getEmail());
		stmt.execute();
		stmt.close();
		
		return "Cliente cadastrado com sucesso";
	}

	//Delete
	public String deletar (Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" delete from clientes where cpf = ? ");
		
		stmt.setString(1, cliente.getCpf());
		stmt.executeUpdate();
		stmt.close();
		
		return "Deletado com sucesso";
	}
	
	//Update
	public String atualizar (Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
		(" Update clientes set nome = ?, dt_nasc = ? where cpf = ?");
		
		stmt.setString(1, cliente.getNome());
		stmt.setString(2, cliente.getDt_nasc());
		stmt.setString(3, cliente.getCpf());
		stmt.executeUpdate();
		stmt.close();
		
		
		return "Atualizado com sucesso!";
		
	}
	
	//Select
	public List<Cliente> selecionar() throws SQLException {
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		PreparedStatement stmt = minhaConexao.prepareStatement
		(" SELECT * FROM clientes");
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Cliente cliente = new Cliente();
			cliente.setCpf(rs.getString(1));
			cliente.setNome(rs.getString(2));
			cliente.setDt_nasc(rs.getString(3));
			cliente.setTel_fixo(rs.getString(4));
			cliente.setTel_celular(rs.getString(5));
			cliente.setEmail(rs.getString(6));
			listaClientes.add(cliente);
		}
		
		
		return listaClientes;
	}
}
