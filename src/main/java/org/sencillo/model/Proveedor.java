package org.sencillo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tb_proveedor")
public class Proveedor {
	@Id
	@Column(name="ruc_proveedor")
	private String rucProv;
	
	@Column(name="nombre_proveedor")
	private String nombre;
	
	@Column(name="direccion_proveedor")
	private String direccion;
	
	@Column(name="telefono_proveedor")
	private String telefono;
	
	@Column(name="email_proveedor")
	private String email;
	
	@Column(name="estado")
	private String estado;
	

}
