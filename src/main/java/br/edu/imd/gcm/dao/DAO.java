package br.edu.imd.gcm.dao;

import javax.annotation.Resource;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author geral_001
 */
@Named
@RequestScoped
public class DAO<T> {

    private final Class<T> classe;

    //consegue a Entity Manager
    @PersistenceContext(unitName = "gcm")
    private EntityManager em;
    
    @Resource
    private UserTransaction userTransaction;

    public DAO(Class<T> classe) {
        this.classe = classe;
    }

    public void save(T t) {

        //abre a transação
        em.getTransaction();
    }

}
