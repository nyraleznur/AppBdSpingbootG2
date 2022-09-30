package SpingbootG2.AppBdSpingbootG2.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="creditos")
public class Credito {
    @Id
    private int codigocredito;
    @Column(nullable = false)
    private int montoprestado;
    @Column(nullable = false)
    private int plazoprestamo;
    private Date fecha;
    @ManyToOne
    @JoinColumn(name="documentocliente",nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="codigodelinea", nullable = false)
    private LineaDeCreditos lineas;







}
