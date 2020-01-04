/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.lema.security.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LEMAEDU
 */
@Entity
@Table(name = "tb_acceso", catalog = "db_syscom", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAcceso.findAll", query = "SELECT t FROM TbAcceso t"),
    @NamedQuery(name = "TbAcceso.findByIdAcceso", query = "SELECT t FROM TbAcceso t WHERE t.idAcceso = :idAcceso"),
    @NamedQuery(name = "TbAcceso.findByStatus", query = "SELECT t FROM TbAcceso t WHERE t.status = :status"),
    @NamedQuery(name = "TbAcceso.findByUserCreate", query = "SELECT t FROM TbAcceso t WHERE t.userCreate = :userCreate"),
    @NamedQuery(name = "TbAcceso.findByUserUpdate", query = "SELECT t FROM TbAcceso t WHERE t.userUpdate = :userUpdate"),
    @NamedQuery(name = "TbAcceso.findByUserDelete", query = "SELECT t FROM TbAcceso t WHERE t.userDelete = :userDelete"),
    @NamedQuery(name = "TbAcceso.findByDateCreate", query = "SELECT t FROM TbAcceso t WHERE t.dateCreate = :dateCreate"),
    @NamedQuery(name = "TbAcceso.findByDateUpdate", query = "SELECT t FROM TbAcceso t WHERE t.dateUpdate = :dateUpdate"),
    @NamedQuery(name = "TbAcceso.findByDateDelete", query = "SELECT t FROM TbAcceso t WHERE t.dateDelete = :dateDelete")})
public class TbAcceso implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_acceso")
    private Short idAcceso;
    
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
    
    @JoinColumn(name = "_id_opcion", referencedColumnName = "id_opcion")
    @ManyToOne
    private TbOpcion idOpcion;
    
    @JoinColumn(name = "_id_rol", referencedColumnName = "id_rol")
    @ManyToOne
    private TbRol idRol;

    public TbAcceso() {
    }

    public TbAcceso(Short idAcceso) {
        this.idAcceso = idAcceso;
    }

    public Short getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(Short idAcceso) {
        this.idAcceso = idAcceso;
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

    public TbOpcion getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(TbOpcion idOpcion) {
        this.idOpcion = idOpcion;
    }

    public TbRol getIdRol() {
        return idRol;
    }

    public void setIdRol(TbRol idRol) {
        this.idRol = idRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcceso != null ? idAcceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAcceso)) {
            return false;
        }
        TbAcceso other = (TbAcceso) object;
        if ((this.idAcceso == null && other.idAcceso != null) || (this.idAcceso != null && !this.idAcceso.equals(other.idAcceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.lema.security.domain.TbAcceso[ idAcceso=" + idAcceso + " ]";
    }
    
}
