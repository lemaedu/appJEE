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
@Table(name = "tb_usuario_rol", catalog = "db_syscom", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuarioRol.findAll", query = "SELECT t FROM TbUsuarioRol t"),
    @NamedQuery(name = "TbUsuarioRol.findByIdUsuarioRol", query = "SELECT t FROM TbUsuarioRol t WHERE t.idUsuarioRol = :idUsuarioRol"),
    @NamedQuery(name = "TbUsuarioRol.findByStatus", query = "SELECT t FROM TbUsuarioRol t WHERE t.status = :status"),
    @NamedQuery(name = "TbUsuarioRol.findByUserCreate", query = "SELECT t FROM TbUsuarioRol t WHERE t.userCreate = :userCreate"),
    @NamedQuery(name = "TbUsuarioRol.findByUserUpdate", query = "SELECT t FROM TbUsuarioRol t WHERE t.userUpdate = :userUpdate"),
    @NamedQuery(name = "TbUsuarioRol.findByUserDelete", query = "SELECT t FROM TbUsuarioRol t WHERE t.userDelete = :userDelete"),
    @NamedQuery(name = "TbUsuarioRol.findByDateCreate", query = "SELECT t FROM TbUsuarioRol t WHERE t.dateCreate = :dateCreate"),
    @NamedQuery(name = "TbUsuarioRol.findByDateUpdate", query = "SELECT t FROM TbUsuarioRol t WHERE t.dateUpdate = :dateUpdate"),
    @NamedQuery(name = "TbUsuarioRol.findByDateDelete", query = "SELECT t FROM TbUsuarioRol t WHERE t.dateDelete = :dateDelete")})
public class TbUsuarioRol implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario_rol")
    private Integer idUsuarioRol;
    
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
    
    @JoinColumn(name = "_id_rol", referencedColumnName = "id_rol")
    @ManyToOne
    private TbRol idRol;
    
    @JoinColumn(name = "_id_usuario", referencedColumnName = "id_user")
    @ManyToOne
    private TbUsuario idUsuario;

    public TbUsuarioRol() {
    }

    public TbUsuarioRol(Integer idUsuarioRol) {
        this.idUsuarioRol = idUsuarioRol;
    }

    public Integer getIdUsuarioRol() {
        return idUsuarioRol;
    }

    public void setIdUsuarioRol(Integer idUsuarioRol) {
        this.idUsuarioRol = idUsuarioRol;
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

    public TbRol getIdRol() {
        return idRol;
    }

    public void setIdRol(TbRol idRol) {
        this.idRol = idRol;
    }

    public TbUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(TbUsuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioRol != null ? idUsuarioRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuarioRol)) {
            return false;
        }
        TbUsuarioRol other = (TbUsuarioRol) object;
        if ((this.idUsuarioRol == null && other.idUsuarioRol != null) || (this.idUsuarioRol != null && !this.idUsuarioRol.equals(other.idUsuarioRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.lema.security.domain.TbUsuarioRol[ idUsuarioRol=" + idUsuarioRol + " ]";
    }
    
}
