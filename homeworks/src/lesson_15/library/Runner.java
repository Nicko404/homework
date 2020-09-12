package lesson_15.library;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        boolean b = testXMLFile(
                "src/lesson_15/library/files/Books.xml",
                "src/lesson_15/library/files/Books.xsd");

        System.out.println("File is validate: " + b + "\n");

        ArrayList<Book> books = new ArrayList<>(ListBooks());


       Thread client1 = new UseBook("Vasya", books, "Мастер и Маргарита", true);
       Thread client2 = new UseBook("Genna", books, "Мотылек", true);
       Thread client3 = new UseBook("Kate", books, "Мотылек", false);


       client1.start();
       client2.start();
       client3.start();

        try {
            client1.join();
            client2.join();
            client3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nБиблиотека закрыта.");

    }



    private static boolean testXMLFile(String fileXML, String fileXSD) {
        try{
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(fileXSD));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(fileXML)));
            return true;
        } catch (SAXException e) {
            System.out.println("File not validate");
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return false;
    }

    private static ArrayList<Book> ListBooks()
    {

        ArrayList<Book> books = new ArrayList<>();

        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("src/lesson_15/library/files/Books.xml");

            String title = null;
            String author = null;
            String genre = null;
            String description = null;
            boolean onlyReadingRoom = false;

            Node root = document.getDocumentElement();//получаем первую корневую ноду <books>
            NodeList nodesBooks = root.getChildNodes();//получаем список дочерних элементов корневой ноды<book>-и

            for (int i = 0; i < nodesBooks.getLength(); i++) {//проходимся по этим дочерним нодам

                Node book = nodesBooks.item(i);//получаем ноду книги

                if (book.getNodeType() != Node.TEXT_NODE) {//т.к. это комплекный тип, создаем список дочерних элементов

                    NodeList elementsBook = book.getChildNodes();

                    for (int j = 0; j < elementsBook.getLength(); j++) {

                        Node elementsValue = elementsBook.item(j);//получаем ноду дочернего элемента книги

                        if (elementsValue.getNodeName().equals("title")) {
                            title = elementsValue.getTextContent();
                        } else if (elementsValue.getNodeName().equals("author")) {
                            author = elementsValue.getTextContent();
                        } else if (elementsValue.getNodeName().equals("genre")) {
                            genre = elementsValue.getTextContent();
                        } else if (elementsValue.getNodeName().equals("description")) {
                            description = elementsValue.getTextContent();
                        } else if (elementsValue.getNodeName().equals("onlyReadingRoom")) {
                            onlyReadingRoom = Boolean.parseBoolean(elementsValue.getTextContent());
                        }
                    }
                    books.add(new Book(title, author, genre, description, onlyReadingRoom));
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }


        return books;
    }
}
