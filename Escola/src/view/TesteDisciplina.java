package view;

import model.Disciplina;

public class TesteDisciplina {

	public static void main(String[] args) {
		Disciplina disciplina = new Disciplina("Bralw Stars","Miguel",19,true);
		
		System.out.println(disciplina.toString());
	}

}
