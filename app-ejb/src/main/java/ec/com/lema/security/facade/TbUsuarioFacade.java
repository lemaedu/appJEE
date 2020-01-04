/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.facade;

import ec.com.lema.security.domain.TbUsuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author LEMAEDU
 */
@Stateless
public class TbUsuarioFacade extends AbstractFacade<TbUsuario> implements TbUsuarioFacadeLocal {

    @PersistenceContext(unitName = "syscomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbUsuarioFacade() {
        super(TbUsuario.class);
    }

    @Override
    public List<TbUsuario> findByAliasAndPassword(String alias, String password) {
        TypedQuery<TbUsuario> query
                = em.createQuery("SELECT t FROM TbUsuario t WHERE t.alias = :alias AND t.clave = :clave ", TbUsuario.class);
        List<TbUsuario> results = query.getResultList();
        return results;
    }
}
