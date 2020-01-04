/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.facade;

import ec.com.lema.security.domain.TbUsuarioRol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LEMAEDU
 */
@Local
public interface TbUsuarioRolFacadeLocal {

    void create(TbUsuarioRol tbUsuarioRol);

    void edit(TbUsuarioRol tbUsuarioRol);

    void remove(TbUsuarioRol tbUsuarioRol);

    TbUsuarioRol find(Object id);

    List<TbUsuarioRol> findAll();

    List<TbUsuarioRol> findRange(int[] range);

    int count();
    
}
