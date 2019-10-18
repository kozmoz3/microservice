package com.item.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.item.service.model.Item;

@Service
public interface ItemService {
	
 public List<Item> findAll();
 
 public Item findById(Long id, Integer cantidad);
}
