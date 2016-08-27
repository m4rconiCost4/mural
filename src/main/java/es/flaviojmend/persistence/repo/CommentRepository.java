package es.flaviojmend.persistence.repo;

import es.flaviojmend.persistence.entity.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by flavio on 19/07/16.
 */
public interface CommentRepository extends CrudRepository<Comment, Long> {


}
