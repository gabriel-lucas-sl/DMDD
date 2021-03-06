package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.beans.Cargo;
import br.com.projeto.dao.CargoDAO;
import br.com.projeto.exception.Excecao;

public class TesteAddCargo {
	
	public static void main(String[] args) {
		try {
			CargoDAO dao = new CargoDAO();
			Cargo cargo = new Cargo();
			cargo.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
			cargo.setNivel(JOptionPane.showInputDialog("N�vel").toUpperCase());
			cargo.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
			cargo.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Sal�rio"))); 
			
			if (dao.add(cargo) == 0) {
				System.out.println("N�o gravou");
				
			}else {
				System.out.println("Gravado");
			}
			
		} catch (Exception e){
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
					
		}
		
		
		
	}

}
