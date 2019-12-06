package Clases;

public class Cliente {

    private int documentoDeIdentidad;
    private String Nombre;

    public Cliente(int documentoDeIdentidad, String Nombre) {
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.Nombre = Nombre;
    }

    public int getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setDocumentoDeIdentidad(int documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
