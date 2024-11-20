package med.voll.api.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.model.Especialidad;

import java.time.LocalDateTime;

public record DatosReservaConsulta(
        Long idMedico,
        @NotNull
        Long idPaciente,
        @NotNull
        @Future
        LocalDateTime fecha,
        Especialidad especialidad
) {
}
