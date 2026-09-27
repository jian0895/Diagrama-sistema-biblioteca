package tecnomovil.principal;

import java.time.LocalDateTime;
import java.util.List;

import tecnomovil.modelo.RegistroTransporte;
import tecnomovil.servicio.ProcesadorTransporte;

public class Main {

    public static void main(String[] args) {

        List<RegistroTransporte> registros = List.of(

                new RegistroTransporte(1, "Ruta A", "Central", "entrada",
                        LocalDateTime.of(2026, 9, 25, 8, 10)),

                new RegistroTransporte(2, "Ruta A", "Central", "entrada",
                        LocalDateTime.of(2026, 9, 25, 8, 15)),

                new RegistroTransporte(3, "Ruta B", "Norte", "entrada",
                        LocalDateTime.of(2026, 9, 25, 8, 30)),

                new RegistroTransporte(1, "Ruta A", "Sur", "salida",
                        LocalDateTime.of(2026, 9, 25, 9, 0)),

                new RegistroTransporte(4, "Ruta C", "Occidente", "entrada",
                        LocalDateTime.of(2026, 9, 25, 9, 15)),

                new RegistroTransporte(5, "Ruta B", "Norte", "entrada",
                        LocalDateTime.of(2026, 9, 25, 10, 5)),

                new RegistroTransporte(6, "Ruta B", "Norte", "entrada",
                        LocalDateTime.of(2026, 9, 25, 10, 20)),

                new RegistroTransporte(2, "Ruta A", "Centro", "salida",
                        LocalDateTime.of(2026, 9, 25, 11, 0)),

                new RegistroTransporte(7, "Ruta C", "Terminal", "entrada",
                        LocalDateTime.of(2026, 9, 25, 12, 15)),

                new RegistroTransporte(8, "Ruta A", "Central", "entrada",
                        LocalDateTime.of(2026, 9, 25, 18, 0)),

                new RegistroTransporte(9, "Ruta A", "Central", "entrada",
                        LocalDateTime.of(2026, 9, 25, 18, 5)),

                new RegistroTransporte(10, "Ruta A", "Central", "entrada",
                        LocalDateTime.of(2026, 9, 25, 18, 10)),

                new RegistroTransporte(11, "Ruta B", "Norte", "entrada",
                        LocalDateTime.of(2026, 9, 25, 18, 20)),

                new RegistroTransporte(12, "Ruta C", "Terminal", "entrada",
                        LocalDateTime.of(2026, 9, 25, 19, 0)),

                new RegistroTransporte(13, "Ruta C", "Terminal", "entrada",
                        LocalDateTime.of(2026, 9, 25, 19, 10))
        );

        ProcesadorTransporte procesador = new ProcesadorTransporte();

        System.out.println("=== AFLUENCIA POR ESTACION ===");
        System.out.println(
                procesador.calcularAfluenciaPorEstacion(registros));

        System.out.println("\n=== RUTAS MAS UTILIZADAS ===");
        System.out.println(
                procesador.obtenerRutasMasUtilizadas(registros));

        System.out.println("\n=== HORAS PICO ===");
        System.out.println(
                procesador.obtenerHorasPico(registros));

        System.out.println("\n=== PATRONES DE VIAJE ===");
        System.out.println(
                procesador.obtenerPatronesViaje(registros));

        System.out.println("\n=== RUTAS CRITICAS ===");
        System.out.println(
                procesador.detectarRutasCriticas(registros, 4));

        System.out.println("\n=== TIEMPO PROMEDIO ENTRE REGISTROS ===");
        System.out.println(
                procesador.calcularTiempoPromedio(registros)
                        + " minutos");
    }
}
