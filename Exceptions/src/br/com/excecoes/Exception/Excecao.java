package br.com.excecoes.Exception;

public class Excecao extends Exception{
	
	// metodo static serve para utilizar um metodo sem precisar instanciar a classe.
	/* POREM UM METODO STATC NAO PODE MANIPULAR DADOS OU RECEBER PARAMETROS , 
	 * QUE MANIPULAM DADOS
	 * 
	 */
	
	public static String tratarEXcecao(Exception erro) {
		if(erro instanceof NullPointerException) {
			return "Objeto nulo!!";
		} else if (erro instanceof NumberFormatException) {
			return "N�mero inv�lido digitado!";
		} else {
			return "Exce��o deconhecida...talvez ela n�o foi tratada ainda.";
		}
	}
}
