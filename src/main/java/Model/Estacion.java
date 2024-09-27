package Model;

public class Estacion {
    // CODIGO;DESCRIPCION;LATITUD;LONGITUD;DIRECION;CP;POBLACION;PROVINCIA;PAIS;CERCANIAS;FEVE;COMUN
    String codigo;
    String descripcion;
    String latitud;
    String longitud;
    String direccion;
    String codigoPostal;
    String poblacion;
    String provincia;
    String pais;
    String cercanias;
    String feve;
    String comun;

    public Estacion() {
    }

    public Estacion(String codigo, String descripcion, String latitud, String longitud, String direccion, String codigoPostal, String poblacion, String provincia, String pais, String cercanias, String feve, String comun) {
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
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
