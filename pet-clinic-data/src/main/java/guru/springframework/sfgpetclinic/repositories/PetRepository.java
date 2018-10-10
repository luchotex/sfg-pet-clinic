package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Luis
 * on 08/10/2018.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
