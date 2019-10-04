package danny.petclinic.sfgpetclinic.repositories;

import danny.petclinic.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
