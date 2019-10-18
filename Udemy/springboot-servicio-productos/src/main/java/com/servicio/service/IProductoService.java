package com.servicio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.servicio.entity.Producto;

@Service
public interface IProductoService {

	List<Producto> findAll();
	
	Optional<Producto> findById(Long id);
}
