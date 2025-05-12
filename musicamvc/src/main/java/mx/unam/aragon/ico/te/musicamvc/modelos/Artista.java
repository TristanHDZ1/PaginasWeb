package mx.unam.aragon.ico.te.musicamvc.modelos;

import java.util.Objects;

public class Artista {
    private String nombre;
    private int edad;
    private String genero;
    private String descripcion;
    private String imagen;

    public Artista() {
    }

    public Artista(String nombre, int edad, String genero, String descripcion, String imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return edad == artista.edad && Objects.equals(nombre, artista.nombre) && Objects.equals(genero, artista.genero) && Objects.equals(descripcion, artista.descripcion) && Objects.equals(imagen, artista.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, genero, descripcion, imagen);
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
