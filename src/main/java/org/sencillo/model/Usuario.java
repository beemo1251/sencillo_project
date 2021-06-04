package org.sencillo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tb_usuario")
public class Usuario {
	@Id
	@Column(name="id_usuario")
	private int codUsuario;
	
	@Column(name="email_usuario")
	private String email;
	
	@Column(name="contraseña")
	private String password;
	
	@Column(name="id_tipo_usuario")
	private int idTipoUsuario;

	@Override
	public String toString() {
		return "Usuario [codUsuario=" + codUsuario + ", email=" + email + ", password=" + password + ", idTipoUsuario="
				+ idTipoUsuario + "]";
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
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

	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	
	
}
