package br.edu.imd.gcm.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author geral_001
 */
@Entity
@NamedQuery (name = "findAllDisciplina",query = "SELECT d FROM Disciplina d")
public class Disciplina implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String codigo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
