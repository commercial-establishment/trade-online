package kz.hts.to.entity;

import javax.persistence.Entity;

@Entity
public class City extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
