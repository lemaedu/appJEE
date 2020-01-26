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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_menu", catalog = "db_syscom", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbMenu.findAll", query = "SELECT t FROM TbMenu t"),
    @NamedQuery(name = "TbMenu.findByIdMenu", query = "SELECT t FROM TbMenu t WHERE t.idMenu = :idMenu"),
    @NamedQuery(name = "TbMenu.findByNombre", query = "SELECT t FROM TbMenu t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TbMenu.findByImg", query = "SELECT t FROM TbMenu t WHERE t.img = :img"),
    @NamedQuery(name = "TbMenu.findByStatus", query = "SELECT t FROM TbMenu t WHERE t.status = :status"),
    @NamedQuery(name = "TbMenu.findByUserCreate", query = "SELECT t FROM TbMenu t WHERE t.userCreate = :userCreate"),
    @NamedQuery(name = "TbMenu.findByUserUpdate", query = "SELECT t FROM TbMenu t WHERE t.userUpdate = :userUpdate"),
    @NamedQuery(name = "TbMenu.findByUserDelete", query = "SELECT t FROM TbMenu t WHERE t.userDelete = :userDelete"),
    @NamedQuery(name = "TbMenu.findByDateCreate", query = "SELECT t FROM TbMenu t WHERE t.dateCreate = :dateCreate"),
    @NamedQuery(name = "TbMenu.findByDateUpdate", query = "SELECT t FROM TbMenu t WHERE t.dateUpdate = :dateUpdate"),
    @NamedQuery(name = "TbMenu.findByDateDelete", query = "SELECT t FROM TbMenu t WHERE t.dateDelete = :dateDelete")})
public class TbMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_menu")
    private Short idMenu;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 75)
    @Column(name = "img")
    private String img;
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
    @JoinColumn(name = "_id_ubicacion_menu", referencedColumnName = "id_ubicacion_menu")
    @ManyToOne(fetch = FetchType.LAZY)
    private TbUbicacionMenu idUbicacionMenu;
    @OneToMany(mappedBy = "idMenu", fetch = FetchType.LAZY)
    private List<TbOpcion> tbOpcionList;

    public TbMenu() {
    }

    public TbMenu(Short idMenu) {
        this.idMenu = idMenu;
    }

    public Short getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Short idMenu) {
        this.idMenu = idMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public TbUbicacionMenu getIdUbicacionMenu() {
        return idUbicacionMenu;
    }

    public void setIdUbicacionMenu(TbUbicacionMenu idUbicacionMenu) {
        this.idUbicacionMenu = idUbicacionMenu;
    }

    @XmlTransient
    public List<TbOpcion> getTbOpcionList() {
        return tbOpcionList;
    }

    public void setTbOpcionList(List<TbOpcion> tbOpcionList) {
        this.tbOpcionList = tbOpcionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMenu != null ? idMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbMenu)) {
            return false;
        }
        TbMenu other = (TbMenu) object;
        if ((this.idMenu == null && other.idMenu != null) || (this.idMenu != null && !this.idMenu.equals(other.idMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.lema.security.entity.TbMenu[ idMenu=" + idMenu + " ]";
    }
    
}
