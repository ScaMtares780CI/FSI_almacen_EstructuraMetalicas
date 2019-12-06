package Datos;

import Clases.Usuario;
import java.util.ArrayList;

public class daoUsuarios {

    private ArrayList<Usuario> lstUsuario;
    private static daoUsuarios _instancia = null;

    private daoUsuarios() {
        lstUsuario = new ArrayList<>();
        Usuario U1 = new Usuario(1, "admin", "admin", "administrador de sistema", "Administador de sistema");
        Usuario U2 = new Usuario(2, "ventas", "ventas", "Vendedor", "ventas");
        Usuario U3 = new Usuario(3, "taller", "taller", "Constructor", "taller");
        lstUsuario.add(U1);
        lstUsuario.add(U2);
        lstUsuario.add(U3);
    }

    public static daoUsuarios instancia() {
        if (_instancia == null) {
            _instancia = new daoUsuarios();
        }
        return _instancia;
    }

    public boolean agregarUsuario(Usuario U) {
        if (U != null) {
            return lstUsuario.add(U);
        } else {
            return false;
        }
    }

    public Usuario buscarUsuario(int DNI) {
        Usuario aux = null;
        boolean encontrado = false;
        for (int i = 0; i < lstUsuario.size() && !encontrado; i++) {
            Usuario U = lstUsuario.get(i);
            if (U.getDNI() == DNI) {
                aux = U;
                encontrado = true;
            }
        }
        return aux;
    }

    public boolean eliminarUsuario(int DNI) {
        boolean borrado = false;
        for (int i = 0; i < lstUsuario.size() && !borrado; i++) {
            Usuario U = lstUsuario.get(i);
            if (U.getDNI() == DNI) {
                lstUsuario.remove(i);
                borrado = true;
            }
        }
        return borrado;
    }

    public Usuario login(String usuario, String clave) {
        if (lstUsuario.isEmpty()) {
            return null;
        }

        Usuario aux = null;
        boolean encontrado = false;
        for (int i = 0; i < lstUsuario.size() && !encontrado; i++) {
            Usuario U = lstUsuario.get(i);
            if (U.getUsuario().equalsIgnoreCase(usuario) && U.getClave().equalsIgnoreCase(clave)) {
                aux = U;
                encontrado = true;
            }
        }
        return aux;
    }
}
