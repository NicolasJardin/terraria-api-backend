package jardin.james.terrariaapi.service.petService;

import jardin.james.terrariaapi.model.PetEntity;
import jardin.james.terrariaapi.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/22/2020 - 3:00PM
 */

@Service
public class PetUpdateService {

    @Autowired
    public PetRepository petRepository;

    public PetEntity update(PetEntity petEntity) {
        return this.petRepository.save(petEntity);
    }
}
