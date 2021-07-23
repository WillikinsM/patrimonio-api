package com.will.integra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.integra.domain.Marca;
import com.will.integra.domain.Patrimonio;
import com.will.integra.repositories.MarcaRepository;

@Service
public class MarcaService {
	@Autowired
	private MarcaRepository repository;
	
	@Autowired
	private PatrimonioService patrimonioService;

	public Marca findById(Integer id) {
		Optional<Marca> obj = repository.findById(id);
		return obj.orElseThrow(null);
	}

	public List<Marca> findAll() {
		return repository.findAll();
	}
	
	public Marca create(Marca obj) {
		obj.setMarcaId(null);
		return repository.save(obj);
	}
	
	public Marca update(Integer id, Marca obj) {
		Marca obj1 = findById(id);
		obj1.setNome(obj.getNome());
		return repository.save(obj1);
	}
	
	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Marca create(Integer id_pat, Marca obj) {
		obj.setMarcaId(null);
		Patrimonio pat = patrimonioService.findById(id_pat);
		obj.setPatrimonio(pat);
		return repository.save(obj);
	}

}
