package med.voll.api.consulta.validacion;

import med.voll.api.dto.DatosReservaConsulta;
import med.voll.api.infra.errores.ValidacionException;
import med.voll.api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class ValidadorPacienteActivo implements ValidadorDeConsultas {
    @Autowired
    private PacienteRepository repository;

    public void validar(DatosReservaConsulta datos){
        var pacienteEstaActivo = repository.findActivoById(datos.idPaciente());
        if(!pacienteEstaActivo){
            throw new ValidacionException("Consulta no puede ser reservada con paciente excluido");
        }
    }
}
