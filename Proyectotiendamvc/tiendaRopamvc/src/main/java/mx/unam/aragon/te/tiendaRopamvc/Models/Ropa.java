package mx.unam.aragon.te.tiendaRopamvc.Models;

import java.util.Objects;

public class Ropa{
    private int precio;
    private String descripcion;
    private String nombre;
    private int id;
    private String imagen;

    public Ropa() {
    }

    public Ropa(int precio, String descripcion, String nombre, int id, String imagen) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.id = id;
        this.imagen = imagen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ropa ropa = (Ropa) o;
        return precio == ropa.precio && id == ropa.id && Objects.equals(descripcion, ropa.descripcion) && Objects.equals(nombre, ropa.nombre) && Objects.equals(imagen, ropa.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio, descripcion, nombre, id, imagen);
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}