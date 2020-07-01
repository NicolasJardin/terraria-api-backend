package jardin.james.terrariaapi.service.petService;

import jardin.james.terrariaapi.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/22/2020 - 3:00PM
 */

@Service
public class PetDeleteService {

    @Autowired
    public PetRepository petRepository;

    public void delete(long id) {
        this.petRepository.deleteById(id);
    }
}
