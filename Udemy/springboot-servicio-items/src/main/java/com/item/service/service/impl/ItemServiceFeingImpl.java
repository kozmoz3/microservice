package com.item.service.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.service.cliente.ProductoClienteRest;
import com.item.service.model.Item;
import com.item.service.model.Producto;
import com.item.service.service.ItemService;

@Service("itemServiceFeingImpl")
public class ItemServiceFeingImpl  implements ItemService{

	@Autowired
	ProductoClienteRest cliente;
	
	@Override
	public List<Item> findAll() {
		return cliente.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return null;// new Item(cliente.detalle(id), cantidad);
	}

}
