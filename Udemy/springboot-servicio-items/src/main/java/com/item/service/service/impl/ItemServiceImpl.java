package com.item.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.item.service.model.Item;
import com.item.service.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		// TODO Auto-generated method stub
		return null;
	}

}
