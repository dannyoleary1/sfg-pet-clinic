package danny.petclinic.sfgpetclinic.repositories;

import danny.petclinic.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
