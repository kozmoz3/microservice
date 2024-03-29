package com.item.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.item.service.model.Item;
import com.item.service.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	@Qualifier("itemServiceFeingImpl")
	ItemService itemService;
	
	@GetMapping("/listar")
	public List<Item>listarItem(){
		return itemService.findAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.findById(id, cantidad);
	}
}
