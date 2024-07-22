package parsive.repository;

import parsive.models.Unit;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.UUID;

public interface DBRepository extends CrudRepository<Unit, UUID> {

    public Iterable<Unit> findByUpdateDate(LocalDateTime updateDate);

    public Iterable<Unit> findByParentId(UUID id);

    public boolean existsByParentId(UUID id);

/*    @Query("SELECT type FROM Item AS i WHERE i.id= :id") просто будем иметь в виду, что есть такая возможность
    List<Unit> getChildren( @Param("id") UUID id);*/

}
