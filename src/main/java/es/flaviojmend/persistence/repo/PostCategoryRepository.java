package es.flaviojmend.persistence.repo;

import es.flaviojmend.persistence.entity.Employee;
import es.flaviojmend.persistence.entity.PostCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by flavio on 19/07/16.
 */
public interface PostCategoryRepository extends CrudRepository<PostCategory, Long> {



}

