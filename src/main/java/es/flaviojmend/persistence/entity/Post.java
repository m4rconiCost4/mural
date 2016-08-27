package es.flaviojmend.persistence.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by hell on 25/08/2016.
 */
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPost;

    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_post_category")
    private PostCategory postCategory;
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee employee;
    @OneToMany(mappedBy = "post")
    private Collection<Comment> comment;


    public Collection<Comment> getComment() {
        return comment;
    }

    public void setComment(Collection<Comment> comment) {
        this.comment = comment;
    }

    public Post setId(Long idPost) {
        this.idPost = idPost;
        return this;
    }

    public Long getIdPost() {
        return idPost;
    }

    public void setIdPost(Long idPost) {
        this.idPost = idPost;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Post setDescription(String description) {
        this.description = description;
        return this;
    }

    public PostCategory getPostCategory() {
        return postCategory;
    }

    public void setPostCategory(PostCategory postCategory) {
        this.postCategory = postCategory;
    }
}