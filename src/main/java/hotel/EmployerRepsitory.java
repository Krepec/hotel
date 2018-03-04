package hotel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployerRepsitory extends CrudRepository<EmployerSpringJPA, Long> {

}
