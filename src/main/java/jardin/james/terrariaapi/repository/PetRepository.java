package jardin.james.terrariaapi.repository;

import jardin.james.terrariaapi.model.PetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/22/2020 - 2:00PM
 */

@Repository
public interface PetRepository extends CrudRepository<PetEntity, Long> {
}
