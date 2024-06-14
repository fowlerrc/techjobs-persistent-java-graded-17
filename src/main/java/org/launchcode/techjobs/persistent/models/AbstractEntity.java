package org.launchcode.techjobs.persistent.models;




import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


import java.util.List;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity {


    @Id
    @GeneratedValue
    int id;


   @Size(min = 1, max = 500, message = "Name should not exceed 500 characters")
    @NotBlank (message = "Name section cannot be blank")
    private String name;



    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    public AbstractEntity() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public void setId(int id) {
        this.id = id;
    }
}
