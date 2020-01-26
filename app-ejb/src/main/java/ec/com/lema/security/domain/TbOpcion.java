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
@Table(name = "tb_opcion", catalog = "db_syscom", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbOpcion.findAll", query = "SELECT t FROM TbOpcion t"),
    @NamedQuery(name = "TbOpcion.findByIdOpcion", query = "SELECT t FROM TbOpcion t WHERE t.idOpcion = :idOpcion"),
    @NamedQuery(name = "TbOpcion.findByNombre", query = "SELECT t FROM TbOpcion t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TbOpcion.findByLink", query = "SELECT t FROM TbOpcion t WHERE t.link = :link"),
    @NamedQuery(name = "TbOpcion.findByImg", query = "SELECT t FROM TbOpcion t WHERE t.img = :img"),
    @NamedQuery(name = "TbOpcion.findByOrden", query = "SELECT t FROM TbOpcion t WHERE t.orden = :orden"),
    @NamedQuery(name = "TbOpcion.findByStatus", query = "SELECT t FROM TbOpcion t WHERE t.status = :status"),
    @NamedQuery(name = "TbOpcion.findByUserCreate", query = "SELECT t FROM TbOpcion t WHERE t.userCreate = :userCreate"),
    @NamedQuery(name = "TbOpcion.findByUserUpdate", query = "SELECT t FROM TbOpcion t WHERE t.userUpdate = :userUpdate"),
    @NamedQuery(name = "TbOpcion.findByUserDelete", query = "SELECT t FROM TbOpcion t WHERE t.userDelete = :userDelete"),
    @NamedQuery(name = "TbOpcion.findByDateCreate", query = "SELECT t FROM TbOpcion t WHERE t.dateCreate = :dateCreate"),
    @NamedQuery(name = "TbOpcion.findByDateUpdate", query = "SELECT t FROM TbOpcion t WHERE t.dateUpdate = :dateUpdate"),
    @NamedQuery(name = "TbOpcion.findByDateDelete", query = "SELECT t FROM TbOpcion t WHERE t.dateDelete = :dateDelete")})
public class TbOpcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_opcion")
    private Short idOpcion;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 150)
    @Column(name = "link")
    private String link;
    @Size(max = 100)
    @Column(name = "img")
    private String img;
    @Column(name = "orden")
    private Short orden;
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
    @OneToMany(mappedBy = "idOpcion", fetch = FetchType.LAZY)
    private List<TbAcceso> tbAccesoList;
    @JoinColumn(name = "_id_menu", referencedColumnName = "id_menu")
    @ManyToOne(fetch = FetchType.LAZY)
    private TbMenu idMenu;

    public TbOpcion() {
    }

    public TbOpcion(Short idOpcion) {
        this.idOpcion = idOpcion;
    }

    public Short getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(Short idOpcion) {
        this.idOpcion = idOpcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
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
    public List<TbAcceso> getTbAccesoList() {
        return tbAccesoList;
    }

    public void setTbAccesoList(List<TbAcceso> tbAccesoList) {
        this.tbAccesoList = tbAccesoList;
    }

    public TbMenu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(TbMenu idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOpcion != null ? idOpcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbOpcion)) {
            return false;
        }
        TbOpcion other = (TbOpcion) object;
        if ((this.idOpcion == null && other.idOpcion != null) || (this.idOpcion != null && !this.idOpcion.equals(other.idOpcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.lema.security.entity.TbOpcion[ idOpcion=" + idOpcion + " ]";
    }
    
}
