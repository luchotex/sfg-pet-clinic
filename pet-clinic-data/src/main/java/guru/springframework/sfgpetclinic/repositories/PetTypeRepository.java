package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Luis
 * on 08/10/2018.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
