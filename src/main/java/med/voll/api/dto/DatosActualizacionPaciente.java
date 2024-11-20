package med.voll.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import med.voll.api.model.DatosDireccion;

public record DatosActualizacionPaciente(
        Long id,
        String nombre,
        @Email String email,
        String telefono,
        String documentoIdentidad,
        @Valid DatosDireccion direccion
) {
}
