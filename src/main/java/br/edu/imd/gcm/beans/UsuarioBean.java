package br.edu.imd.gcm.beans;



import javax.faces.bean.ManagedBean;

import br.edu.imd.gcm.models.Usuario;

@ManagedBean
public class UsuarioBean {
	Usuario user = new Usuario();
	String disciplina;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	public void cadastrar(){
		System.out.println("Aluno " + user.getNome() + " matriculado na disciplina " + disciplina);
		user.addDisciplina(disciplina);
	}
	
}
