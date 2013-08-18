package librosBiblioteca.modelo;


import java.util.Date;

/**
 * creamos los atributos del libro
 */
public class libro {

   private String isbn;
   private String titulo;
   private Date FechaPublicacion;
   private String autor;
   private int numeroEjemplares;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    @Override
    public String toString() {
        return "[" +  isbn +"] " + titulo;

    }
}
