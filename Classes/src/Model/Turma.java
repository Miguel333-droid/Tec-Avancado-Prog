package Model;

public class Turma {
	private String nome;
	private String curso;
	private int qtdeAlunos;
	private int serie;
	
	
	
	public Turma (String nome, String curso, int qtdeAlunos, int serie) {
		this.nome = nome;
		this.curso = curso;
		this.qtdeAlunos = qtdeAlunos;
		this.serie = serie;
		
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setQtdeAlunos(int qtdeAlunos) {
		this.qtdeAlunos = qtdeAlunos;
	}
	
	
	public void setSerie(int Serie) {
		this.serie = serie;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public int getQtdeAlunos() {
		return qtdeAlunos;
	}
	
	public int getSerie() {
		return serie;
	}
	
	

}
