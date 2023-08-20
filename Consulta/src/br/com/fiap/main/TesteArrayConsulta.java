package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteArrayConsulta {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal (List<Cliente> listaCl , Cliente cl) {
		double total = 0;
		//foreach
		for (Cliente cli : listaCl) {
			total += cli.getValor();
		}
		
		return total;
	}

	public static void main(String[] args) {
		
		//Instanciar
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		Cliente objCliente = null;
		
		int continuar = 0;
		
		while(continuar ==0) {
			objCliente = new Cliente();
			objCliente.setNome(texto("Digite o nome"));
			objCliente.setEmail(texto("Informe o email"));
			objCliente.setIdade(inteiro("idade"));
			objCliente.setValor(real("Valor da consulta"));
			
			listaClientes.add(objCliente);
			
			
			continuar = JOptionPane.showConfirmDialog(null, "Cadastrar mais cliente?", 
					"Cadastro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
			
		}
		
		//Saida
		//foreach
		
		for (Cliente c : listaClientes) {
			System.out.println("Nome: " + c.getNome() + 
					"\nEmail: " + c.getEmail() + 
					"\nIdade: " + c.getIdade() + 
					"\nValor: " + c.getValor());
		}
		
		System.out.println("Valor total de consultas: " + valorTotal(listaClientes, objCliente));

	}

}
