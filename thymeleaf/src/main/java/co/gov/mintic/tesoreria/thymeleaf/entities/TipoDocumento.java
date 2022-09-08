package co.gov.mintic.tesoreria.thymeleaf.entities;

import javax.persistence.*;

@Entity
@Table(name = "tipos_documentos")
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_documento")
    private long idTipoDocumento;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "siglas", nullable = false)
    private String siglas;
    @Column(name = "estado")
    private boolean estado;

    public long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "idTipoDocumento=" + idTipoDocumento +
                ", descripcion='" + descripcion + '\'' +
                ", siglas='" + siglas + '\'' +
                ", estado=" + estado +
                '}';
    }
}
