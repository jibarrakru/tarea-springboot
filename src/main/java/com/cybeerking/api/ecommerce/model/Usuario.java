package com.cybeerking.api.ecommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombres;
	private String apellidos;
	private String cedula;
	private String direccion;
	private String telefono;
	private String perfil;
	private String email;
	private String password;
	
	@OneToMany(mappedBy = "usuario")
	private List<Producto> productos;	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}	

	public Usuario(Integer id, String nombres, String apellidos, String cedula, String direccion, String telefono,
			String perfil, String email, String password) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.direccion = direccion;
		this.telefono = telefono;
		this.perfil = perfil;
		this.email = email;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
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

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", cedula=" + cedula
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", perfil=" + perfil + "]";
	}	
	
}
