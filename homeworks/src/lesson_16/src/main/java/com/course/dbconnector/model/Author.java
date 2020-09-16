package com.course.dbconnector.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author extends BaseEntity {
    private String name;

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                " name='" + name + '\'' +
                '}';
    }
}
