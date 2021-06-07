package org.sencillo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tb_cliente")
public class Cliente {
	@Id
	@Column(name="dni_cliente")
	private String codCliente;
	
	@Column(name="nombre_cliente")
	private String nombre;
	
	@Column(name="apellido_cliente")
	private String apellido;
	
	@Column(name="direccion_cliente")
	private String direccion;
	
	@Column(name="fecha_nacimiento")
	private String fchNac;
	
	@Column(name="id_usuario")
	private int codUsuario;

	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", fchNac=" + fchNac + ", codUsuario=" + codUsuario + "]";
	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFchNac() {
		return fchNac;
	}

	public void setFchNac(String fchNac) {
		this.fchNac = fchNac;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	
	
}
