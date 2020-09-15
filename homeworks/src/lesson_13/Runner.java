package lesson_13;

import org.xml.sax.SAXException;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {

        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File("src/lesson_13/files/Schema.xsd"));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File("src/lesson_13/files/device.xml")));
            System.out.println("XML file is validate");

        } catch (SAXException e) {
            System.out.println("File not validate");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
