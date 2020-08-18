package br.com.conexao.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import br.com.conexao.exception.Excecao;

public class TesteConexao3 {

	public static void main(String[] args) {
		
		Connection fiap = null;
		Statement estrutura = null;
		ResultSet resultado = null;
		
		try {
			fiap = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm85931","201201");
			estrutura = fiap.createStatement();
			
			String nome = JOptionPane.showInputDialog("Digite o nome");
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID"));
			
			resultado = estrutura.executeQuery
					("select * from tb_cliente where num_id = " + id + " and nm_usuario = '" + nome + "'"); 
			
			// Concatena��o traz falhas de seguran�a 
			// SQL INJECTION	
			// ZE'OR'1'='1
			// 666
			
			
			if (resultado.next()) {
				System.out.println(nome + ", voc� est� autorizado!");
				
			} else {
				System.out.println(nome + ", seus dados n�o conferem!");				
			}
			
			
		
		} catch (Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
			e.printStackTrace();
			
		} finally {
			try {
				fiap.close();
				
			} catch (Exception e) {
				System.out.println(Excecao.tratarExcecao(e));
				
			}
			
			
		}
		
	}
	
}
