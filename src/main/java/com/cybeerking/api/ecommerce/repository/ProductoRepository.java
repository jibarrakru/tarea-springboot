package com.cybeerking.api.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybeerking.api.ecommerce.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
