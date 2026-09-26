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