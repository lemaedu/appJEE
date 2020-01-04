/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.controller;

import ec.com.lema.security.domain.TbUsuario;
import ec.com.lema.security.facade.TbUsuarioFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LEMAEDU
 */
@Named(value = "usuarioController")
@ViewScoped
@Setter
@Getter
public class UsuarioController implements Serializable {

    @EJB
    private TbUsuarioFacadeLocal usuarioFacadeLocal;
    private TbUsuario usuario;
    private List<TbUsuario> usuarios;

    private String alias;
    private String password;

    private boolean autenticado;

    public UsuarioController() {
    }

    public void login() {
        if (!alias.isEmpty() && !password.isEmpty()) {
            usuarios=usuarioFacadeLocal.findAll();
        }
    }

}
