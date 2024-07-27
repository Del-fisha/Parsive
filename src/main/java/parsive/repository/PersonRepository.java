package parsive.repository;

import org.springframework.data.repository.CrudRepository;
import parsive.models.Person;

import java.util.UUID;

public interface PersonRepository extends CrudRepository<Person, UUID> {

    @Override
    boolean existsById(UUID uuid);

}
