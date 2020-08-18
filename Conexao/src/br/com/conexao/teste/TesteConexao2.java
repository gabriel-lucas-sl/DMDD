package br.com.conexao.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import br.com.conexao.exception.Excecao;

public class TesteConexao2 {

	public static void main(String[] args) {
		
		Connection fiap = null;
		Statement estrutura = null;
		ResultSet resultado = null;
		
		try {
			fiap = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm85931","201201");
			estrutura = fiap.createStatement();
			
			String nome = JOptionPane.showInputDialog("Digite o nome");
			
			resultado = estrutura.executeQuery("select * from tb_cliente where nm_usuario like '%" + nome + "%'");
			
			
			while (resultado.next()) {
				System.out.println(
						"ID: " + resultado.getString("num_id") +
						"\nNOME: " + resultado.getString("nm_usuario") + 
						"\nESTRELAS: " + resultado.getString("qtd_estrelas") + "\n");
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
