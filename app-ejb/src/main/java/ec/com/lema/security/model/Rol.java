package ec.com.lema.security.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author lemaedu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    private Short idRol;

    @Size(max = 50)
    private String nombre;

    @Size(max = 100)
    private String descripcion;

    private Boolean status;

    private Integer userCreate;

    private Integer userUpdate;

    private Integer userDelete;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;

    private List<UsuarioRol> tbUsuarioRolList;

    private Modulo idModulo;

    private List<Acceso> tbAccesoList;

}
