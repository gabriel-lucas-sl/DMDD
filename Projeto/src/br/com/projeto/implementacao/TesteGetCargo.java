package br.com.projeto.implementacao;

import br.com.projeto.beans.Cargo;
import br.com.projeto.dao.CargoDAO;
import br.com.projeto.exception.Excecao;
import br.com.projeto.util.Magic;

public class TesteGetCargo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CargoDAO dao = new CargoDAO();
			
			Cargo resposta = dao.getCargo(Magic.i("ID"));
			System.out.println("ID: " + resposta.getId());
			System.out.println("Nome: " + resposta.getNome());
			System.out.println("Nível: " + resposta.getNivel());
			System.out.println("Salário: " + resposta.getSalario());
			
			dao.fechar();
			
		} catch(Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
			
		}

	}

}
