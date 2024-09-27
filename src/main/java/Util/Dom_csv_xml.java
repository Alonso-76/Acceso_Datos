package Util;

import Model.Estacion;
import Model.Estaciones;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dom_csv_xml {

    public static final String ESTACIONES_CSV = "src/main/resources/listado_estaciones.csv";
    public static final String ESTACIONES_XML = "src/main/resources/listado_estaciones_dom.xml";
    private static final String SEPARADOR = ";";

    public void crear() throws IOException, ParserConfigurationException, SAXException, TransformerException {

        BufferedReader br = new BufferedReader(new FileReader(ESTACIONES_CSV));

        // Leemos el CSV y añadimos cada estación a la clase Model.Estaciones.

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] campos = linea.split(SEPARADOR, -1);

            Estacion estacion = new Estacion(
                    campos[0],
                    campos[1],
                    campos[2],
                    campos[3],
                    campos[4],
                    campos[5],
                    campos[6],
                    campos[7],
                    campos[8],
                    campos[9],
                    campos[10],
                    campos[11]);
            Estaciones.add(estacion);
        }

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();
        Element estaciones = doc.createElement("Estaciones");
        doc.appendChild(estaciones);

        Estaciones.estaciones.forEach(estacion -> {
            Element nodoEstacion = doc.createElement("Estacion");
            nodoEstacion.setAttribute("Id", String.valueOf(estacion.getCodigo()));

            Element descripcion = doc.createElement("Descripcion");
            descripcion.appendChild(doc.createTextNode(estacion.getDescripcion()));
            nodoEstacion.appendChild(descripcion);

            Element latitud = doc.createElement("Latitud");
            latitud.appendChild(doc.createTextNode(estacion.getLatitud()));
            nodoEstacion.appendChild(latitud);

            Element longitud = doc.createElement("Longitud");
            longitud.appendChild(doc.createTextNode(estacion.getLongitud()));
            nodoEstacion.appendChild(longitud);

            Element direccion = doc.createElement("Direccion");
            direccion.appendChild(doc.createTextNode(estacion.getDireccion()));
            nodoEstacion.appendChild(direccion);

            Element codigoPostal = doc.createElement("Codigo_Postal");
            codigoPostal.appendChild(doc.createTextNode(String.valueOf(estacion.getCodigoPostal())));
            nodoEstacion.appendChild(codigoPostal);

            Element poblacion = doc.createElement("Poblacion");
            poblacion.appendChild(doc.createTextNode(estacion.getPoblacion()));
            nodoEstacion.appendChild(poblacion);

            Element provincia = doc.createElement("Provincia");
            provincia.appendChild(doc.createTextNode(estacion.getProvincia()));
            nodoEstacion.appendChild(provincia);

            Element pais = doc.createElement("Pais");
            pais.appendChild(doc.createTextNode(estacion.getPais()));
            nodoEstacion.appendChild(pais);

            Element cercanias = doc.createElement("Cercanias");
            cercanias.appendChild(doc.createTextNode(estacion.getCercanias()));
            nodoEstacion.appendChild(cercanias);

            Element feve = doc.createElement("Feve");
            feve.appendChild(doc.createTextNode(estacion.getFeve()));
            nodoEstacion.appendChild(feve);

            Element comun = doc.createElement("Comun");
            comun.appendChild(doc.createTextNode(estacion.getComun()));
            nodoEstacion.appendChild(comun);

            estaciones.appendChild(nodoEstacion);
        });

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "YES");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(ESTACIONES_XML));
        transformer.transform(source, result);

    }
}