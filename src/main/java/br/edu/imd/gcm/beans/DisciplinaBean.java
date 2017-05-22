package br.edu.imd.gcm.beans;

import br.edu.imd.gcm.models.Disciplina;

/**
 *
 * @author geral_001
 */
public class DisciplinaBean {
    
    private Disciplina disciplina = new Disciplina();

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    public void cadastrar(){
        System.out.println("Diciplina " + this.disciplina.getNome() + " cadastrada com sucesso");
    }
    
}
