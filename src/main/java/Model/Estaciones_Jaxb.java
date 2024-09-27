package Model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="Estaciones_Jaxb")
@XmlAccessorType(XmlAccessType.FIELD)
public class Estaciones_Jaxb {
    @XmlElement(name="Estacion_Jaxb")
    private List<Estacion_Jaxb> listEstacion = null;

    public List<Estacion_Jaxb> getListEstacion() {return listEstacion;}
    public void setListEstacion(List<Estacion_Jaxb> listEstacion) {this.listEstacion = listEstacion;}
}
