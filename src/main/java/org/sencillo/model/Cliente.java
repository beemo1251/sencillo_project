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
}
