package ec.com.lema.security.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lemaedu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idUser;

    private Integer idPersona;

    @Size(max = 200)
    private String alias;

    @Size(max = 50)
    private String correo;

    @Size(max = 100)
    private String clave;

    @Size(max = 100)
    private String claveTem;

    @Size(max = 150)
    private String link;

    private Boolean status;

    private Integer userCreate;

    private Integer userUpdate;

    private Integer userDelete;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;

    private List<UsuarioRol> tbUsuarioRolList;

}
