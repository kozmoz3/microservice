package com.servicio.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.entity.Producto;
import com.servicio.repository.ProductoRepository;
import com.servicio.service.IProductoService;

@Service
public class IProductoServiceImpl  implements IProductoService{

	@Autowired
	ProductoRepository producto;
	
	@Override
	public List<Producto> findAll() {
		List<Producto> listProducto = new ArrayList<Producto>();
		listProducto.add(new Producto(1L, "primer"));
		return producto.findAll();
	}

	@Override
	public Optional<Producto> findById(Long id) {
		return producto.findById(id);
	}

}
