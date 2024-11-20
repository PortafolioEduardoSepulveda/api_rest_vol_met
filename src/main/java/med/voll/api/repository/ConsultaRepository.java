package med.voll.api.repository;

import med.voll.api.consulta.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta,Long> {
    boolean existsByMedicoIdAndFecha(Long idMedico, LocalDateTime fecha);

    boolean existsByPacienteIdAndFechaBetween(Long idPaciente, LocalDateTime primerHorario, LocalDateTime ultimoHorario);
}
