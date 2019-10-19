package com.item.service.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.item.service.model.Item;
import com.item.service.model.Producto;
import com.item.service.service.ItemService;

@Service("itemServiceImpl")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Item> findAll() {
		
		/*List<Producto> listProducto = Arrays
				.asList(clienteRest.getForObject("http://localhost:8001/listar", Producto[].class));
	*/
		List<Producto> listProducto = Arrays
				.asList(clienteRest.getForObject("http://servicio-productos/listar", Producto[].class));
	
		return listProducto.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		Map<String, String> pathVariable = new HashMap<String, String>();
		pathVariable.put("id", id.toString());
		Producto producto = clienteRest.getForObject("http://servicio-productos/ver/{id}", Producto.class, pathVariable);
		
		return new Item(producto, cantidad);
	}

}
