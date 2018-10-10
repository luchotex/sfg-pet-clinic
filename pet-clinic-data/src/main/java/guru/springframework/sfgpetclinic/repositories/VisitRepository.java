package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Luis
 * on 09/10/2018.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
