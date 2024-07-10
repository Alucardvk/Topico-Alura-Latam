package com.example.crud.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "db_Topico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Título del tópico.
    @Column(nullable = false, length = 255)
    private String titulo;

    // Contenido o mensaje del tópico.
    @Column(nullable = false, columnDefinition = "TEXT")
    private String mensaje;

    // Fecha y hora en que el tópico fue creado.
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    private Date fechaCreacion = new Date();

    // Estado actual del tópico.
    @Column(nullable = false, length = 50)
    private String status;

    // Autor del tópico.
    @Column(nullable = false, length = 255)
    private String autor;

    // Curso al que pertenece el tópico.
    @Column(nullable = false, length = 255)
    private String curso;

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
