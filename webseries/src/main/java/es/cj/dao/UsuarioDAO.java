package es.cj.dao;

import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public interface UsuarioDAO {
	public Usuario comprobarUsuario(String username, String password, Conexion c);

	public boolean existeUsername(String login, Conexion c);

	public boolean existeEmail(String email, Conexion c);
}
