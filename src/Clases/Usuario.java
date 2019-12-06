package Clases;

public class Usuario {

    private int DNI;
    private String usuario;
    private String clave;
    private String nombre;
    private String puesto;

    public Usuario(int DNI, String usuario, String clave, String nombre, String puesto) {
        this.DNI = DNI;
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public String getClave() {
        return clave;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
