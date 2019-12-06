package Clases;

import java.util.Date;

public class Pedido {

    public enum Estado {
        INGRESADO, EN_PROCESO, COMPLETADO
    }

    private Cliente cte;
    private int codigo;
    private Medida medida;
    private String material;
    private Estado estado;
    private Date fechaEntrega;

    public Pedido(Cliente cte, int codigo, Medida medida, String material, Estado estado, Date fechaEntrega) {
        this.cte = cte;
        this.codigo = codigo;
        this.medida = medida;
        this.material = material;
        this.estado = estado;
        this.fechaEntrega = fechaEntrega;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setMedida(Medida medida) {
        this.medida = medida;
    }

    public void setCte(Cliente cte) {
        this.cte = cte;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Cliente getCte() {
        return cte;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cte;
    }

    public void setCliente(Cliente cte) {
        this.cte = cte;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public String getMaterial() {
        return material;
    }

    public Medida getMedida() {
        return medida;
    }

}
