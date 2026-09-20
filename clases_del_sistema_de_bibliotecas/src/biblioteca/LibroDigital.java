public class LibroDigital extends Libro {

    // 1. Atributos
    private double tamanoArchivoMB;
    private String formato;

    // 2. Constructores
    public LibroDigital() {
    }

    public LibroDigital(String idLibro, String titulo, Autor autor,
                         boolean disponible, String generoLiterario,
                         double tamanoArchivoMB, String formato) {

        super(idLibro, titulo, autor, disponible, generoLiterario);

        this.tamanoArchivoMB = tamanoArchivoMB;
        this.formato = formato;
    }

    // 3. Getters y Setters
    public double getTamanoArchivoMB() {
        return tamanoArchivoMB;
    }

    public void setTamanoArchivoMB(double tamanoArchivoMB) {
        this.tamanoArchivoMB = tamanoArchivoMB;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    // 4. Sobrescritura
    @Override
    public String obtenerInstruccionesAcceso() {
        return "Acceda al libro mediante la plataforma digital.";
    }
}