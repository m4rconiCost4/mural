package es.flaviojmend.persistence.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by flavio on 19/07/16.
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idEmployee;
    private String name;
    private String lastName;
    private Integer registrationNumber;

@OneToMany (mappedBy = "employee")
private Collection<Post>posts;


    public Collection<Post> getPosts() {
        return posts;
    }

    public void setPosts(Collection<Post> posts) {
        this.posts = posts;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public Employee setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public Employee setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }
}
