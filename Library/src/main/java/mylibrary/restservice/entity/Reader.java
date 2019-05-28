package mylibrary.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reader {

    @Id

    private String name;


    public Reader() {
    }

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                '}';
    }
}
