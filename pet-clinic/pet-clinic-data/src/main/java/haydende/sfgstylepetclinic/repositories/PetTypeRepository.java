package haydende.sfgstylepetclinic.repositories;

import haydende.sfgstylepetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

    PetType save(PetType type);

    void delete(PetType type);

    void deleteById(Long id);

}
