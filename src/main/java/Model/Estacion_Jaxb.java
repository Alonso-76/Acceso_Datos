package Model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Estacion_Jaxb")
@XmlAccessorType(XmlAccessType.FIELD)
public class Estacion_Jaxb {
    @XmlElement
    Integer codigo;

    @XmlElement(name="Descripcion")
    String descripcion;

    @XmlElement(name="Latitud")
    String latitud;

    @XmlElement(name="Longitud")
    String longitud;

    @XmlElement(name="Direccion")
    String direccion;

    @XmlElement(name="Codigo_Postal")
    Integer codigoPostal;

    @XmlElement(name="Poblacion")
    String poblacion;

    @XmlElement(name="Provincia")
    String provincia;

    @XmlElement(name="Pais")
    String pais;

    @XmlElement(name="Cercanias")
    String cercanias;

    @XmlElement(name="Feve")
    String feve;

    @XmlElement(name="Comun")
    String comun;

    public Estacion_Jaxb() {
    }

    public Estacion_Jaxb(Integer codigo, String descripcion, String latitud, String longitud, String direccion, Integer codigoPostal, String poblacion, String provincia, String pais, String cercanias, String feve, String comun) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.pais = pais;
        this.cercanias = cercanias;
        this.feve = feve;
        this.comun = comun;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCercanias() {
        return cercanias;
    }

    public void setCercanias(String cercanias) {
        this.cercanias = cercanias;
    }

    public String getFeve() {
        return feve;
    }

    public void setFeve(String feve) {
        this.feve = feve;
    }

    public String getComun() {
        return comun;
    }

    public void setComun(String comun) {
        this.comun = comun;
    }
}