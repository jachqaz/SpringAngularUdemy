package com.bolsadeideas.springboot.backend.apirest.models.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "no puede estar vacio")
    @Size(min = 4, max = 12, message = "el tamaño tiene que estar en 4 y 12")
    @Column(nullable = false)
    private String nombre;

    @NotEmpty(message = "no puede estar vacio")
    private String apellido;

    @NotEmpty(message = "No puede estar vacio")
    @Email(message = "no es una direccion de correo bien formada")
    @Column(nullable = false, unique = true)
    private String email;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @PrePersist
    public void prePersist() {
        createAt = new Date();
    }

}
