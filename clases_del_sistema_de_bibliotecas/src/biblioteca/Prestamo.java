public class Prestamo {

    // 1. Atributos
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Libro libro;
    private Bibliotecario bibliotecario;

    // 2. Constructores
    public Prestamo() {
    }

    public Prestamo(String fechaPrestamo,
                    String fechaDevolucion,
                    Libro libro,
                    Bibliotecario bibliotecario) {

        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.bibliotecario = bibliotecario;
    }

    // Sobrecarga de constructor
    public Prestamo(String fechaPrestamo,
                    Libro libro,
                    Bibliotecario bibliotecario) {

        this.fechaPrestamo = fechaPrestamo;
        this.libro = libro;
        this.bibliotecario = bibliotecario;
    }

    // 3. Getters y Setters
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
}