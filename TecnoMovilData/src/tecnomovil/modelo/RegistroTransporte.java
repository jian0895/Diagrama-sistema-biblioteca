package tecnomovil.modelo;

import java.time.LocalDateTime;

public class RegistroTransporte {

    // Atributos
    private int idUsuario;
    private String ruta;
    private String estacion;
    private String accion;
    private LocalDateTime timestamp;

    // Constructor vacío
    public RegistroTransporte() {

    }

    // Constructor con parámetros
    public RegistroTransporte(int idUsuario,
                            String ruta,
                            String estacion,
                            String accion,
                            LocalDateTime timestamp) {

        this.idUsuario = idUsuario;
        this.ruta = ruta;
        this.estacion = estacion;
        this.accion = accion;
        this.timestamp = timestamp;
    }

    // Getters y Setters

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
