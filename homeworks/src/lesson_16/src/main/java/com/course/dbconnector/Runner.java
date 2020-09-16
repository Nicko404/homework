package com.course.dbconnector;

import com.course.dbconnector.model.Author;
import com.course.dbconnector.model.Book;
import com.course.dbconnector.model.Genre;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            System.out.println("Ошибка загрузки драйвера");
        }

        try(Connection con = DriverManager
                .getConnection(
                        "jdbc:mysql://localhost:3306/library?useUnicode=true&&serverTimezone=UTC&characterEncoding=UTF-8",
                "library",
                "password")) {

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from book");

            List<Book> books = new ArrayList<>();

            while (rs.next()) {
                Long bookId = rs.getLong("id");
                String title = rs.getString("title");
                Long authorId = rs.getLong("author_id");
                Long genreId = rs.getLong("genre_id");

                Statement st = con.createStatement();
                ResultSet resultSet = st.executeQuery("select * from author where id=" + authorId);
                resultSet.next();
                Author author = new Author();
                author.setName(resultSet.getString("name"));
                author.setId(authorId);

                st = con.createStatement();
                resultSet = st.executeQuery("select * from genre where id=" + genreId);
                resultSet.next();
                Genre genre = new Genre();
                genre.setName(resultSet.getString("name"));
                genre.setId(genreId);

                Book book = new Book();
                book.setId(bookId);
                book.setTitle(title);
                book.setAuthor(author);
                book.setGenre(genre);

                books.add(book);

            }

            for (Book b :books) {
                System.out.println(b);
            }



        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Ошибка подключения к Базе Данных");
        }

    }
}
