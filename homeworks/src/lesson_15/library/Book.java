package lesson_15.library;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Book {

    private String title;
    private String author;
    private String genre;
    private String description;
    private boolean onlyReadingRoom;

    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.genre = book.genre;
        this.description = book.description;
        this.onlyReadingRoom = book.onlyReadingRoom;
    }
}
