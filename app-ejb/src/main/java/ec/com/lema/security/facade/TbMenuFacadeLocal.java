/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.facade;

import ec.com.lema.security.domain.TbMenu;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lemaedu
 */
@Local
public interface TbMenuFacadeLocal {

    void create(TbMenu tbMenu);

    void edit(TbMenu tbMenu);

    void remove(TbMenu tbMenu);

    TbMenu find(Object id);

    List<TbMenu> findAll();

    List<TbMenu> findRange(int[] range);

    int count();
    
}
