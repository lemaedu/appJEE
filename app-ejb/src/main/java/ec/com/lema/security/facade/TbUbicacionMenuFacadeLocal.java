/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.facade;

import ec.com.lema.security.domain.TbUbicacionMenu;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LEMAEDU
 */
@Local
public interface TbUbicacionMenuFacadeLocal {

    void create(TbUbicacionMenu tbUbicacionMenu);

    void edit(TbUbicacionMenu tbUbicacionMenu);

    void remove(TbUbicacionMenu tbUbicacionMenu);

    TbUbicacionMenu find(Object id);

    List<TbUbicacionMenu> findAll();

    List<TbUbicacionMenu> findRange(int[] range);

    int count();
    
}
