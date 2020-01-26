package ec.com.lema.security.model;

import java.io.Serializable;
import java.util.Date;
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
public class Acceso implements Serializable {

    private static final long serialVersionUID = 1L;

    private Short idAcceso;

    private Boolean status;

    private Integer userCreate;

    private Integer userUpdate;

    private Integer userDelete;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;

    private Opcion idOpcion;

    private Rol idRol;

}
