package com.cybeerking.api.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybeerking.api.ecommerce.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
