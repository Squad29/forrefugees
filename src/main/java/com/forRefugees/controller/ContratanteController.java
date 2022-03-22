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

import com.forRefugees.dto.ContratanteDTO;
import com.forRefugees.dto.RefugiadosDTO;
import com.forRefugees.services.ContratanteService;

@RestController
@RequestMapping("/contratante")
@CrossOrigin(origins = "*")
public class ContratanteController {

	@Autowired
	ContratanteService services;
	
	@GetMapping
	public Page<ContratanteDTO> findAllContratantes(Pageable pageable) {
		return services.findAllContratante(pageable);
	}
	
	@GetMapping("/{id}")
	public ContratanteDTO findContratante(@PathVariable Long id) {
		return services.findReContratante(id);
	}
	
	@PostMapping
	public ContratanteDTO PostContratantes(@RequestBody ContratanteDTO refuge) {
		return services.saveContratante(refuge);
	}
	
	@PutMapping("/")
	public ContratanteDTO UpdateContratantes(@RequestBody ContratanteDTO refuge) {
		return services.UpdateContratante(refuge);
	}
	
	@DeleteMapping("/{id}")
	public ContratanteDTO DeleteContratante(@PathVariable Long id) {
		return services.DeleteContratante(id);
	}
}
