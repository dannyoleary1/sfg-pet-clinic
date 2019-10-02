package danny.petclinic.sfgpetclinic.services;

import danny.petclinic.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}