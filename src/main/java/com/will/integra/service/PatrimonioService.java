package com.will.integra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.integra.domain.Patrimonio;
import com.will.integra.repositories.PatrimonioRepository;

@Service
public class PatrimonioService {

	@Autowired
	private PatrimonioRepository repository;

	public Patrimonio findById(Integer id) {
		Optional<Patrimonio> obj = repository.findById(id);
		return obj.orElseThrow(null);
	}

	public List<Patrimonio> findAll() {
		return repository.findAll();
	}

	public Patrimonio create(Patrimonio obj) {
		obj.setNumeroTombo(null);
		return repository.save(obj);
	}

	public Patrimonio update(Integer id, Patrimonio newObj) {
		Patrimonio obj1 = findById(id);
		obj1.setNome(newObj.getNome());
		obj1.setDescricao(newObj.getDescricao());
		return repository.save(obj1);
	}

	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}
}
