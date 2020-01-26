/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.facade;

import ec.com.lema.security.domain.TbAcceso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lemaedu
 */
@Stateless
public class TbAccesoFacade extends AbstractFacade<TbAcceso> implements TbAccesoFacadeLocal {

    @PersistenceContext(unitName = "syscomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbAccesoFacade() {
        super(TbAcceso.class);
    }
    
}
