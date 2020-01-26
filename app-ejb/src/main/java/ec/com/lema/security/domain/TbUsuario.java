/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lemaedu
 */
@Entity
@Table(name = "tb_usuario", catalog = "db_syscom", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuario.findAll", query = "SELECT t FROM TbUsuario t"),
    @NamedQuery(name = "TbUsuario.findByIdUser", query = "SELECT t FROM TbUsuario t WHERE t.idUser = :idUser"),
    @NamedQuery(name = "TbUsuario.findByIdPersona", query = "SELECT t FROM TbUsuario t WHERE t.idPersona = :idPersona"),
    @NamedQuery(name = "TbUsuario.findByAlias", query = "SELECT t FROM TbUsuario t WHERE t.alias = :alias"),
    @NamedQuery(name = "TbUsuario.findByCorreo", query = "SELECT t FROM TbUsuario t WHERE t.correo = :correo"),
    @NamedQuery(name = "TbUsuario.findByClave", query = "SELECT t FROM TbUsuario t WHERE t.clave = :clave"),
    @NamedQuery(name = "TbUsuario.findByClaveTem", query = "SELECT t FROM TbUsuario t WHERE t.claveTem = :claveTem"),
    @NamedQuery(name = "TbUsuario.findByLink", query = "SELECT t FROM TbUsuario t WHERE t.link = :link"),
    @NamedQuery(name = "TbUsuario.findByStatus", query = "SELECT t FROM TbUsuario t WHERE t.status = :status"),
    @NamedQuery(name = "TbUsuario.findByUserCreate", query = "SELECT t FROM TbUsuario t WHERE t.userCreate = :userCreate"),
    @NamedQuery(name = "TbUsuario.findByUserUpdate", query = "SELECT t FROM TbUsuario t WHERE t.userUpdate = :userUpdate"),
    @NamedQuery(name = "TbUsuario.findByUserDelete", query = "SELECT t FROM TbUsuario t WHERE t.userDelete = :userDelete"),
    @NamedQuery(name = "TbUsuario.findByDateCreate", query = "SELECT t FROM TbUsuario t WHERE t.dateCreate = :dateCreate"),
    @NamedQuery(name = "TbUsuario.findByDateUpdate", query = "SELECT t FROM TbUsuario t WHERE t.dateUpdate = :dateUpdate"),
    @NamedQuery(name = "TbUsuario.findByDateDelete", query = "SELECT t FROM TbUsuario t WHERE t.dateDelete = :dateDelete")})
public class TbUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "_id_persona")
    private Integer idPersona;
    @Size(max = 200)
    @Column(name = "alias")
    private String alias;
    @Size(max = 50)
    @Column(name = "correo")
    private String correo;
    @Size(max = 100)
    @Column(name = "clave")
    private String clave;
    @Size(max = 100)
    @Column(name = "clave_tem")
    private String claveTem;
    @Size(max = 150)
    @Column(name = "link")
    private String link;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "user_create")
    private Integer userCreate;
    @Column(name = "user_update")
    private Integer userUpdate;
    @Column(name = "user_delete")
    private Integer userDelete;
    @Column(name = "date_create")
    @Temporal(TemporalType.DATE)
    private Date dateCreate;
    @Column(name = "date_update")
    @Temporal(TemporalType.DATE)
    private Date dateUpdate;
    @Column(name = "date_delete")
    @Temporal(TemporalType.DATE)
    private Date dateDelete;
    @OneToMany(mappedBy = "idUser", fetch = FetchType.LAZY)
    private List<TbUsuarioRol> tbUsuarioRolList;

    public TbUsuario() {
    }

    public TbUsuario(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClaveTem() {
        return claveTem;
    }

    public void setClaveTem(String claveTem) {
        this.claveTem = claveTem;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(Integer userCreate) {
        this.userCreate = userCreate;
    }

    public Integer getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(Integer userUpdate) {
        this.userUpdate = userUpdate;
    }

    public Integer getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(Integer userDelete) {
        this.userDelete = userDelete;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Date getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Date dateDelete) {
        this.dateDelete = dateDelete;
    }

    @XmlTransient
    public List<TbUsuarioRol> getTbUsuarioRolList() {
        return tbUsuarioRolList;
    }

    public void setTbUsuarioRolList(List<TbUsuarioRol> tbUsuarioRolList) {
        this.tbUsuarioRolList = tbUsuarioRolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuario)) {
            return false;
        }
        TbUsuario other = (TbUsuario) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.lema.security.entity.TbUsuario[ idUser=" + idUser + " ]";
    }
    
}
