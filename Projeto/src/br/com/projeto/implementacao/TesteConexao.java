package br.com.projeto.implementacao;

import java.sql.Connection;

import br.com.projeto.conexao.Conexao;
import br.com.projeto.exception.Excecao;

public class TesteConexao {
	
	public static void main(String[] args) {
		Connection c = null;
		try {
			
			c = new Conexao().conectar();
			System.out.println("Abriu!");
			
		} catch (Exception e){
			System.out.println(Excecao.tratarExcecao(e));
			e.printStackTrace();
			
		} finally { 
			try {
				c.close();
				
				
			} catch(Exception e) {
				System.out.println(Excecao.tratarExcecao(e));
			}
			
		} 
		
	}

}
