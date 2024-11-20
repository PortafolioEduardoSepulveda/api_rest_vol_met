package med.voll.api.consulta.validacion;

import med.voll.api.dto.DatosReservaConsulta;
import med.voll.api.infra.errores.ValidacionException;
import med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoActivo implements ValidadorDeConsultas {
    @Autowired
    private MedicoRepository repositrory;

    public void validar(DatosReservaConsulta datos) {
        //eleccion del medico opcional
        if(datos.idMedico() == null) {
            return;
        }
        var medicoEstaActivo = repositrory.findActivoById(datos.idMedico());
        if(!medicoEstaActivo){
            throw new ValidacionException("Consulta no puede ser reservada con medico excluido");
        }
    }
}
