package danny.petclinic.sfgpetclinic.repositories;

import danny.petclinic.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
