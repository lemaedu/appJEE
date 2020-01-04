/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.facade;

import ec.com.lema.security.domain.TbAcceso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LEMAEDU
 */
@Local
public interface TbAccesoFacadeLocal {

    void create(TbAcceso tbAcceso);

    void edit(TbAcceso tbAcceso);

    void remove(TbAcceso tbAcceso);

    TbAcceso find(Object id);

    List<TbAcceso> findAll();

    List<TbAcceso> findRange(int[] range);

    int count();
    
}
