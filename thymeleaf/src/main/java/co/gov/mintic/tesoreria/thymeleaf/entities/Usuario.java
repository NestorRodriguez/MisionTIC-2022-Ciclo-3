package co.gov.mintic.tesoreria.thymeleaf.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import java.io.Serializable;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long idUsuario;
    @javax.validation.constraints.NotEmpty
    @Column(name = "nombre")
    private String nombre;
    @javax.validation.constraints.NotEmpty
    @Column(name = "apellido")
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento tipoDocumento;

    @javax.validation.constraints.NotEmpty
    @Column(name = "cedula", unique = true)
    private String cedula;

    @Pattern(regexp = "[a-zA-Z0-9!#$%&'*_+-]([\\.]?[a-zA-Z0-9!#$%&'*_+-])+@[a-zA-Z0-9]([^@&%$\\/()=?¿!.,:;]|\\d)+[a-zA-Z0-9][\\.][a-zA-Z]{2,4}([\\.][a-zA-Z]{2})?" ,message = "Debe ser un correo electrónico válido")
    @Column(name = "correo", nullable = false)
    private String correo;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$" , message = "La contraseña debe contener minimo 8 caracteres, máximo 15, una letra mayúscula, una letra minuscula, un número, un caracter especial y sin espacios en blanco")
    @Column(name = "clave", nullable = false)
    private String clave;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_rol")
    private Rol rol;
    @NotNull
    @Column(name = "perfil")
    private Perfil perfil;

    @Column(name = "estado")
    private boolean estado;

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipoDocumento=" + tipoDocumento +
                ", cedula='" + cedula + '\'' +
                ", correo='" + correo + '\'' +
                ", clave='" + clave + '\'' +
                ", rol=" + rol +
                ", perfil=" + perfil +
                ", estado=" + estado +
                '}';
    }
}
