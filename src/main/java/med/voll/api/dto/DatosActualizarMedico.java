package med.voll.api.dto;

import jakarta.validation.constraints.NotNull;
import med.voll.api.model.DatosDireccion;

public record DatosActualizarMedico(
        @NotNull Long id,
        String nombre,
        String documento,
        DatosDireccion direccion) {
}
