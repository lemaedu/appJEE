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
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    private Short idMenu;

    @Size(max = 50)
    private String nombre;

    @Size(max = 75)
    private String img;

    private Boolean status;

    private Integer userCreate;

    private Integer userUpdate;

    private Integer userDelete;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;

    private UbicacionMenu idUbicacionMenu;

    private List<Opcion> tbOpcionList;

}
