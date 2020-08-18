package br.com.conexao.exception;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Excecao extends Exception{
	
	// metodo static serve para utilizar um metodo sem precisar instanciar a classe.
	/* POREM UM METODO STATC NAO PODE MANIPULAR DADOS OU RECEBER PARAMETROS , 
	 * QUE MANIPULAM DADOS
	 * 
	 */
	
	public static String tratarExcecao(Exception e) {
		if(e instanceof NullPointerException) {
			return "Objeto nulo!!";
			
		} else if (e instanceof NumberFormatException) {
			return "Número inválido digitado!";
			
		} else if (e instanceof SQLException) {
			return "Erro no Banco";
			
		} else {
			return "Exceção deconhecida...talvez ela não foi tratada ainda.";
		}
	}
}
