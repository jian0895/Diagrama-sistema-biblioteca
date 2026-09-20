public class Autor {

    // 1. Atributos
    private String idAutor;
    private String nombre;
    private String nacionalidad;

    // 2. Constructores
    public Autor() {
    }

    public Autor(String idAutor, String nombre, String nacionalidad) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // 3. Getters y Setters
    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}