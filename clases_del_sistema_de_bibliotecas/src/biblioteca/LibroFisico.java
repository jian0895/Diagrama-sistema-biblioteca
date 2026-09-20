public class LibroFisico extends Libro {

    // 1. Atributos
    private String numeroEstante;

    // 2. Constructores
    public LibroFisico() {
    }

    public LibroFisico(String idLibro, String titulo, Autor autor,
                       boolean disponible, String generoLiterario,
                       String numeroEstante) {

        super(idLibro, titulo, autor, disponible, generoLiterario);

        this.numeroEstante = numeroEstante;
    }

    // 3. Getters y Setters
    public String getNumeroEstante() {
        return numeroEstante;
    }

    public void setNumeroEstante(String numeroEstante) {
        this.numeroEstante = numeroEstante;
    }

    // 4. Sobrescritura
    @Override
    public String obtenerInstruccionesAcceso() {
        return "Ubique el libro en el estante: " + numeroEstante;
    }
}