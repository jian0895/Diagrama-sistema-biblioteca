public class Bibliotecario extends Usuario {

    // 1. Atributos
    private String idEmpleado;
    private String turnoTrabajo;

    // 2. Constructores
    public Bibliotecario() {
    }

    public Bibliotecario(String idUsuario, String nombre,
                         String apellido, String telefono,
                         String correoElectronico,
                         Direccion direccion,
                         String idEmpleado,
                         String turnoTrabajo) {

        super(idUsuario, nombre, apellido,
              telefono, correoElectronico,
              direccion);

        this.idEmpleado = idEmpleado;
        this.turnoTrabajo = turnoTrabajo;
    }

    // 3. Getters y Setters
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getTurnoTrabajo() {
        return turnoTrabajo;
    }

    public void setTurnoTrabajo(String turnoTrabajo) {
        this.turnoTrabajo = turnoTrabajo;
    }
}
