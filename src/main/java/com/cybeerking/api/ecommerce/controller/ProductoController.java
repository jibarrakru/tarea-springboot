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

import com.cybeerking.api.ecommerce.model.Producto;
import com.cybeerking.api.ecommerce.model.Usuario;
import com.cybeerking.api.ecommerce.service.ProductoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	private ProductoService productoService;
	
	@PostMapping("ecommerce/productos")
	public Producto save(@RequestBody Producto producto) {
		LOGGER.info("Este es el objeto producto {}", producto);
//		Usuario usuario = new Usuario(1,"","","","","","","","");
//		producto.setUsuario(usuario);
		return productoService.save(producto);
	}
	
	@GetMapping("ecommerce/productos/{id}")
	public Optional<Producto> get(@PathVariable("id") Integer id) {
		return productoService.get(id);
	}
	
	@GetMapping("ecommerce/productos")
	public List<Producto> getAll() {
		return productoService.getAll();
	}
	
	@PutMapping("ecommerce/productos")
	public void update(@RequestBody Producto producto) {
		productoService.update(producto);
	}
	
	@DeleteMapping("ecommerce/productos/{id}")
	public void delete(@PathVariable("id") Integer id) {
		productoService.delete(id);
	}
		
}
