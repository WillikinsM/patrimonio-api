package com.will.integra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.integra.domain.Usuario;
import com.will.integra.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario create(Usuario obj) {
		return repository.save(obj);
	}

	public Usuario update(Integer id, Usuario obj) {
		Usuario obj1 = findById(id);
		obj1.setNome(obj.getNome());
		obj1.setSenha(obj.getSenha());
		obj1.setEmail(obj1.getEmail());
		return repository.save(obj1);
	}
	
	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);

	}

}
