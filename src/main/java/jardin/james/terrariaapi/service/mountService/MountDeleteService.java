package jardin.james.terrariaapi.service.mountService;

import jardin.james.terrariaapi.repository.MountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/24/2020 - 3:34PM
 */

@Service
public class MountDeleteService {

    @Autowired
    public MountRepository mountRepository;

    public void delete(long id) {
        this.mountRepository.deleteById(id);
    }
}
