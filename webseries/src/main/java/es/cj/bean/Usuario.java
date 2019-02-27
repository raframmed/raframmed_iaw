package es.cj.bean;

import java.io.Serializable;

public class Usuario implements Serializable{
	int idUsuario;
	String username;
	String email;
	String password;

	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, String username, String email, String password) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
		this.email = email;
		this.password = password;

	}
	
	public Usuario(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public int getidUsuario() {
		return idUsuario;
	}

	public void setidUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", username=" + username + ", email=" + email + ", password="
				+ password + "]";
	}
	
}
