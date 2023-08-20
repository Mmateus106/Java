package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteArrayConsultaDoWhile {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal(List<Cliente> listaCl, Cliente c) {
		double total = 0;
		
		for (Cliente cl : listaCl) {
			total += cl.getValor();
		}
		
		return total;
	}

	public static void main(String[] args) {
		// Instanciar
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		Cliente objCliente = null;
		
		do {
			objCliente = new Cliente();
			objCliente.setNome(texto("Informe o nome do cliente"));
			objCliente.setEmail(texto("Informe o email do cliente"));
			objCliente.setIdade(inteiro("Idade do cliente"));
			objCliente.setValor(real("Valor da consulta"));
			
			listaClientes.add(objCliente);
			
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar Cliente?", 
				"Cadastro da Consulta", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE)  ==0);
		
		//Saida
		//Foreach
		for (Cliente cliente : listaClientes) {
			System.out.println("Nome: " + cliente.getNome() + 
					"\nEmail: " + cliente.getEmail() + 
					"\nIdade: " + cliente.getIdade() + 
					"\nValor: R$" + cliente.getValor());
		}
		
		System.out.println("VALOR TOTAL DE CONSULTAS: R$" + valorTotal(listaClientes, objCliente));

	}

}
