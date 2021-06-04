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

	@Override
	public String toString() {
		return "Producto [codProducto=" + codProducto + ", descripcion=" + descripcion + ", marca=" + marca
				+ ", precio=" + precio + ", stock=" + stock + ", medida=" + medida + ", estado=" + estado
				+ ", idCategoria=" + idCategoria + "]";
	}

	public String getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
}
