package br.edu.imd.gcm.models;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String matricula;
	private ArrayList<String> disciplina;
	
	public void addDisciplina(String disciplinas){
		disciplina.add(disciplinas);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public ArrayList<String> getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(ArrayList<String> disciplina) {
		this.disciplina = disciplina;
	}
	
}
