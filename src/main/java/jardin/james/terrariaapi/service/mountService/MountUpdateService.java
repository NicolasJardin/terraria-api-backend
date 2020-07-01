package jardin.james.terrariaapi.service.mountService;

import jardin.james.terrariaapi.model.MountEntity;
import jardin.james.terrariaapi.repository.MountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/24/2020 - 4:00PM
 */

@Service
public class MountUpdateService {

    @Autowired
    public MountRepository mountRepository;

    public MountEntity update(MountEntity mountEntity) {
        return this.mountRepository.save(mountEntity);
    }
}
