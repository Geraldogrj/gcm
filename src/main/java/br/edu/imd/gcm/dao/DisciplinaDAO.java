package br.edu.imd.gcm.dao;

import br.edu.imd.gcm.models.Disciplina;
import java.util.List;
import javax.annotation.Resource;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author Geraldo Jr
 */
@RequestScoped
@Named
public class DisciplinaDAO {

    @Resource
    private UserTransaction userTransaction;

    @PersistenceContext(unitName = "gcm")
    private EntityManager em;

    public Disciplina saveOrUpdate(Disciplina disciplina) {
        try {
            userTransaction.begin();
            if (disciplina.getId() == null) {
                em.persist(disciplina);
            } else {
                em.merge(disciplina);
            }
            userTransaction.commit();
        } catch (Exception e) {
        }

        return disciplina;
    }

    public void remover(Disciplina disciplina) throws IllegalStateException, SecurityException, SystemException {
        try {
            userTransaction.begin();
            Disciplina discip = em.find(Disciplina.class, disciplina.getId());
            em.remove(discip);
            userTransaction.commit();
        } catch (Exception e) {
            userTransaction.rollback();
            e.printStackTrace();
        }
    }

    public List<Disciplina> list() {
        TypedQuery<Disciplina> query = em.createNamedQuery("findAllDisciplinas", Disciplina.class);
        List<Disciplina> disciplinas = query.getResultList();
        return disciplinas;
    }
}
