package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Luis
 * on 09/10/2018.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
