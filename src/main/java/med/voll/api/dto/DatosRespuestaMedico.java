package med.voll.api.dto;

import med.voll.api.model.DatosDireccion;

public record DatosRespuestaMedico(
        Long id,
        String nombre,
        String email,
        String telefono,
        String documento,
        DatosDireccion direccion
) {
}
