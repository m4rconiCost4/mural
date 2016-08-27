package es.flaviojmend.service;

import es.flaviojmend.persistence.entity.Post;
import es.flaviojmend.persistence.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flavio.mendes on 23/08/2016.
 */
@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public void savePost(Post post) {

//        if(employee.getName() == null) {
//            throw new Exception("Não pode ter nome nulo");
//        }
//        employee.setRegistrationNumber(geraMatricula());
        postRepository.save(post);
    }


    public Iterable<Post> listPost(){
        return postRepository.findAll();
    }

    public void deletePost(Post post) {
        postRepository.delete(post);
    }

}
