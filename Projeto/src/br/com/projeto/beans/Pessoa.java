package br.com.projeto.beans;

public class Pessoa {

	private String fone;
	private String email;
	
	public void setAll(String fone, String email) {
        this.fone = fone;
        this.email = email;
    }
	
	public String getAll() {
		return fone + "\n" + email;		
	}
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String fone, String email) {
		super();
		this.fone = fone;
		this.email = email;
	}
	
	
	public String getFone() {
		return fone;
	}

	public void setFone(String nome) {
		this.fone = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
