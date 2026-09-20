public class Direccion {

    // 1. Atributos
    private String calle;
    private String carrera;
    private String barrio;

    // 2. Constructores
    public Direccion() {
    }

    public Direccion(String calle, String carrera, String barrio) {
        this.calle = calle;
        this.carrera = carrera;
        this.barrio = barrio;
    }

    // 3. Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}