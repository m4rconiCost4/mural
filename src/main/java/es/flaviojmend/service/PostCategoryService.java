package es.flaviojmend.service;

import es.flaviojmend.persistence.entity.PostCategory;
import es.flaviojmend.persistence.repo.PostCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flavio.mendes on 23/08/2016.
 */
@Service
public class PostCategoryService {

    @Autowired
    PostCategoryRepository postCategoryRepository;

    public void savePostCategory(PostCategory postCategory) {

//        if(employee.getName() == null) {
//            throw new Exception("Não pode ter nome nulo");
//        }
//        employee.setRegistrationNumber(geraMatricula());
        postCategoryRepository.save(postCategory);
    }


    public Iterable<PostCategory> listPostCategory(){
        return postCategoryRepository.findAll();
    }

    public void deletePostCategory(PostCategory postCategory) {
        postCategoryRepository.delete(postCategory);
    }

}
