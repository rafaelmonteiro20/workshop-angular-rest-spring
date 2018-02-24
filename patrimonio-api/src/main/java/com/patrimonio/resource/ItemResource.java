package com.patrimonio.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patrimonio.model.Item;
import com.patrimonio.repository.ItemRepository;

@RestController
@RequestMapping("/itens")
public class ItemResource {

	@Autowired
	private ItemRepository repository;
	
	@GetMapping
	public List<Item> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	public Item criar(@RequestBody @Valid Item item) {
		return repository.save(item);
	}
	
}