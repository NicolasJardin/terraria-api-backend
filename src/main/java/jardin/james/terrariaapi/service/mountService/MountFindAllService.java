package jardin.james.terrariaapi.service.mountService;

import jardin.james.terrariaapi.model.MountEntity;
import jardin.james.terrariaapi.repository.MountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/24/2020 - 3:39PM
 */

@Service
public class MountFindAllService {

    @Autowired
    public MountRepository mountRepository;

    public List<MountEntity> findAll() {
        return (List<MountEntity>) this.mountRepository.findAll();
    }
}
