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