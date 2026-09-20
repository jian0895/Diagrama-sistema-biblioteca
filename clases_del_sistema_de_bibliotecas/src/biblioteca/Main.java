
// iniciamos los archivos .java para el proyecto de la biblioteca
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Direccion
        Direccion direccion = new Direccion(
                "Calle 81",
                "Carrera 87-13",
                "robledo el diamante");

        // Autor
        Autor autor = new Autor(
                "A01",
                "Gabriel Garcia Marquez",
                "Colombiana");

        // Bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario(
                "U01",
                "Ana",
                "Lopez",
                "3000000000",
                "ana@correo.com",
                direccion,
                "E01",
                "Mañana");

        // Libros
        LibroDigital libroDigital = new LibroDigital(
                "L01",
                "Cien Años de Soledad",
                autor,
                true,
                "Novela",
                25.5,
                "PDF");

        LibroFisico libroFisico = new LibroFisico(
                "L02",
                "El Amor en los Tiempos del Colera",
                autor,
                true,
                "Novela",
                "A-12");

        // Polimorfismo
        List<Libro> libros = new ArrayList<>();

        libros.add(libroDigital);
        libros.add(libroFisico);

        // Usuario con prestamos
        UsuarioConPrestamos usuario = new UsuarioConPrestamos(
                "U02",
                "Julian",
                "Muñoz",
                "3111111111",
                "julian@correo.com",
                direccion);

        // Prestamo
        Prestamo prestamo = new Prestamo(
                "20/09/2026",
                "20/10/2026",
                libroFisico,
                bibliotecario);

        usuario.agregarPrestamo(prestamo);

        // Salidas en consola para demostrar que los objetos se crearon correctamente
        System.out.println("=== SISTEMA DE BIBLIOTECA ===");

        System.out.println("Autor creado correctamente");

        System.out.println("Bibliotecario creado correctamente");

        System.out.println("Libro digital creado correctamente");

        System.out.println("Libro fisico creado correctamente");

        System.out.println("Prestamo registrado correctamente");

        }
}