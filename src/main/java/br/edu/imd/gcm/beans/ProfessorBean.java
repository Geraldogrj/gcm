package br.edu.imd.gcm.beans;

import br.edu.imd.gcm.models.Professor;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author geral_001
 */
@SessionScoped
@Named
public class ProfessorBean implements Serializable {
    
    private Professor professor = new Professor();

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    public String cadastrar(){
        System.out.println("Professor " + this.professor.getNome() + " cadastrado com sucesso");
        return "/pages/erro404.xhtml?faces-redirect=true";
        
    }
    
}
