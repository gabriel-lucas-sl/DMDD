package br.com.projeto.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public static Connection conectar() throws Exception {
		return DriverManager.getConnection("jdbc:oracle:thin:","","");
		
	}
	

}
