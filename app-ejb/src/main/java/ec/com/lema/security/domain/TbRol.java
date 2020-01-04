/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * @author LEMAEDU
 */
@Entity
@Table(name = "tb_rol", catalog = "db_syscom", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbRol.findAll", query = "SELECT t FROM TbRol t"),
    @NamedQuery(name = "TbRol.findByIdRol", query = "SELECT t FROM TbRol t WHERE t.idRol = :idRol"),
    @NamedQuery(name = "TbRol.findByNombre", query = "SELECT t FROM TbRol t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TbRol.findByDescripcion", query = "SELECT t FROM TbRol t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TbRol.findByStatus", query = "SELECT t FROM TbRol t WHERE t.status = :status"),
    @NamedQuery(name = "TbRol.findByUserCreate", query = "SELECT t FROM TbRol t WHERE t.userCreate = :userCreate"),
    @NamedQuery(name = "TbRol.findByUserUpdate", query = "SELECT t FROM TbRol t WHERE t.userUpdate = :userUpdate"),
    @NamedQuery(name = "TbRol.findByUserDelete", query = "SELECT t FROM TbRol t WHERE t.userDelete = :userDelete"),
    @NamedQuery(name = "TbRol.findByDateCreate", query = "SELECT t FROM TbRol t WHERE t.dateCreate = :dateCreate"),
    @NamedQuery(name = "TbRol.findByDateUpdate", query = "SELECT t FROM TbRol t WHERE t.dateUpdate = :dateUpdate"),
    @NamedQuery(name = "TbRol.findByDateDelete", query = "SELECT t FROM TbRol t WHERE t.dateDelete = :dateDelete")})
public class TbRol implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rol")
    private Short idRol;
    
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "status")
    private Boolean status;
    
    @Column(name = "user_create")
    private BigInteger userCreate;
    
    @Column(name = "user_update")
    private BigInteger userUpdate;
    
    @Column(name = "user_delete")
    private BigInteger userDelete;
    
    @Column(name = "date_create")
    @Temporal(TemporalType.DATE)
    private Date dateCreate;
    
    @Column(name = "date_update")
    @Temporal(TemporalType.DATE)
    private Date dateUpdate;
    
    @Column(name = "date_delete")
    @Temporal(TemporalType.DATE)
    private Date dateDelete;
    
    @OneToMany(mappedBy = "idRol")
    private List<TbUsuarioRol> tbUsuarioRolList;
    
    @JoinColumn(name = "_id_modulo", referencedColumnName = "id_modulo")
    @ManyToOne
    private TbModulo idModulo;
    
    @OneToMany(mappedBy = "idRol")
    private List<TbAcceso> tbAccesoList;

    public TbRol() {
    }

    public TbRol(Short idRol) {
        this.idRol = idRol;
    }

    public Short getIdRol() {
        return idRol;
    }

    public void setIdRol(Short idRol) {
        this.idRol = idRol;
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

    public BigInteger getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(BigInteger userCreate) {
        this.userCreate = userCreate;
    }

    public BigInteger getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(BigInteger userUpdate) {
        this.userUpdate = userUpdate;
    }

    public BigInteger getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(BigInteger userDelete) {
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

    public TbModulo getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(TbModulo idModulo) {
        this.idModulo = idModulo;
    }

    @XmlTransient
    public List<TbAcceso> getTbAccesoList() {
        return tbAccesoList;
    }

    public void setTbAccesoList(List<TbAcceso> tbAccesoList) {
        this.tbAccesoList = tbAccesoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbRol)) {
            return false;
        }
        TbRol other = (TbRol) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.lema.security.domain.TbRol[ idRol=" + idRol + " ]";
    }
    
}
