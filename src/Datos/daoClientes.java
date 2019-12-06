/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Gerardo
 */
public class daoClientes {

    private static daoClientes _instance;
    private ArrayList<Cliente> lstCliente;

    private daoClientes() {
        lstCliente = new ArrayList<>();
        Cliente C = new Cliente(11111111, "Cliente Ejemplo");
        lstCliente.add(C);
    }

    public static daoClientes instancia() {
        if (_instance == null) {
            _instance = new daoClientes();
        }
        return _instance;
    }

    public boolean agregarCliente(Cliente C) {
        if (C != null) {
            lstCliente.add(C);
            return true;
        } else {
            return false;
        }
    }

    public Cliente buscarCliente(int documentoIdentidad) {
        Cliente aux = null;
        boolean encontrado = false;
        for (int i = 0; i < lstCliente.size() && !encontrado; i++) {
            Cliente C = lstCliente.get(i);
            if (C.getDocumentoDeIdentidad() == documentoIdentidad) {
                aux = C;
                encontrado = true;
            }
        }

        return aux;
    }

    public ArrayList<Cliente> obtenerClientes() {
        return lstCliente;
    }

    public boolean eliminar(int dniSeleccionado) {
        boolean eliminado = false;
        for (int i = 0; i < lstCliente.size() && !eliminado; i++) {
            Cliente C = lstCliente.get(i);
            if (C.getDocumentoDeIdentidad() == dniSeleccionado) {
                lstCliente.remove(i);
                eliminado = true;
            }
        }
        return eliminado;
    }

    public boolean existeCliente(int dni) {
        if (lstCliente.size() == 0) {
            return false;
        }

        boolean existe = false;

        for (int i = 0; i < lstCliente.size() && !existe; i++) {
            Cliente C = lstCliente.get(i);
            if (C.getDocumentoDeIdentidad() == dni) {
                existe = true;
            }
        }
        return existe;
    }
}
