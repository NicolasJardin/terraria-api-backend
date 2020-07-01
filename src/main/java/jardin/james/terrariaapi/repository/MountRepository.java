package jardin.james.terrariaapi.repository;

import jardin.james.terrariaapi.model.MountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/24/2020 - 3:27PM
 */

@Repository
public interface MountRepository extends CrudRepository<MountEntity, Long> {
}
