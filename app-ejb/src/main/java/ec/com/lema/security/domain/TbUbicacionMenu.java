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
@Table(name = "tb_ubicacion_menu", catalog = "db_syscom", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUbicacionMenu.findAll", query = "SELECT t FROM TbUbicacionMenu t"),
    @NamedQuery(name = "TbUbicacionMenu.findByIdUbicacionMenu", query = "SELECT t FROM TbUbicacionMenu t WHERE t.idUbicacionMenu = :idUbicacionMenu"),
    @NamedQuery(name = "TbUbicacionMenu.findByUbicacion", query = "SELECT t FROM TbUbicacionMenu t WHERE t.ubicacion = :ubicacion"),
    @NamedQuery(name = "TbUbicacionMenu.findByStatus", query = "SELECT t FROM TbUbicacionMenu t WHERE t.status = :status"),
    @NamedQuery(name = "TbUbicacionMenu.findByUserCreate", query = "SELECT t FROM TbUbicacionMenu t WHERE t.userCreate = :userCreate"),
    @NamedQuery(name = "TbUbicacionMenu.findByUserUpdate", query = "SELECT t FROM TbUbicacionMenu t WHERE t.userUpdate = :userUpdate"),
    @NamedQuery(name = "TbUbicacionMenu.findByUserDelete", query = "SELECT t FROM TbUbicacionMenu t WHERE t.userDelete = :userDelete"),
    @NamedQuery(name = "TbUbicacionMenu.findByDateCreate", query = "SELECT t FROM TbUbicacionMenu t WHERE t.dateCreate = :dateCreate"),
    @NamedQuery(name = "TbUbicacionMenu.findByDateUpdate", query = "SELECT t FROM TbUbicacionMenu t WHERE t.dateUpdate = :dateUpdate"),
    @NamedQuery(name = "TbUbicacionMenu.findByDateDelete", query = "SELECT t FROM TbUbicacionMenu t WHERE t.dateDelete = :dateDelete")})
public class TbUbicacionMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ubicacion_menu")
    private Short idUbicacionMenu;
    @Size(max = 50)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "user_create")
    private Integer userCreate;
    @Column(name = "user_update")
    private Integer userUpdate;
    @Column(name = "user_delete")
    private Integer userDelete;
    @Column(name = "date_create")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;
    @Column(name = "date_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdate;
    @Column(name = "date_delete")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDelete;
    @OneToMany(mappedBy = "idUbicacionMenu", fetch = FetchType.LAZY)
    private List<TbMenu> tbMenuList;

    public TbUbicacionMenu() {
    }

    public TbUbicacionMenu(Short idUbicacionMenu) {
        this.idUbicacionMenu = idUbicacionMenu;
    }

    public Short getIdUbicacionMenu() {
        return idUbicacionMenu;
    }

    public void setIdUbicacionMenu(Short idUbicacionMenu) {
        this.idUbicacionMenu = idUbicacionMenu;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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
    public List<TbMenu> getTbMenuList() {
        return tbMenuList;
    }

    public void setTbMenuList(List<TbMenu> tbMenuList) {
        this.tbMenuList = tbMenuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUbicacionMenu != null ? idUbicacionMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUbicacionMenu)) {
            return false;
        }
        TbUbicacionMenu other = (TbUbicacionMenu) object;
        if ((this.idUbicacionMenu == null && other.idUbicacionMenu != null) || (this.idUbicacionMenu != null && !this.idUbicacionMenu.equals(other.idUbicacionMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.lema.security.entity.TbUbicacionMenu[ idUbicacionMenu=" + idUbicacionMenu + " ]";
    }
    
}
