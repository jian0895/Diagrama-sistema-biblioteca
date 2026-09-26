package tecnomovil.servicio;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import tecnomovil.modelo.RegistroTransporte;

public class ProcesadorTransporte {

    // Afluencia por estación
    public Map<String, Long> calcularAfluenciaPorEstacion(
            List<RegistroTransporte> registros) {

        return registros.stream()

                .filter(registro -> registro.getAccion().equalsIgnoreCase("entrada"))

                .collect(Collectors.groupingBy(
                        RegistroTransporte::getEstacion,
                        Collectors.counting()));
    }

    // Rutas más utilizadas
    public Map<String, Long> obtenerRutasMasUtilizadas(
            List<RegistroTransporte> registros) {

        return registros.stream()

                .collect(Collectors.groupingBy(
                        RegistroTransporte::getRuta,
                        Collectors.counting()));
    }

    // Horas pico
    public Map<Integer, Long> obtenerHorasPico(
            List<RegistroTransporte> registros) {

        return registros.stream()

                .collect(Collectors.groupingBy(
                        registro -> registro.getTimestamp().getHour(),
                        Collectors.counting()));
    }

    // Patrones de viaje
    public Map<Integer, List<String>> obtenerPatronesViaje(
            List<RegistroTransporte> registros) {

        return registros.stream()

                .collect(Collectors.groupingBy(
                        RegistroTransporte::getIdUsuario,

                        Collectors.mapping(
                                RegistroTransporte::getEstacion,
                                Collectors.toList())));
    }

    // Rutas críticas
    public Set<String> detectarRutasCriticas(
            List<RegistroTransporte> registros,
            long umbral) {

        return registros.stream()

                .collect(Collectors.groupingBy(
                        RegistroTransporte::getRuta,
                        Collectors.counting()))

                .entrySet()

                .stream()

                .filter(ruta -> ruta.getValue() > umbral)

                .map(ruta -> ruta.getKey())

                .collect(Collectors.toSet());
    }

    // Tiempo promedio entre registros
    public double calcularTiempoPromedio(
            List<RegistroTransporte> registros) {

        List<RegistroTransporte> ordenados = registros.stream()

                .sorted(Comparator.comparing(
                        RegistroTransporte::getTimestamp))

                .collect(Collectors.toList());

        if (ordenados.size() < 2) {
            return 0;
        }

        long totalMinutos = 0;

        for (int i = 1; i < ordenados.size(); i++) {

            Duration diferencia = Duration.between(
                    ordenados.get(i - 1).getTimestamp(),
                    ordenados.get(i).getTimestamp());

            totalMinutos += diferencia.toMinutes();
        }

        return (double) totalMinutos / (ordenados.size() - 1);
    }
}