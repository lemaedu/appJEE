/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.controller;

import ec.com.lema.security.domain.TbUsuario;
import ec.com.lema.security.facade.TbUsuarioFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author LEMAEDU
 */
@Named(value = "loginController")
@SessionScoped
public class LoginController implements Serializable {

    @EJB
    private TbUsuarioFacadeLocal facadeLocal;
    
    
    private TbUsuario usuario;
    private List<TbUsuario> usuarios;
    
    public LoginController() {
    }
    
    public void login(){
        int validar_ingreso=validarIngreso();
    }

    private int validarIngreso() {
        if(usuario!=null && !usuario.getAlias().isEmpty() && !usuario.getClave().isEmpty()){
            return 0;
        }else
            return 1;
    }
    
}
