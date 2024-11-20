package med.voll.api.dto;

import med.voll.api.model.Paciente;

public record DatosListaPaciente(String nombre, String email, String documentoIdentidad) {
    public DatosListaPaciente(Paciente paciente) {
        this(paciente.getNombre(), paciente.getEmail(), paciente.getDocumentoIdentidad());
    }
}
