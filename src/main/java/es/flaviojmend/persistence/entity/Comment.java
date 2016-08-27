package es.flaviojmend.persistence.entity;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Created by marconi.junior on 26/08/2016.
 */
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idComment;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "id_post")
    private Post post;
    @ManyToOne
    @JoinColumn(name="employee_id_employee")
    private Employee employee;

    public Integer getIdComment() {
        return idComment;
    }

    public void setIdComment(Integer idComment) {
        this.idComment = idComment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
