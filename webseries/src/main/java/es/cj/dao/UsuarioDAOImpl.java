package es.cj.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	private String passBD = "PasswdSSO2019";

	public Usuario comprobarUsuario(String username, String password, Conexion c) {
		Usuario usu = null;

		String consulta = "SELECT * FROM usuarios WHERE username = ? AND password = AES_ENCRYPT(?,?)";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(consulta);
			sentencia.setString(1, username);
			sentencia.setString(2, password);
			sentencia.setString(3, passBD);
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				usu = new Usuario(resultado.getInt("idUsuario"), resultado.getString("username"),
						resultado.getString("email"), resultado.getString("password"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usu;
	}

	public boolean existeUsername(String username, Conexion c) {
		boolean existe = false;

		String sql = "select * from usuarios where username=?";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(sql);
			sentencia.setString(1, username);
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				existe = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return existe;
	}

	public boolean existeEmail(String email, Conexion c) {
		boolean existe = false;

		String sql = "select * from usuarios where email=?";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(sql);
			sentencia.setString(1, email);
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				existe = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return existe;
	}

	public int insertar(Usuario usuario, Conexion c) {
		int filas = 0;

		String sql = "INSERT INTO usuarios VALUES (null, ?, ?, AES_ENCRYPT(?, ?))";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(sql);
			sentencia.setString(1, usuario.getUsername());
			sentencia.setString(2, usuario.getEmail());
			sentencia.setString(3, usuario.getPassword());
			sentencia.setString(4, passBD);

			filas = sentencia.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

}
