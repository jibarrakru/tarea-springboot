package com.cybeerking.api.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "productos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String descripcion;	
	private Double precio;
	private Integer cantidad;
	private String imagen;
	
	@ManyToOne
	private Usuario usuario;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}	

//	public Producto(Integer id, String nombre, String descripcion, Double precio, Integer cantidad, String imagen,
//			Usuario usuario) {
//		super();
//		this.id = id;
//		this.nombre = nombre;
//		this.descripcion = descripcion;
//		this.precio = precio;
//		this.cantidad = cantidad;
//		this.imagen = imagen;
//		this.usuario = usuario;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", cantidad=" + cantidad + ", imagen=" + imagen + "]";
	}	
	
}
