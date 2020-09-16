package com.course.dbconnector.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book extends BaseEntity {
    private String title;
    private Author author;
    private Genre genre;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                " title='" + title + '\'' +
                " Author='" + author.getName() + '\'' +
                " Genre='" + genre.getName() + '\'' +
                '}';
    }

}
