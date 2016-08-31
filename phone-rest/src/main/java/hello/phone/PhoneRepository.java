package hello.phone;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by asaxena on 8/16/16.
 */
//@RepositoryRestResource(collectionResourceRel = "phones", path = "phones")
@Repository
public interface PhoneRepository extends MongoRepository<Phone, String> {

  //List<Phone> findAll();

}
