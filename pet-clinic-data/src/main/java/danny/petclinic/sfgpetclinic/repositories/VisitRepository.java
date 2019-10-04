package danny.petclinic.sfgpetclinic.repositories;

import danny.petclinic.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
