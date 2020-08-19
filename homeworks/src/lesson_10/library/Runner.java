package lesson_10.library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book(1, "Мертвые души", "Поэма");
        Book b2 = new Book(2, "Крестный отец", "Драма");
        Book b3 = new Book(3, "Омерта", "Роман");
        Book b4 = new Book(4, "Скотный двор", "Повесть");
        Book b5 = new Book(5, "Поймай меня, если сможешь", "Преступление");
        Book b6 = new Book(6, "Монстр Франкенштейна", "Фантастика");
        Book b7 = new Book(7, "Тонкое искуство пифигизма", "Саморазвитие");
        Book b8 = new Book(8, "Мастер и Маргарита", "Роман");
        Book b9 = new Book(9, "Ведьмак", "Фэнтези");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);
        library.addBook(b6);
        library.addBook(b7);
        library.addBook(b8);
        library.addBook(b9);

        List<Book> books = new ArrayList<>(library.getAllBooks());

        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.title.toString().compareTo(o2.title.toString());
            }
        });

        for (Book b : books) {
            System.out.println(b);
        }

        library.deleteBook(5);

        books = library.getAllBooks();

        for (Book b : books) {
            System.out.println(b);
        }

        library.editBook(2, "Мотылек", "Драма");


        books = library.getAllBooks();
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getId() - o1.getId();
            }
        });

        for (Book b : books) {
            System.out.println(b);
        }

    }
}
