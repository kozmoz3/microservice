package com.item.service.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.item.service.model.Producto;

@FeignClient(name="servicio-productos")
public interface ProductoClienteRestRibbon {

	@GetMapping("/listar")
	public List<Producto> listar();
	
	@GetMapping("/ver/{id}")
	public Optional<Producto> detalle(@PathVariable Long id);
}
