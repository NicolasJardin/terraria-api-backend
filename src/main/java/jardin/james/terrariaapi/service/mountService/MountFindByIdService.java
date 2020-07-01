package jardin.james.terrariaapi.service.mountService;

import jardin.james.terrariaapi.model.MountEntity;
import jardin.james.terrariaapi.repository.MountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/24/2020 - 3:47PM
 */

@Service
public class MountFindByIdService {

    @Autowired
    public MountRepository mountRepository;

    public MountEntity findById(long id) {
        return this.mountRepository.findById(id).get();
    }
}
