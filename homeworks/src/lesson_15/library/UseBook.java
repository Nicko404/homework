package lesson_15.library;

import java.util.ArrayList;

class UseBook extends Thread {
    public String name;
    ArrayList<Book> books;
    public String bookName;
    public boolean onlyReadingRoom;

    UseBook(String name, ArrayList<Book> books, String bookName, boolean onlyReadingRoom) {
        super();
        this.name = name;
        this.books = new ArrayList<>(books);
        this.bookName = bookName;
        this.onlyReadingRoom = onlyReadingRoom;
    }

    @Override
    public void run() {

        Thread.currentThread().setName(name);
        System.out.println("Клиент " + Thread.currentThread().getName() + " хочет взять книгу \"" + bookName +
                "\".\nВ читальный зал: " + onlyReadingRoom + "\n");

        boolean bookInList = false;

        for (Book bk : books) {
            if (bk.getTitle().equals(bookName)) {
                if (!bk.isOnlyReadingRoom()) {
                    Book booksClient = new Book(bk);
                    System.out.println("Дали на руки клиенту книгу " + Thread.currentThread().getName() + "\n");
                    bookInList = true;
                    break;
                } else if (bk.isOnlyReadingRoom() && onlyReadingRoom) {
                    Book booksClient = new Book(bk);
                    System.out.printf("Дали клиенту %s книгу \"%s\" в читальный зал\n", name, bookName);
                    bookInList = true;
                    break;
                } else {
                    System.out.println("Для " + name + " книга \"" + bookName + "\" дальше читального зала уйти не может\n");
                    bookInList = true;
                    return;
                }

            }

        }

        if (!bookInList) {
            System.out.println("В библиотеке книга не найдена");
            return;
        }

        System.out.printf("Клиент %s читает книгу \"%s\" в читальном зале: %s\n", name, bookName, onlyReadingRoom);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Клиент %s вернул книгу \"%s\" в библиотеку\n", name, bookName);


    }
}
