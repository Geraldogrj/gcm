package br.edu.imd.gcm.beans;

import br.edu.imd.gcm.models.Professor;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author geral_001
 */
@ManagedBean
public class ProfessorBean {
    
    private Professor professor = new Professor();

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    public void cadastrar(){
        System.out.println("Professor " + this.professor.getNome() + " cadastrado com sucesso");
        
    }
    
}
