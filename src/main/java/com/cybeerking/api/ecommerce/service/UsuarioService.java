package com.cybeerking.api.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.cybeerking.api.ecommerce.model.Usuario;

public interface UsuarioService {
	
	public Usuario save(Usuario usuario);
	public Optional<Usuario> get(Integer id);
	public List<Usuario> getAll();
	public void update(Usuario usuario);
	public void delete(Integer id);
	
}
