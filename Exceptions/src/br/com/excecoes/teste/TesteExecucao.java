package br.com.excecoes.teste;

import javax.swing.JOptionPane;

import br.com.excecoes.Exception.Excecao;
import br.com.excecoes.beans.Aluno;

public class TesteExecucao {
	public static void main(String[] args) {
		
//		Aluno aluno = new Aluno();
//		aluno.setNomeAluno("Gabriruu");
		
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
			System.out.println(numero);
			
			Aluno objeto = new Aluno();
			
			// Intanciando o nome do aluno atraves da intera��o com o usu�rio.
			objeto.setNomeAluno(JOptionPane.showInputDialog("Digite seu nome: "));
			System.out.println("O tamanho da String digitada �: "+objeto.getNomeAluno().length());
			
		} catch (Exception e) {
			//e.printStackTrace();  *** Mostra onde esta o erro e qual a exce��o foi lan�ada
			
			System.out.println(Excecao.tratarEXcecao(e));
		} 
	}
}
