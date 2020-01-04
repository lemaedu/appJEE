/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.facade;

import ec.com.lema.security.domain.TbOpcion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LEMAEDU
 */
@Local
public interface TbOpcionFacadeLocal {

    void create(TbOpcion tbOpcion);

    void edit(TbOpcion tbOpcion);

    void remove(TbOpcion tbOpcion);

    TbOpcion find(Object id);

    List<TbOpcion> findAll();

    List<TbOpcion> findRange(int[] range);

    int count();
    
}
