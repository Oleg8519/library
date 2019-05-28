package mylibrary.restservice.repository;

import mylibrary.restservice.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/readers")
public interface UserRepository extends JpaRepository<Reader, String> {

}
