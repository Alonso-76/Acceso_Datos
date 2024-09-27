package Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Model.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class Jaxb_csv_xml {

    private final String RUTA_XML = "src/main/resources/listado_estaciones_jaxb.xml";
    private final String RUTA_CSV = "src/main/resources/listado_estaciones.csv";

    public void crear() {
        BufferedReader br;
        String line;
        Estaciones_Jaxb estaciones = new Estaciones_Jaxb();
        ArrayList<Estacion_Jaxb> list = new ArrayList();

        try {
            br = new BufferedReader(new FileReader(RUTA_CSV));
            while ((line = br.readLine()) != null) {
                String[] value = line.split(";", -1);
                Estacion_Jaxb estacion = new Estacion_Jaxb();

                // Si hay un fallo al convertir el texto a númerico,
                // Añado el valor 0.
                try {
                    estacion.setCodigo(Integer.parseInt(value[0]));
                } catch (NumberFormatException exception) {
                    estacion.setCodigo(0);
                }
                estacion.setDescripcion(value[1]);
                estacion.setLatitud(value[2]);
                estacion.setLongitud(value[3]);
                estacion.setDireccion(value[4]);

                // Si hay un fallo al convertir el Código Postal, lo
                // añado con valor 0.
                try {
                    estacion.setCodigoPostal(Integer.parseInt(value[5]));
                } catch (NumberFormatException exception) {
                    estacion.setCodigoPostal(0);
                }

                estacion.setPoblacion(value[6]);
                estacion.setProvincia(value[7]);
                estacion.setPais(value[8]);
                estacion.setCercanias(value[9]);
                estacion.setFeve(value[10]);
                estacion.setComun(value[11]);
                list.add(estacion);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        // Añade la estacion a la Lista.
        estaciones.setListEstacion(list);

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Estaciones_Jaxb.class);
            javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(estaciones, new File(RUTA_XML));
            jaxbMarshaller.marshal(estaciones, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}