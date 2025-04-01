package view;

import model.Alunos;

public class TesteAlunos {

	public static void main(String[] args) {
		Alunos alunos = new Alunos("Miguel",18,62,'M');
		
		System.out.println(alunos.toString());
	}

}
