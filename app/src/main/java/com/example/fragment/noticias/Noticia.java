package com.example.fragment.noticias;

public class Noticia {
    private String imagen;
    private String titulo;
    private String descripcion;

    public Noticia(String imagen, String descripcion, String titulo) {
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.titulo = titulo;
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
}
