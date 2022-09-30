package SpingbootG2.AppBdSpingbootG2.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LineasDeCredito")
public class LineaDeCreditos {
    @Id
    private int codigolinea;
    @Column(nullable = false, unique = true, length = 30)
    private String nombrelinea;
    private int montomaximo;
    private int plazomaximo;

    public LineaDeCreditos(int codigolinea, String nombrelinea, int montomaximo, int plazomaximo) {
        this.codigolinea = codigolinea;
        this.nombrelinea = nombrelinea;
        this.montomaximo = montomaximo;
        this.plazomaximo = plazomaximo;
    }

    public LineaDeCreditos() {
    }

    public int getCodigolinea() {
        return codigolinea;
    }

    public void setCodigolinea(int codigolinea) {
        this.codigolinea = codigolinea;
    }

    public String getNombrelinea() {
        return nombrelinea;
    }

    public void setNombrelinea(String nombrelinea) {
        this.nombrelinea = nombrelinea;
    }

    public int getMontomaximo() {
        return montomaximo;
    }

    public void setMontomaximo(int montomaximo) {
        this.montomaximo = montomaximo;
    }

    public int getPlazomaximo() {
        return plazomaximo;
    }

    public void setPlazomaximo(int plazomaximo) {
        this.plazomaximo = plazomaximo;
    }
}
