package danny.petclinic.sfgpetclinic.repositories;

import danny.petclinic.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
