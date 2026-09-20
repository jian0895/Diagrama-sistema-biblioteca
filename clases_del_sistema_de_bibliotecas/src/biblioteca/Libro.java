public class Libro {

    // 1. Atributos
    protected String idLibro;
    protected String titulo;
    protected Autor autor;
    protected boolean disponible;
    protected String generoLiterario;

    // 2. Constructores
    public Libro() {
    }

    public Libro(String idLibro, String titulo, Autor autor,
                 boolean disponible, String generoLiterario) {

        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        this.generoLiterario = generoLiterario;
    }

    // 3. Getters y Setters
    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    // 4. Método del UML
    public String obtenerInstruccionesAcceso() {
        return "Consultar disponibilidad en la biblioteca.";
    }
}