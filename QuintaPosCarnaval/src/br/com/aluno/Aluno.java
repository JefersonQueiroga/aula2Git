package br.com.aluno;

public class Aluno {
	
	private String nome;
	private String curso;
	
	
	public Aluno(String nome, String curso) {
		super();
		this.nome = nome;
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
