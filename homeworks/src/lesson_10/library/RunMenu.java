package lesson_10.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RunMenu {
    public static void main(String[] args) {
        Library library = new Library();
        List<Book> books = new ArrayList<>();
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        int id;
        String title;
        String genre;
        String space;

        while (choice != 0) {
            System.out.println("0 - выход;\n" +
                    "1 - вывести все книги;\n" +
                    "2 - добавить книгу;\n" +
                    "3 - удалить книгу;\n" +
                    "4 - редактировать книгу;");
            System.out.print("Ваш выбор: ");
            choice = sc.nextInt();
            System.out.println();
            
            switch (choice) {
                case 0:
                    System.out.println("Программа завершена.");
                    break;

                case 1:
                    books = library.getAllBooks();
                    System.out.println("В каком порядке выводить книги?");
                    System.out.println("1 - по алфавиту(возрастания);\n" +
                            "2 - по алфавиту (убывание);\n" +
                            "3 - по добавлению (сначала старые, затем новые);\n");
                    System.out.print("Ваш выбор: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            books.sort(new Comparator<Book>() {
                                @Override
                                public int compare(Book o1, Book o2) {
                                    return o1.title.toString().compareTo(o2.title.toString());
                                }
                            });
                            for (Book b : books) {
                                System.out.println(b);
                            }
                            break;

                        case 2:
                            books.sort(new Comparator<Book>() {
                                @Override
                                public int compare(Book o1, Book o2) {
                                    return o2.title.toString().compareTo(o1.title.toString());
                                }
                            });
                            for (Book b : books) {
                                System.out.println(b);
                            }
                            break;

                        case 3:
                            books.sort(new Comparator<Book>() {
                                @Override
                                public int compare(Book o1, Book o2) {
                                    return o1.getId() - o2.getId();
                                }
                            });
                            for (Book b : books) {
                                System.out.println(b);
                            }
                            break;

                        default:
                            System.out.println("Ошибка ввода операции.");
                    }
                    break;

                case 2:
                    System.out.print("Введите 'id' книги: ");
                    id = sc.nextInt();
                    System.out.print("Введите название книги: ");
                    space = sc.nextLine();
                    title = sc.nextLine();
                    System.out.print("Введите жанр книги: ");
                    genre = sc.nextLine();
                    library.addBook(new Book(id, title, genre));
                    break;

                case 3:
                    System.out.print("Введите 'id' книги, которую нужно удалить: ");
                    library.deleteBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Введите 'id' книги, ктоторую нужно изменить: ");
                    id = sc.nextInt();
                    System.out.print("Введите новое название книги: ");
                    space = sc.nextLine();
                    title = sc.nextLine();
                    System.out.print("Введите жанр новой книги: ");
                    genre = sc.nextLine();
                    library.editBook(id, title, genre);
                    break;

                default:
                    System.out.println("Ошибка ввода операции.");
            }
            System.out.println();
        }
    }
}
