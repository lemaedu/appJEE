/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.facade;

import ec.com.lema.security.domain.TbRol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lemaedu
 */
@Local
public interface TbRolFacadeLocal {

    void create(TbRol tbRol);

    void edit(TbRol tbRol);

    void remove(TbRol tbRol);

    TbRol find(Object id);

    List<TbRol> findAll();

    List<TbRol> findRange(int[] range);

    int count();
    
}
