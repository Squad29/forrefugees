package com.forRefugees.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forRefugees.Repository.RefugiadosRepository;
import com.forRefugees.dto.RefugiadosDTO;
import com.forRefugees.model.Refugiados;

@Service
public class RefugiadosService {
	
	@Autowired
	RefugiadosRepository repository;
	
	@Transactional(readOnly=true)
	public Page<RefugiadosDTO> findAllRefugi(Pageable pageable) {
		Page<Refugiados> ref = repository.findAll(pageable);
		Page<RefugiadosDTO> refDTO = ref.map( x -> new RefugiadosDTO(x));
		return refDTO;
	}
	
	@Transactional(readOnly=true)
	public RefugiadosDTO findRefugi(Long id) {
		Refugiados ref = repository.findById(id).get();
		RefugiadosDTO refDTO = new RefugiadosDTO(ref);
		return refDTO;
	}
	
	@Transactional
	public RefugiadosDTO saveRefugi(RefugiadosDTO refuge) {
		
		Refugiados ref = new Refugiados();
		
		ref.setNomeRefugiado(refuge.getNomeRefugiado());
		ref.setCpfRefugiado(refuge.getCpfRefugiado());
		ref.setDataNascimentoRefugiado(refuge.getDataNascimentoRefugiado());
		ref.setNacionalidadeRefugiado(refuge.getNacionalidadeRefugiado());
		ref.setEnderecoRefugiado(refuge.getEnderecoRefugiado());
		ref.setBairroRefugiado(refuge.getBairroRefugiado());
		ref.setCidadeRefugiado(refuge.getCidadeRefugiado());
		ref.setEstadoRefugiado(refuge.getEstadoRefugiado());
		ref.setProfissaoRefugiado(refuge.getProfissaoRefugiado());
		ref.setTelefoneRefugiado(refuge.getTelefoneRefugiado());
		ref.setValorHoraRefugiado(refuge.getValorHoraRefugiado());
		ref.setBioRefugiado(refuge.getBioRefugiado());

		repository.saveAndFlush(ref);
		RefugiadosDTO refDTO = new RefugiadosDTO(ref);
		return refDTO;
	}
	
	@Transactional
	public RefugiadosDTO UpdateRefugi(RefugiadosDTO refuge) {
		Refugiados ref = repository.findById(refuge.getId()).get();
		ref.setId(refuge.getId());
		ref.setNomeRefugiado(refuge.getNomeRefugiado());
		ref.setCpfRefugiado(refuge.getCpfRefugiado());
		ref.setDataNascimentoRefugiado(refuge.getDataNascimentoRefugiado());
		ref.setNacionalidadeRefugiado(refuge.getNacionalidadeRefugiado());
		ref.setEnderecoRefugiado(refuge.getEnderecoRefugiado());
		ref.setBairroRefugiado(refuge.getBairroRefugiado());
		ref.setCidadeRefugiado(refuge.getCidadeRefugiado());
		ref.setEstadoRefugiado(refuge.getEstadoRefugiado());
		ref.setProfissaoRefugiado(refuge.getProfissaoRefugiado());
		ref.setTelefoneRefugiado(refuge.getTelefoneRefugiado());
		ref.setValorHoraRefugiado(refuge.getValorHoraRefugiado());
		ref.setBioRefugiado(refuge.getBioRefugiado());
		ref.setDataCadastroRefugiados(refuge.getDataCadastroRefugiados());
		repository.saveAndFlush(ref);
		RefugiadosDTO refDTO = new RefugiadosDTO(ref);
		
		return refDTO;
	}	
	
	@Transactional
	public RefugiadosDTO DeleteRefuge(Long id) {
		Refugiados refuge = repository.findById(id).get();
		RefugiadosDTO ref = new RefugiadosDTO(refuge);
		repository.deleteById(id);
		return ref;
	}
}
