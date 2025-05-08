package com.example.fragment.noticias;

public class Noticia {
    private String imagen;
    private String titulo;
    private String descripcion;
    private String origen;

    public Noticia(String imagen, String descripcion, String titulo, String origen) {
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.origen = origen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrigen() { return origen; }

    public void setOrigen(String origen) { this.origen = origen;}
}
