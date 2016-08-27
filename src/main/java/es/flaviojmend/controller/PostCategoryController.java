package es.flaviojmend.controller;

import es.flaviojmend.persistence.entity.PostCategory;
import es.flaviojmend.service.PostCategoryService;
import es.flaviojmend.persistence.repo.PostCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by flavio.mendes on 22/08/2016.
 */

@RestController
@RequestMapping("/postC")
public class PostCategoryController {


    @Autowired
    PostCategoryService postCategoryService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<PostCategory> get() {
        return postCategoryService.listPostCategory();
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody PostCategory postCategory) {
        postCategoryService.savePostCategory(postCategory);

        HttpHeaders httpHeaders = new HttpHeaders();

        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@RequestBody PostCategory postCategory) {
        HttpHeaders httpHeaders = new HttpHeaders();
        if(postCategory.getIdPostCategory() == null) {
            return new ResponseEntity<>(null, httpHeaders, HttpStatus.BAD_REQUEST);
        }

        postCategoryService.savePostCategory(postCategory);


        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<?>  delete(@RequestBody PostCategory postCategory) {
        postCategoryService.deletePostCategory(postCategory);
        HttpHeaders httpHeaders = new HttpHeaders();
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.OK);
    }

}