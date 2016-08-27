package es.flaviojmend.service;

import es.flaviojmend.persistence.entity.Comment;
import es.flaviojmend.persistence.repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flavio.mendes on 23/08/2016.
 */
@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public void saveComment(Comment comment) {

//        if(employee.getName() == null) {
//            throw new Exception("Não pode ter nome nulo");
//        }
//        employee.setRegistrationNumber(geraMatricula());
        commentRepository.save(comment);
    }


    public Iterable<Comment> listComment(){
        return commentRepository.findAll();
    }

    public void deleteComment(Comment comment) {
        commentRepository.delete(comment);
    }

}
