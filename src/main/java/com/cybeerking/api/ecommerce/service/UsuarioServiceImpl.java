package com.cybeerking.api.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybeerking.api.ecommerce.model.Usuario;
import com.cybeerking.api.ecommerce.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);		
	}

	@Override
	public Optional<Usuario> get(Integer id) {
		return usuarioRepository.findById(id);
	}
	
	@Override
	public List<Usuario> getAll() {		
		return usuarioRepository.findAll();
	}

	@Override
	public void update(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public void delete(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
}
