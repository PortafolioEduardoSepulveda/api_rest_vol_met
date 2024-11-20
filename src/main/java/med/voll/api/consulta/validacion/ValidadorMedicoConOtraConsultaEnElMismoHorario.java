package med.voll.api.consulta.validacion;

import med.voll.api.dto.DatosReservaConsulta;
import med.voll.api.infra.errores.ValidacionException;
import med.voll.api.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoConOtraConsultaEnElMismoHorario implements ValidadorDeConsultas {
    @Autowired
    private ConsultaRepository repository;

    public void validar(DatosReservaConsulta datos){
        var medicoTieneOtraConsultaEnElMismoHorario = repository.existsByMedicoIdAndFecha(datos.idMedico(), datos.fecha());
        if(medicoTieneOtraConsultaEnElMismoHorario){
            throw new ValidacionException("Medico ya tiene otra consulta en esa misma fecha y hora");
        }
    }
}
