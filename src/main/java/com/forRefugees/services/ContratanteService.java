package com.forRefugees.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forRefugees.Repository.ContratanteRepository;
import com.forRefugees.dto.ContratanteDTO;
import com.forRefugees.model.Contratante;

@Service
public class ContratanteService {
	
	@Autowired
	ContratanteRepository repository;
	
	@Transactional(readOnly=true)
	public Page<ContratanteDTO> findAllContratante(Pageable pageable) {
		Page<Contratante> con = repository.findAll(pageable);
		Page<ContratanteDTO> conDTO = con.map(x -> new ContratanteDTO(x));
		return conDTO;
	}
	
	@Transactional(readOnly=true)
	public ContratanteDTO findReContratante(Long id) {
		
		Contratante con = repository.findById(id).get();
		ContratanteDTO conDTO = new ContratanteDTO(con);
		return conDTO;
	}
	
	@Transactional
	public ContratanteDTO saveContratante(ContratanteDTO refuge) {
		
		Contratante con = new Contratante();
		con.setNomeContratante(refuge.getNomeContratante());
		con.setCpfContratante(refuge.getCpfContratante());
		con.setCnpjContratante(refuge.getCnpjContratante());
		con.setEnderecoContratante(refuge.getEnderecoContratante());
		con.setBairroContratante(refuge.getBairroContratante());
		con.setCidadeContratante(refuge.getCidadeContratante());
		con.setEstadoContratante(refuge.getEstadoContratante());
		con.setSeguimentoContratante(refuge.getSeguimentoContratante());
		con.setTelefoneContratante(refuge.getTelefoneContratante());
		con.setEmailContratante(refuge.getEmailContratante());
		con.setValorHoraContratante(refuge.getValorHoraContratante());
		con.setBioContratante(refuge.getBioContratante());		
		repository.saveAndFlush(con);
		
		ContratanteDTO conDTO = new ContratanteDTO(con);
		return conDTO;
	}
	
	@Transactional
	public ContratanteDTO UpdateContratante(ContratanteDTO refuge) {
		
		Contratante con = repository.findById(refuge.getId()).get();
		con.setNomeContratante(refuge.getNomeContratante());
		con.setCpfContratante(refuge.getCpfContratante());
		con.setCnpjContratante(refuge.getCnpjContratante());
		con.setEnderecoContratante(refuge.getEnderecoContratante());
		con.setBairroContratante(refuge.getBairroContratante());
		con.setCidadeContratante(refuge.getCidadeContratante());
		con.setEstadoContratante(refuge.getEstadoContratante());
		con.setSeguimentoContratante(refuge.getSeguimentoContratante());
		con.setTelefoneContratante(refuge.getTelefoneContratante());
		con.setEmailContratante(refuge.getEmailContratante());
		con.setValorHoraContratante(refuge.getValorHoraContratante());
		con.setBioContratante(refuge.getBioContratante());		
		repository.saveAndFlush(con);

		ContratanteDTO refDTO = new ContratanteDTO(con);
		return refDTO;
	}	
	
	@Transactional
	public ContratanteDTO DeleteContratante(Long id) {
		Contratante contra = repository.findById(id).get();
		repository.deleteById(id);
		ContratanteDTO conDTO = new ContratanteDTO(contra);
		return conDTO;
	}
}
