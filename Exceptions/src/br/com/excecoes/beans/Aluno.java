package br.com.excecoes.beans;

public class Aluno {
	private int RM;
	private String nomeAluno;
	
	
	public Aluno (String aluno, int rm) {
		super();
		this.nomeAluno = aluno;
		this.RM = rm;
	}
	
	public Aluno () {
		super();
	}
	
	
	public int getRM() {
		return RM;
	}
	public void setRM(int rM) {
		RM = rM;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	
}
