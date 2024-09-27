import Util.Dom_csv_xml;
import Util.Jaxb_csv_xml;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException {
        Dom_csv_xml dom = new Dom_csv_xml();
        Jaxb_csv_xml jaxb = new Jaxb_csv_xml();

        dom.crear();
        System.out.println("Se ha creado con Dom el XML");
        jaxb.crear();
        System.out.println("Se ha creado con Jaxb el XML");
    }
}