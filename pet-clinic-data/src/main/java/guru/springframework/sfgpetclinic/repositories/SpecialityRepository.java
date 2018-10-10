package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Luis
 * on 09/10/2018.
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
