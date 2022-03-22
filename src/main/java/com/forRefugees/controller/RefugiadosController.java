package com.forRefugees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forRefugees.dto.RefugiadosDTO;
import com.forRefugees.services.RefugiadosService;

@RestController
@RequestMapping("/refugiados")
@CrossOrigin(origins = "*")
public class RefugiadosController {

	@Autowired
	RefugiadosService services;
	
	@GetMapping
	public Page<RefugiadosDTO> findAllRefuges(Pageable pageable) {
		return services.findAllRefugi(pageable);
	}
	
	@GetMapping("/{id}")
	public RefugiadosDTO findRefuges(@PathVariable Long id) {
		return services.findRefugi(id);
	}
	
	@PostMapping
	public RefugiadosDTO findRefuges(@RequestBody RefugiadosDTO refuge) {
		return services.saveRefugi(refuge);
	}
	
	@PutMapping("/")
	public RefugiadosDTO UpdateRefuge(@RequestBody RefugiadosDTO refuge) {
		return services.UpdateRefugi(refuge);
	}
	
	@DeleteMapping("/{id}")
	public RefugiadosDTO DeletRefuge(@PathVariable Long id) {
		return services.DeleteRefuge(id);
	}
}
