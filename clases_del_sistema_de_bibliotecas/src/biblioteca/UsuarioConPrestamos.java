import java.util.ArrayList;
import java.util.List;

public class UsuarioConPrestamos extends Usuario {

    // 1. Atributos
    private List<Prestamo> prestamos;

    // 2. Constructores
    public UsuarioConPrestamos() {
        prestamos = new ArrayList<>();
    }

    public UsuarioConPrestamos(String idUsuario,
                               String nombre,
                               String apellido,
                               String telefono,
                               String correoElectronico,
                               Direccion direccion) {

        super(idUsuario, nombre, apellido,
              telefono, correoElectronico,
              direccion);

        prestamos = new ArrayList<>();
    }

    // 3. Métodos del UML
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void removerPrestamo(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
}