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
public class Opcion implements Serializable {

    private static final long serialVersionUID = 1L;

    private Short idOpcion;

    @Size(max = 50)
    private String nombre;

    @Size(max = 150)
    private String link;

    @Size(max = 100)
    private String img;

    private Short orden;

    private Boolean status;

    private Integer userCreate;

    private Integer userUpdate;

    private Integer userDelete;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;

    private List<Acceso> tbAccesoList;

    private Menu idMenu;

}
