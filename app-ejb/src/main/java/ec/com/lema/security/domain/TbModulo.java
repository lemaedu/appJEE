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
@Table(name = "tb_modulo", catalog = "db_syscom", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbModulo.findAll", query = "SELECT t FROM TbModulo t"),
    @NamedQuery(name = "TbModulo.findByIdModulo", query = "SELECT t FROM TbModulo t WHERE t.idModulo = :idModulo"),
    @NamedQuery(name = "TbModulo.findByNombre", query = "SELECT t FROM TbModulo t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TbModulo.findByDescripcion", query = "SELECT t FROM TbModulo t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TbModulo.findByStatus", query = "SELECT t FROM TbModulo t WHERE t.status = :status"),
    @NamedQuery(name = "TbModulo.findByUserCreate", query = "SELECT t FROM TbModulo t WHERE t.userCreate = :userCreate"),
    @NamedQuery(name = "TbModulo.findByUserUpdate", query = "SELECT t FROM TbModulo t WHERE t.userUpdate = :userUpdate"),
    @NamedQuery(name = "TbModulo.findByUserDelete", query = "SELECT t FROM TbModulo t WHERE t.userDelete = :userDelete"),
    @NamedQuery(name = "TbModulo.findByDateCreate", query = "SELECT t FROM TbModulo t WHERE t.dateCreate = :dateCreate"),
    @NamedQuery(name = "TbModulo.findByDateUpdate", query = "SELECT t FROM TbModulo t WHERE t.dateUpdate = :dateUpdate"),
    @NamedQuery(name = "TbModulo.findByDateDelete", query = "SELECT t FROM TbModulo t WHERE t.dateDelete = :dateDelete")})
public class TbModulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_modulo")
    private Short idModulo;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
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
    @OneToMany(mappedBy = "idModulo", fetch = FetchType.LAZY)
    private List<TbRol> tbRolList;

    public TbModulo() {
    }

    public TbModulo(Short idModulo) {
        this.idModulo = idModulo;
    }

    public Short getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Short idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    public List<TbRol> getTbRolList() {
        return tbRolList;
    }

    public void setTbRolList(List<TbRol> tbRolList) {
        this.tbRolList = tbRolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModulo != null ? idModulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbModulo)) {
            return false;
        }
        TbModulo other = (TbModulo) object;
        if ((this.idModulo == null && other.idModulo != null) || (this.idModulo != null && !this.idModulo.equals(other.idModulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.lema.security.entity.TbModulo[ idModulo=" + idModulo + " ]";
    }
    
}
