package projeto.repository;

import projeto.dto.TurmaDTO;
import projeto.entity.Turma;

import java.util.List;

public class TurmaRepository extends GenericRepository {

    public List<TurmaDTO> consultarTurmas() {
        return entityManager.createNamedQuery(Turma.GET_TURMASDTO, TurmaDTO.class)
                .getResultList();
    }
}
