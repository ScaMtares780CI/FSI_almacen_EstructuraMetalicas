/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Pedido;
import java.util.ArrayList;

/**
 *
 * @author Gerardo
 */
public class daoPedido {

    private static daoPedido _instance;
    private ArrayList<Pedido> lst;

    private daoPedido() {
        lst = new ArrayList<>();
    }

    public static daoPedido instancia() {
        if (_instance == null) {
            _instance = new daoPedido();
        }
        return _instance;
    }

    public int cantidad() {
        return lst.size();
    }

    public boolean agregarPedido(Pedido P) {
        if (P != null) {
            lst.add(P);
            return true;
        } else {
            return false;
        }
    }

    public int eliminar(int dniSeleccionado) {
        int contador = 0;
        for (int i = 0; i < lst.size(); i++) {
            Pedido P = lst.get(i);
            if (P.getCliente().getDocumentoDeIdentidad() == dniSeleccionado) {
                lst.remove(i);
                contador++;
            }
        }
        return contador;
    }

    public ArrayList<Pedido> listarPedidos() {
        return lst;
    }

    public Pedido obtener(int indice) {
        return lst.get(indice);
    }

    public void modificar(int indice, Pedido P) {
        lst.set(indice, P);
    }

    public void eliminarPorIndice(int indice) {
        lst.remove(indice);
    }
}
