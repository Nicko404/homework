package lesson_10.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
//Возможно логику методов можно сделать намного проще, но я ПОКА ЧТО не знаю как
    public void addBook(Book book) {
        boolean isBookInLibrary = false;
        for (Book b : books) {
            if (b.id == book.id) {
                isBookInLibrary = true;
                break;
            }
        }
        if (isBookInLibrary) {
            System.out.println("Такая книга в списке есть.");
        } else {
            books.add(book);
            System.out.println("Книга успешно добавлена в список.");
        }
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void deleteBook(int id) {
        boolean isBookInLibrary = false;
        for (Book book : books) {
            if (book.id == id) {
                books.remove(book);
                isBookInLibrary = true;
                break;
            }
        }

        if (isBookInLibrary) {
            System.out.println("Книга успешно удалена из списка.");
        } else {
            System.out.println("Книги с таким 'id' нет в списке.");
        }
    }

    public void editBook(int id, String title, String genre) {
        boolean isBoolInLibrary = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {
                books.get(i).genre = genre;
                books.get(i).title = title;
                isBoolInLibrary = true;
                break;
            }
        }

        if (isBoolInLibrary) {
            System.out.println("Книга успешно изменена.");
        } else {
            System.out.println("Книги в списке нет.");
        }
    }
}
