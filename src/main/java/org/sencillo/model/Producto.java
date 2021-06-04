package org.sencillo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tb_producto")
public class Producto {
	@Id
	@Column(name="id_producto")
	private String codProducto;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="medida")
	private String medida;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="id_categoria")
	private int idCategoria;
}
