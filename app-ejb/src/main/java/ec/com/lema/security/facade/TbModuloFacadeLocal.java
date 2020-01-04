/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.facade;

import ec.com.lema.security.domain.TbModulo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LEMAEDU
 */
@Local
public interface TbModuloFacadeLocal {

    void create(TbModulo tbModulo);

    void edit(TbModulo tbModulo);

    void remove(TbModulo tbModulo);

    TbModulo find(Object id);

    List<TbModulo> findAll();

    List<TbModulo> findRange(int[] range);

    int count();
    
}
