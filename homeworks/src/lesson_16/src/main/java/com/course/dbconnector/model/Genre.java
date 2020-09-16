package com.course.dbconnector.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Genre extends BaseEntity {
    private String name;

    @Override
    public String toString() {
        return "Genre{" +
                "id='" + id + '\'' +
                " name='" + name + '\'' +
                '}';
    }
}
