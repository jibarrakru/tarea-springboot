package com.cybeerking.api.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybeerking.api.ecommerce.model.Usuario;
import com.cybeerking.api.ecommerce.service.UsuarioService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("ecommerce/usuarios")
	public Usuario save(@RequestBody Usuario usuario) {
		LOGGER.info("Este es el objeto usuario {}", usuario);
		return usuarioService.save(usuario);
	}
	
	@GetMapping("ecommerce/usuarios/{id}")
	public Optional<Usuario> get(@PathVariable("id") Integer id) {
		return usuarioService.get(id);
	}
	
	@GetMapping("ecommerce/usuarios")
	public List<Usuario> getAll() {
		return usuarioService.getAll();
	}
	
	@PutMapping("ecommerce/usuarios")
	public void update(@RequestBody Usuario usuario) {
		usuarioService.update(usuario);
	}
	
	@DeleteMapping("ecommerce/usuarios/{id}")
	public void delete(@PathVariable("id") Integer id) {
		usuarioService.delete(id);
	}
		
}
