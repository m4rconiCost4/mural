package es.flaviojmend.persistence.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by marconi.junior on 26/08/2016.
 */
@Entity
public class PostCategory {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idPostCategory;
    private String name;


    public Integer getIdPostCategory() {
        return idPostCategory;
    }

    public void setIdPostCategory(Integer idPostCategory) {
        this.idPostCategory = idPostCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
