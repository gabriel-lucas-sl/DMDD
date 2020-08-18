package br.com.conexao.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.conexao.exception.Excecao;

public class TesteConexao {

	public static void main(String[] args) {
		
		Connection fiap = null;
		Statement estrutura = null;
		ResultSet resultado = null;
		
		try {
			fiap = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm85931","201201");
			estrutura = fiap.createStatement();
			resultado = estrutura.executeQuery("select * from tb_cliente");
			
			
			while (resultado.next()) {
				System.out.println(
						"ID:............" + resultado.getString("num_id") +
						"\nNOME:.......... " + resultado.getString("nm_usuario") + 
						"\nESTRELAS:......" + resultado.getString("qtd_estrelas"));
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
